package guru.springframework.bootstrap;

import guru.springframework.domain.Author;
import guru.springframework.domain.Book;
import guru.springframework.repositories.AuthorRepository;
import guru.springframework.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapDAta implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    public BootStrapDAta(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {



        System.out.println("Started in Bootstrap");


        Author eric = new Author("Eric", "Evans");
        Book book = new Book("Domain driver" , "43123412");
        eric.getBooks().add(book);
        book.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(book);


        Author rod = new Author("Rodolfo", "Johnson");
        Book noEJB = new Book("j2ee Development without EJB", "43123423");
        noEJB.getAuthors().add(rod);


        System.out.println("Started in Bootstrap");
        System.out.println("Numbers of books " + bookRepository.count());


    }
}
