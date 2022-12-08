import com.example.bridge.abstraction.Vehicle;
import com.example.bridge.abstraction.refinedabstraction.Car;
import com.example.bridge.abstraction.refinedabstraction.Motorbike;
import com.example.bridge.implementor.impl.Assemble;
import com.example.bridge.implementor.impl.Produce;

public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Car(new Produce(), new Assemble());
        v1.manufacture();

        Vehicle v2 = new Motorbike(new Produce(), new Assemble());
        v2.manufacture();
    }
}