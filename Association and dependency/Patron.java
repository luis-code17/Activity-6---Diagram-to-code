package activity6;

public class Patron {
	private String name;
    private Book borrowedBook;

    public Patron(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        this.borrowedBook = book;
        System.out.println(name + " borrowed " + book.getTitle());
    }

    public void returnBook() {
        if (borrowedBook != null) {
            System.out.println(name + " returned " + borrowedBook.getTitle());
            borrowedBook = null;
        } else {
            System.out.println(name + " has no book to return.");
        }
    }

    public void showBorrowedBook() {
        if (borrowedBook != null) {
            System.out.println(name + " has borrowed: " + borrowedBook);
        } else {
            System.out.println(name + " has no borrowed books.");
        }
    }
}

