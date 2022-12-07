import com.example.builder.Car;

public class Main {
    public static void main(String[] args) {

        Car c = Car.Builder.newInstance().setBrand("Audi").setModel("A4").setManual(false).setInchesWheel(19).setColor("red").setCv(150).build();


        System.out.println(c.toString());
    }
}