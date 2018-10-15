package com.bookstore.bookstore.BookController.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bookstore.bookstore.domain.Book;
import com.bookstore.bookstore.domain.BookRepository;
import com.bookstore.bookstore.domain.Category;
import com.bookstore.bookstore.domain.CategoryRepository;

@Controller
public class controller {
	@Autowired
	private BookRepository repository; 
	@Autowired
	private CategoryRepository drepository;
	
		// Show all students
    	@RequestMapping(value="/booklist")
    		public String bookList(Model model) {	
    		model.addAttribute("books", repository.findAll());
    			return "booklist";
    }
		// Add a book
		@RequestMapping(value = "/add")
	    	public String addBook(Model model){
	    		model.addAttribute("book", new Book());
				model.addAttribute("category", drepository.findAll());
	    			return "addbook";
	    }  		
		// Save a book and redirect back to booklist.html (automatically done)
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    	public String save(Book book){
	        	repository.save(book);
	        		return "redirect:booklist";
	    }    
		// delete a book and redirect page to booklist.html (automatically done)
	    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	    	public String deleteBook(@PathVariable("id") Long bookId, Model model) {
	    		repository.deleteById(bookId);
	    			return "redirect:../booklist";
	    }
		// edit a book, find by book id and category id then redirect to editbook.html
	    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    	public String editBook(@PathVariable("id") Long bookId,  Model model) {
	    	model.addAttribute("book", repository.findById(bookId));
	    	model.addAttribute("category", drepository.findAll());
    			return "editbook";
    }       
}