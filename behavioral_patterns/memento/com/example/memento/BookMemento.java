package com.example.memento;

import com.example.originator.Book;

public class BookMemento {

  private final Book book;

  public BookMemento(Book book) {
    this.book = book;
  }

  public Book getBook() {
    return book;
  }
}
