/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programming2_final;

/**
 *
 * @author pc
 */
class Book {
  // Declaring the attributes of a book
  private String isbn;
  private String title;
  private String author;
  private String publisher;
  private int year;

  // Creating a constructor for Book objects
  public Book(String isbn, String title, String author, String publisher, int year) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.year = year;
  }

  // Creating getters and setters for the attributes
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  // Creating a method to display the book details
  public void display() {
    System.out.println("ISBN: " + isbn);
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Publisher: " + publisher);
    System.out.println("Year: " + year);
    System.out.println();
  }
}