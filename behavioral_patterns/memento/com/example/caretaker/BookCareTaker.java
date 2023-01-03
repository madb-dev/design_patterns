package com.example.caretaker;

import com.example.memento.BookMemento;
import com.example.originator.Book;
import java.util.ArrayList;
import java.util.List;

public class BookCareTaker {

  List<BookMemento> bookHistory = new ArrayList<>();


  Book book1 = new Book(1, "Harry Potter And The Philosopher'S Stone", "J.K. Rowling", 10.35);

}
