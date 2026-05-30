import java.util.Scanner;
public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean isBorrowed;
    private String borrowerName;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
        this.borrowerName = "";
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void borrowBook(String borrowerName) {
        isBorrowed = true;
        this.borrowerName = borrowerName;
    }

    public void returnBook() {
        isBorrowed = false;
        borrowerName = "";
    }

    @Override
    public String toString() {

        String status;

        if(isBorrowed) {
            status = "Borrowed by " + borrowerName;
        }
        else {
            status = "Available";
        }

        return "Book ID: " + bookId +
               "\nTitle: " + title +
               "\nAuthor: " + author +
               "\nStatus: " + status +
               "\n----------------------";
    }
}