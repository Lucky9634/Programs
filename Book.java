package Oops_Questions;

public class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static{
        totalNoOfBooks = 0;
    }

    {
        totalNoOfBooks++;
    }
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn) {
        this("Unknown", "Unknown", isbn);
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (this.isBorrowed) {
            System.out.println("Book Is Already Borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy The Book , " + this.title);
        }

    }

    void retunBook() {
        if (this.isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope You Enjoy It. Please Leave A Review");
        } else {
            System.out.println("This Book Already Available In Library.");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("Design","Kamal","001");
        Book myBook = new Book("Learning What Matter","Hasan","002");
        System.out.println(getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        myBook.retunBook();
        myBook.borrowBook();
    }
}
