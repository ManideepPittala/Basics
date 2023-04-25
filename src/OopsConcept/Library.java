package OopsConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int numCopies;

    public Book(String title, String author, int numCopies) {
        this.title = title;
        this.author = author;
        this.numCopies = numCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumCopies() {
        return numCopies;
    }
    

    public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}

	public void display() {
        System.out.println(title + " by " + author + ", " + numCopies + " copies available");
    }

    public void borrow() {
        if (numCopies > 0) {
            numCopies--;
            System.out.println("You have borrowed " + title);
        } else {
            System.out.println("Sorry, " + title + " is not available for borrowing");
        }
    }

    public void returnBook() {
        numCopies++;
        System.out.println("Thank you for returning " + title);
    }
}

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }
    public void displayBooks() {
        for (Book book : books) {
            book.display();
        }
    }


    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (book.getNumCopies() > 0) {
                    book.setNumCopies(book.getNumCopies() - 1);
                    System.out.println("You have borrowed the book: " + book.getTitle());
                    return;
                } else {
                    System.out.println("Sorry, there are no copies of " + title + " available to borrow.");
                    return;
                }
            }
        }
        System.out.println("Sorry, we do not have the book: " + title + " in our library.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setNumCopies(book.getNumCopies() + 1);
                System.out.println("You have returned the book: " + book.getTitle());
                return;
            }
        }
        System.out.println("Sorry,You have'nt return the book: " + title + " in to library.");
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 3));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 2));
        books.add(new Book("1984", "George Orwell", 4));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 5));
        books.add(new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 2));
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 3));
        books.add(new Book("Animal Farm", "George Orwell", 1));
        books.add(new Book("Brave New World", "Aldous Huxley", 4));
        books.add(new Book("Wuthering Heights", "Emily Bronte", 2));
        books.add(new Book("1984","Manideep",8));

        Library library = new Library(books);
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.println("Enter:-\n 'A' to display all books\n 'B' to borrow a book,\n 'R' to return a book,\n 'Q' to quit:");
            String input = scanner.nextLine();
            switch (input.toUpperCase()) {
                case "A":
                	System.out.println("Display All Books:");
                	library.displayBooks();
                	break;
                	
                case "B":
                    System.out.println("Enter the name of the book you want to borrow:");
                    String bookToBorrow = scanner.nextLine();
                    library.borrowBook(bookToBorrow);
                    break;
                case "R":
                    System.out.println("Enter the name of the book you want to return:");
                    String bookToReturn = scanner.nextLine();
                    library.returnBook(bookToReturn);
                    break;
                case "Q":
                	System.out.println("Exit from the Library...........");
                    done = true;
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }
}