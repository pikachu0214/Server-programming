package com.bookstore.bookstore.domain;
import javax.persistence.Entity;	
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
		@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long id;
	 	private String isbn;
	    private int price;
	    private int year;
	    private String author;
	    private String title;
	    
	    
	    public Book() {}

		public Book(String title, String author, int year, String isbn, int price) {
			super();
			this.isbn = isbn;
			this.price = price;
			this.year = year;
			this.author = author;
			this.title = title;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}

		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", price=" + price + ", year=" + year + ", author=" + author + ", title="
					+ title + "]";
		}
		
}
