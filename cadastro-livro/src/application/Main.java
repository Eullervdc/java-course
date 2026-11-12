package application;

import java.util.Scanner;

import entities.Book;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter title: ");
		String title = sc.nextLine();
		System.out.print("Enter author: ");
		String author = sc.nextLine();
		System.out.print("Inform number of copies (y/n)? ");
		char response = sc.next().charAt(0);

		Book book;
		if (response == 'y') {
			System.out.print("Enter number of copies: ");
			int totalCopies = sc.nextInt();
			book = new Book(title, author, totalCopies);
		} else {
			book = new Book(title, author);
		}

		System.out.println();
		System.out.println("Book data:");
		System.out.println(book);

		System.out.println();
		System.out.print("How many borrows? ");
		int borrows = sc.nextInt();

		book.borrow(borrows);

		System.out.println("Updated book data:");
		System.out.println(book);

		System.out.println();
		System.out.print("How many returns? ");
		int returns = sc.nextInt();

		book.giveBack(returns);

		System.out.println("Updated book data:");
		System.out.println(book);

		sc.close();
	}
}