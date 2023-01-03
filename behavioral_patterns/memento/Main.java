import com.example.memento.BookMemento;
import com.example.originator.Book;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<BookMemento> bookHistory = new ArrayList<>();

    Book book = new Book(1, "Harry Potter And The Philosopher'S Stone", "J.K. Rowling", 10.35);
    bookHistory.add(book.saveToMemento());
    System.out.println(book.toString());

    book.setPrice(11.00);
    bookHistory.add(book.saveToMemento());
    System.out.println(book.toString());

    book.setPrice(08.25);
    bookHistory.add(book.saveToMemento());
    System.out.println(book.toString());

    book.setPrice(14.52);
    bookHistory.add(book.saveToMemento());
    System.out.println(book.toString());

    book.restore(bookHistory.get(0));
    System.out.println(book.toString());
  }
}