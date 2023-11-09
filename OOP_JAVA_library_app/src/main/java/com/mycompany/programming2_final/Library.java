/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming2_final;
import java.util.ArrayList;
/**
 *
 * @author pc
 */
class Library {
  // Declaring an ArrayList to store the books in the library
  private ArrayList<Book> books;

  // Creating a constructor for Library objects
  public Library() {
    books = new ArrayList<Book>();
  }

  // Creating a method to add a new book to the library
  public void addBook(Book book) {
    // Checking if the ISBN is unique
    boolean isUnique = true;
    for (Book b : books) {
      if (b.getIsbn().equals(book.getIsbn())) {
        isUnique = false;
        break;
      }
    }
    // If the ISBN is unique, add the book to the library
    if (isUnique) {
      books.add(book);
      System.out.println("Book added successfully.");
      System.out.println();
    } else {
      // If the ISBN is not unique, display an error message
      System.out.println("Book cannot be added. ISBN already exists.");
      System.out.println();
    }
    
  }

  // Creating a method to remove an existing book from the library
  public void removeBook(String isbn) {
    // Searching for the book with the given ISBN
    boolean isFound = false;
    for (int i = 0; i < books.size(); i++) {
      if (books.get(i).getIsbn().equals(isbn)) {
        // If the book is found, remove it from the library
        books.remove(i);
        isFound = true;
        break;
      }
    }
    // If the book is found, display a success message
    if (isFound) {
      System.out.println("Book removed successfully.");
      System.out.println();
    } else {
      // If the book is not found, display an error message
      System.out.println("Book cannot be removed. ISBN does not exist.");
      System.out.println();
    }
    
  }

  // Creating a method to search for books by any attribute
  public void searchBooks(String keyword) {
    // Creating an ArrayList to store the matching books
    ArrayList<Book> matches = new ArrayList<Book>();
    // Looping through all the books in the library
    for (Book b : books) {
      // Checking if any attribute of the book contains the keyword (case-insensitive)
      if (b.getIsbn().toLowerCase().contains(keyword.toLowerCase()) ||
          b.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
          b.getAuthor().toLowerCase().contains(keyword.toLowerCase()) ||
          b.getPublisher().toLowerCase().contains(keyword.toLowerCase()) ||
          Integer.toString(b.getYear()).contains(keyword)) {
        // If a match is found, add the book to the matches list
        matches.add(b);
      }
    }
    
     // If there are any matches, display them
     if (matches.size() > 0) {
       System.out.println("The following books match your search:");
       System.out.println();
       for (Book b : matches) {
         b.display();
       }
     } else {
       // If there are no matches, display an error message
       System.out.println("No books match your search.");
       System.out.println();
     }
    
     
   }
   
   // Creating a method to display all the books in the library
   public void displayAllBooks() {
     // If there are any books in the library, display them
     if (books.size() > 0) {
       System.out.println("The following books are in the library:");
       System.out.println();
       for (Book b : books) {
         b.display();
       }
     } else {
       // If there are no books in the library, display an error message
       System.out.println("The library is empty.");
       System.out.println();
     }
     
   }
}
