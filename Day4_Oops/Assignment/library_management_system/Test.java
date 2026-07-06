package com.coforge.day4_java.Assignment.library_management_system;

public class Test {
	public static void main(String[] args) {
		Library library = new Library();
		library.addBook(new Book(101,"Habits"));
		library.addBook(new Book(102,"Advencture"));
		
		library.searchBook("Habits");
		
		Member neeraj = new Member(1, "Neeraj");
		library.issueBook(101, neeraj);
		
		Member kumar = new Member(1, "Kumar");
		library.issueBook(101, kumar);
		
		library.returnBook(101);
		
		library.issueBook(101, kumar);
	}
}
