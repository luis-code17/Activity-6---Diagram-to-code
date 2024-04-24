package activity6;

import java.util.ArrayList;

public class Book {
	private String title;
    private ArrayList<Page> pages;
    
    public Book(String title) {
        this.setTitle(title);
        this.setPages(new ArrayList<>());
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<Page> getPages() {
		return pages;
	}

	public void setPages(ArrayList<Page> pages) {
		this.pages = pages;
	}
	

}
