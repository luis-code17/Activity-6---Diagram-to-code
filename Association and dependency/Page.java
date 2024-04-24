package activity6;

public class Page {
	private int pageNumber;
	private String content;

	public Page(int pageNumber, String content) {
		this.setPageNumber(pageNumber);
		this.setContent(content);
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Page " + pageNumber + ": " + content;
	}

}
