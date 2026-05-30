import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // View All Books
    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("\n===== BOOK LIST =====");

        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Search Book by ID
    public Book searchBook(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {
                return book;
            }
        }

        return null;
    }

    // Borrow Book
    public void borrowBook(int bookId, String borrowerName) {

        Book book = searchBook(bookId);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        if (book.isBorrowed()) {
            System.out.println("Book is already borrowed by "
                    + book.getBorrowerName());
            return;
        }

        book.borrowBook(borrowerName);

        System.out.println("Book borrowed successfully!");
    }

    // Return Book
    public void returnBook(int bookId) {

        Book book = searchBook(bookId);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        if (!book.isBorrowed()) {
            System.out.println("This book was not borrowed.");
            return;
        }

        book.returnBook();

        System.out.println("Book returned successfully!");
    }

    // Remove Book
    public void removeBook(int bookId) {

        Book book = searchBook(bookId);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        books.remove(book);

        System.out.println("Book removed successfully!");
    }

    // Inventory Summary
    public void showInventory() {

        int totalBooks = books.size();
        int borrowedBooks = 0;

        for (Book book : books) {

            if (book.isBorrowed()) {
                borrowedBooks++;
            }
        }

        int availableBooks = totalBooks - borrowedBooks;

        System.out.println("\n===== INVENTORY SUMMARY =====");
        System.out.println("Total Books      : " + totalBooks);
        System.out.println("Available Books  : " + availableBooks);
        System.out.println("Borrowed Books   : " + borrowedBooks);
    }
} 
