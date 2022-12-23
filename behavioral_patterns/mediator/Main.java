import com.example.colleague.User;
import com.example.colleague.impl.Player;
import com.example.mediator.GameRoom;
import com.example.mediator.impl.GameRoomImpl;

public class Main {

  public static void main(String[] args) {
    GameRoom gameRoomMediator = new GameRoomImpl();

    User player1 = new Player("p1", gameRoomMediator);
    User player2 = new Player("p2", gameRoomMediator);
    User player3 = new Player("p3", gameRoomMediator);
    User player4 = new Player("p4", gameRoomMediator);
    User player5 = new Player("p5", gameRoomMediator);

    gameRoomMediator.addPlayer(player1);
    gameRoomMediator.addPlayer(player2);
    gameRoomMediator.addPlayer(player3);
    gameRoomMediator.addPlayer(player4);
    gameRoomMediator.addPlayer(player5);

    player2.sendMessage("Hello! Is anyone available to play AOE?");
    System.out.println("-----------------------------------------");
    player4.sendMessage("Hello! Is anyone available to play CS?");

  }
}
