import com.example.channel.TwitchChannel;
import com.example.observer.Subscriber;
import java.util.Observer;

public class Main {

  public static void main(String[] args) {
    TwitchChannel twitch = new TwitchChannel();
    Observer s1 = new Subscriber();
    Observer s2 = new Subscriber();

    twitch.addObserver(s1);
    twitch.addObserver(s2);

    twitch.notifyObservers("Madb-dev Streaming now!");
  }
}
