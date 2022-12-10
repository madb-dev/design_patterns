import com.example.MobilePhone;
import com.example.factory.MobileFactory;

public class Main {

  public static void main(String[] args) {

    MobilePhone iphone14 = MobileFactory.getIPhoneMobile(6, 128);
    MobilePhone galaxy22 = MobileFactory.getSamsungMobile(12, 256);
    MobilePhone galaxy22_1 = MobileFactory.getSamsungMobile(12, 256);
    MobilePhone iphone14_pro = MobileFactory.getIPhoneMobile(6, 512);

    System.out.println(iphone14.hashCode());
    System.out.println(galaxy22.hashCode());
    System.out.println(galaxy22_1.hashCode());
    System.out.println(iphone14_pro.hashCode());
  }
}