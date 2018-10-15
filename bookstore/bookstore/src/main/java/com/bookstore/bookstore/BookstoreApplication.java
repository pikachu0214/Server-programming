package com.bookstore.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.bookstore.bookstore.domain.Book;
import com.bookstore.bookstore.domain.BookRepository;
import com.bookstore.bookstore.domain.Category;
import com.bookstore.bookstore.domain.CategoryRepository;



@SpringBootApplication
public class BookstoreApplication {
	@Autowired
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}	
	@Bean
	public CommandLineRunner bookDemo(BookRepository srepository, CategoryRepository drepository) {
		return (args) -> {
			log.info("save a couple of books");
			drepository.save(new Category("Horror"));
			drepository.save(new Category("Drama"));
			drepository.save(new Category("Law"));
			
			srepository.save(new Book("Book", "Michael Jordan", 2007, "123456789", 50, drepository.findByName("Horror").get(0)));
			srepository.save(new Book("Book2", "Kobe Bryant", 2007, "987654321", 50, drepository.findByName("Drama").get(0)));
			srepository.save(new Book("Book3", "Lebron James", 2007, "111222333", 50, drepository.findByName("Law").get(0)));	

			log.info("fetch all books");
			for (Book book : srepository.findAll()) {
				log.info(book.toString());
			}

		};
	}
}
