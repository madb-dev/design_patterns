import com.example.context.Package;

public class Main {

  public static void main(String[] args) {
    Package pck1 = new Package();
    pck1.printStatus();

    System.out.println("--------------------");
    pck1.nextState();
    pck1.printStatus();

    System.out.println("--------------------");
    pck1.nextState();
    pck1.printStatus();

    System.out.println("--------------------");
    pck1.nextState();
    pck1.printStatus();
  }
}
