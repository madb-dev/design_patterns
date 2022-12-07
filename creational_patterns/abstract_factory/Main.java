import com.example.factory.animal.Animal;
import com.example.factory.color.Color;
import com.example.factory.provider.FactoryProvider;

public class Main {
    public static void main(String[] args) {
        Animal dog = (Animal) FactoryProvider.getFactory("Animal").create("Dog");

        Color color = (Color) FactoryProvider.getFactory("Color").create("White");

        System.out.println("We have a " + dog.getAnimal() + " , its sound is " + dog.getSound() + " and its color is " + color.getColor());
    }
}