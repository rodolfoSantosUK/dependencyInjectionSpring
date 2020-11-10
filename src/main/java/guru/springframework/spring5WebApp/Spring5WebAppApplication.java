package guru.springframework.spring5WebApp;

import guru.springframework.controllers.I18nController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"guru.*"})
@ComponentScan({"guru.*"})
@EnableJpaRepositories("guru.springframework.repositories")
public class Spring5WebAppApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring5WebAppApplication.class, args);

       // O código abaixo serve para testar o uso do profile
       // I18nController i18nController = (I18nController) ctx.getBean("i18nController");
       // String greetincI18n = i18nController.sayHello();

		System.out.println(" greetincI18n " +  greetincI18n);

        guru.springframework.controllers.MyController myController = (guru.springframework.controllers.MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("------ Property");
        guru.springframework.controllers.PropertyInjectedController propertyInjectedController = (guru.springframework.controllers.PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--------- Setter");
        guru.springframework.controllers.SetterInjectedController setterInjectedController = (guru.springframework.controllers.SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-------- Constructor");
        guru.springframework.controllers.ConstructorInjectedController constructorInjectedController = (guru.springframework.controllers.ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }
}
