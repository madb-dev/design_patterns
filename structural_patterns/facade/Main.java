import com.example.facade.CallCenter;

public class Main {

  public static void main(String[] args) {

    CallCenter callCenter = new CallCenter();
    System.out.println("Welcome to the Call Center. Which department do you want to talk to?");

    callCenter.getSalesDepartment();
    callCenter.getIncidentsDepartment();
    callCenter.getSalesDepartment();
  }
}