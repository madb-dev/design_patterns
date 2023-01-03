package com.example.originator;

import com.example.memento.BookMemento;

public class Book {

  private Integer id;
  private String title;
  private String author;

  private Double price;

  public Book(Integer id, String title, String author, Double price) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.price = price;
  }

  public Integer getId() {
    return id;
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

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public BookMemento saveToMemento() {
    Book book = new Book(id, title, author, price);
    return new BookMemento(book);
  }

  public void restore(BookMemento bookMemento) {
    this.id = bookMemento.getBook().getId();
    this.author = bookMemento.getBook().getAuthor();
    this.title = bookMemento.getBook().getTitle();
    this.price = bookMemento.getBook().getPrice();
  }

  @Override
  public String toString() {
    return "Book{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", price=" + price +
        '}';
  }
}
