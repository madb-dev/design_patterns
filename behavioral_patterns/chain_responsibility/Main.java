import com.example.Dimension;
import com.example.OneDimension;
import com.example.ThreeDimension;
import com.example.TwoCoordinates;
import com.example.handler.HandlerDimension;

public class Main {

  public static void main(String[] args) {
    HandlerDimension d1 = new OneDimension();
    HandlerDimension d2 = new TwoCoordinates();
    HandlerDimension d3 = new ThreeDimension();

    d1.setNext(d2);
    d2.setNext(d3);

    d1.process(new Dimension(2));
    d1.process(new Dimension(2,4));
    d1.process(new Dimension(2,4,6));
    d1.process(new Dimension(5));
  }
}