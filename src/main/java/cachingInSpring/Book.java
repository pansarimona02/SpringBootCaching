package cachingInSpring;

public class Book {
	private String isbl;
	private String title;
	public String getIsbl() {
		return isbl;
	}
	public void setIsbl(String isbl) {
		this.isbl = isbl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Book [isbl=" + isbl + ", title=" + title + "]";
	}
	public Book(String isbl, String title) {
		super();
		this.isbl = isbl;
		this.title = title;
	}
	

}
