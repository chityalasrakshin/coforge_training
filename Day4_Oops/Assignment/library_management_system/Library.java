package com.coforge.day4_java.Assignment.library_management_system;
import java.util.*;;

public class Library {
	List<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void issueBook(int bookId, Member member) {
        for (Book b : books) {
            if (b.id == bookId && !b.isIssued) {
                b.isIssued = true;
                System.out.println(b.title + " issued to " + member.memberName);
                return;
            }
        }
        System.out.println("Book not available");
    }

    void returnBook(int bookId) {
    	for (Book b : books) {
            if (b.id == bookId && b.isIssued) {
                b.isIssued = false;
                System.out.println(b.title + " returned.");
                return;
            }
        }
    }

    void searchBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + b.title);
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
