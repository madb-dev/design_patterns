import com.example.Bike;
import com.example.Journey;
import com.example.adapter.impl.JourneyAdapterImpl;

public class Main {
    public static void main(String[] args) {
        Journey bikeDistance = new Bike();
        bikeDistance.distance(200.0);
        JourneyAdapterImpl bikeDistanceAdapter = new JourneyAdapterImpl(bikeDistance);

        System.out.println("Trail day 1, bike distance : " + bikeDistance.getDistance() +
                "miles, distance in km: " + bikeDistanceAdapter.getDistance());
    }
}