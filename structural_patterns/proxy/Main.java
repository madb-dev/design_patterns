import com.example.message.MessageService;
import com.example.message.impl.MessageServiceImpl;
import com.example.message.proxy.ProxyMessageService;

public class Main {

  public static void main(String[] args) {
    System.out.println("Message service without proxy");
    MessageService message = new MessageServiceImpl();
    System.out.println(message.message());

    System.out.println("Message service with proxy");
    message = new ProxyMessageService();
    System.out.println(message.message());
  }
}