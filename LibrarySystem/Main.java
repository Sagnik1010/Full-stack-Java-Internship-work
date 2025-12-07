import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. View Books");
            System.out.println("4. View Members");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author));
                }
                case 2 -> {
                    System.out.print("Enter Member ID: ");
                    int mId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Member Name: ");
                    String name = sc.nextLine();
                    library.addMember(new Member(mId, name));
                }
                case 3 -> library.viewBooks();
                case 4 -> library.viewMembers();
                case 5 -> {
                    System.out.print("Enter Book ID to Issue: ");
                    int bid = sc.nextInt();
                    library.issueBook(bid);
                }
                case 6 -> {
                    System.out.print("Enter Book ID to Return: ");
                    int rid = sc.nextInt();
                    library.returnBook(rid);
                }
                case 7 -> {
                    System.out.println("Exiting... Thank You!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Input!");
            }
        }
    }
}
