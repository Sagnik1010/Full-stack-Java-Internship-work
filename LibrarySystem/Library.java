import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully!");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member Added Successfully!");
    }

    public void viewBooks() {
        System.out.println("\n📘 Book List:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void viewMembers() {
        System.out.println("\n👥 Member List:");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && !book.isIssued()) {
                book.issueBook();
                System.out.println("Book Issued Successfully!");
                return;
            }
        }
        System.out.println("Book Not Available or Already Issued");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && book.isIssued()) {
                book.returnBook();
                System.out.println("Book Returned Successfully!");
                return;
            }
        }
        System.out.println("Invalid Book ID or Book is Not Issued");
    }
}
