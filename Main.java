/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "FERNANDO DJAKA", 2020);
        Book book2 = new Book("Python Basics", "Masih saya sendiri", 2019);

        BookManager bookManager = new BookManager();

        bookManager.addBook(book1);
        bookManager.addBook(book2);

        System.out.println("Book List:");
        bookManager.displayBooks();

        String searchTitle = "Java Programming";
        Book foundBook = bookManager.searchBook(searchTitle);
        if (foundBook != null) {
            System.out.println("Book Found:");
            System.out.println("Title: " + foundBook.getTitle());
            System.out.println("Author: " + foundBook.getAuthor());
            System.out.println("Year: " + foundBook.getYear());
        } else {
            System.out.println("Book not found.");
        }
    }

    public static class Book {
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }
    }

    public static class BookManager {
        private List<Book> books;

        public BookManager() {
            books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
        }

        public void displayBooks() {
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Year: " + book.getYear());
                System.out.println("------------------------");
            }
        }

        public Book searchBook(String title) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    return book;
                }
            }
            return null;
        }
    }
}

