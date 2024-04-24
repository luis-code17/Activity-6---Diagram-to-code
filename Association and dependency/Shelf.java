package activity6;

import java.util.ArrayList;

public class Shelf {
	 private String name;
	    private ArrayList<Book> books;

	    public Shelf(String name) {
	        this.name = name;
	        this.books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	        System.out.println(book.getTitle() + " added to " + name);
	    }

	    public void removeBook(Book book) {
	        if (books.remove(book)) {
	            System.out.println(book.getTitle() + " removed from " + name);
	        } else {
	            System.out.println(book.getTitle() + " not found in " + name);
	        }
	    }

	    public void showBooks() {
	        System.out.println("Books on " + name + " shelf:");
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }
}
