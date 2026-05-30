import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Inventory Summary");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    Book newBook = new Book(id, title, author);

                    library.addBook(newBook);
                    break;

                case 2:

                    library.viewBooks();
                    break;

                case 3:

                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();

                    Book foundBook = library.searchBook(searchId);

                    if (foundBook != null) {
                        System.out.println("\nBook Found:");
                        System.out.println(foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID to Borrow: ");
                    int borrowId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Borrower Name: ");
                    String borrowerName = sc.nextLine();

                    library.borrowBook(borrowId, borrowerName);
                    break;

                case 5:

                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();

                    library.returnBook(returnId);
                    break;

                case 6:

                    System.out.print("Enter Book ID to Remove: ");
                    int removeId = sc.nextInt();

                    library.removeBook(removeId);
                    break;

                case 7:

                    library.showInventory();
                    break;

                case 8:

                    System.out.println("Thank you for using Library Management System!");
                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 8);

        sc.close();
    }
} 
