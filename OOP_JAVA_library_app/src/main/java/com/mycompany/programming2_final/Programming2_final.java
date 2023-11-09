/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programming2_final;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Programming2_final {

     public static void main(String[] args) {

     // Creating a Scanner object for user input
     Scanner sc = new Scanner(System.in);

     // Creating a Library object for managing books
     Library lib = new Library();
         System.out.println("zyad ibrahim khalil  ");
         System.out.println("20191476243");
     // Displaying a welcome message and instructions
     System.out.println("Welcome to Library Management System!");
     System.out.println("Please enter one of the following commands:");
     System.out.println("1 - Add a new book");
     System.out.println("2 - Remove an existing book");
     System.out.println("3 - Search for books");
     System.out.println("4 - Display all books");
     System.out.println("5 - Exit");
     System.out.println();

     // Declaring a variable to store the user's choice
     int choice;

     // Using a do-while loop to repeat until the user chooses to exit
     do {

       // Prompting the user to enter their choice and validating it
       do {

         System.out.print("Enter your choice: ");
         choice = sc.nextInt();

         if (choice < 1 || choice > 5) {

           System.out.println("Invalid choice. Please try again.");
           System.out.println();

         }

       } while (choice <1 || choice >5);

       sc.nextLine(); // Consuming the newline character

       switch(choice) {

         case 1:
           // Adding a new book

           // Prompting the user to enter the book details and storing them in variables
           System.out.print("Enter ISBN: ");
           String isbn = sc.nextLine();

           System.out.print("Enter title: ");
           String title = sc.nextLine();

           System.out.print("Enter author: ");
           String author = sc.nextLine();

           System.out.print("Enter publisher: ");
           String publisher = sc.nextLine();

           System.out.print("Enter year: ");
           int year = sc.nextInt();

           sc.nextLine(); // Consuming the newline character

           // Creating a Book object with the given details and adding it to the library
           Book book = new Book(isbn, title, author, publisher, year);
           lib.addBook(book);

           break;

         case 2:
           // Removing an existing book

           // Promptingthe user to enterthe ISBN ofthebookto beremovedandstoringitinavariable

System. out. print ("EnterISBN:");
         isbn = sc.nextLine();
// RemovingthebookwiththegivenISBNfromthelibrary

lib. removeBook(isbn);

break;

         case 3:
// Searchingforbooks

// Promptingtheusertoenterakeywordtosearchbyandstoringitinavariable

System. out. print ("Enterkeyword:");
String keyword =sc. nextLine ();

// Searchingforbooksthatmatchthekeywordinanyattribute

lib. searchBooks(keyword);

break;

         case 4:
// Displayingallbooks

// Displayingallthebooksinthelibrary

lib. displayAllBooks();

break;

         case 5:
// Exitingtheprogram

// Displayingagoodbyemessageandclosingthescannerobject

System. out. println ("ThankyouforusingLibraryManagementSystem.Goodbye!");
sc. close ();

break;

}

} while(choice!=5);

}
}
