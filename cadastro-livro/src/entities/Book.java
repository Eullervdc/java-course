package entities;

public class Book {
	private String title;
	private String author;
	private int totalCopies;
	private int availableCopies;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public int getTotalCopies() {
		return totalCopies;
	}

	public int getAvailablesCopies() {
		return availableCopies;
	}

	public Book(String title, String author, int totalCopies) {
		this.title = title;
		this.author = author;
		this.totalCopies = totalCopies;
		this.availableCopies = totalCopies;
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.totalCopies = 1;
		this.availableCopies = totalCopies;
	}

	public void borrow(int quantity) {
		for (int i = 0; i < quantity; i++) {
			if (availableCopies == 0) {
				System.out.println("No copies available");
				return;
			}
			availableCopies--;
		}
	}

	public void giveBack(int quantity) {
		for (int i = 0; i < quantity; i++) {
			if (availableCopies < totalCopies) {
				availableCopies++;
			}
		}
	}

	public String toString() {
		return "'" + title + "'" + " by " + author + ", available: " + availableCopies + "/" + totalCopies;

	}

}
