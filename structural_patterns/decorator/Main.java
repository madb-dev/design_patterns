import com.example.Knight;
import com.example.KnightImpl;
import com.example.decorator.*;

public class Main {

  public static void main(String[] args) {
    Knight knight = new BootDecorator(new GauntletDecorator(
        new HauberkDecorator(new HelmetDecorator(new SwordDecorator(new KnightImpl())))));
    knight.assemble();
  }
}