import com.example.factory.notification.NotificationFactory;

public class Main {
    public static void main(String[] args) {

        NotificationFactory factoryNotification = new NotificationFactory();
        factoryNotification.createNotification("SMS").notifyUser();

    }
}