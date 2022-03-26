
import java.util.*;

public class kahveMakinesi {
  public static void main(String[] args) throws InterruptedException {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("__________________________________________________________________");
      System.out.println("içmek istediğiniz kahve numarasini menüden seciniz");
      System.out.println("1-Dibek kahvesi\n2-menengic kahvesi\n3-türk kahvesi");
      int kahve = scanner.nextInt();// kahve adını aldık
      System.out.println("___________________________________________________________________");
      System.out.println("kahvenizi nasil alirsiniz:\na-şekerli\nb-şekersiz\nc-orta\nd-sade");
      scanner.nextLine();
      String secim = scanner.nextLine();// nasil alacagini sectik

      if (secim.equals("a")) {
        secim = "şekerli";
      } else if (secim.equals("b")) {
        secim = "şekersiz";
      } else if (secim.equals("c")) {
        secim = "orta";
      } else if (secim.equals("d")) {
        secim = "sade";
      } else {
        System.out.print("şeker secimini hatali yaptiniz\n");
        secim = "";
      }
      System.out.println("____________________________________________________________________");
      switch (kahve) {
        case 1:
          System.out.println("kahveniz hazirlaniyor...\n");
          Thread.sleep(1000);
          System.out.println(secim + " dibek kahveniz hazir. \n\nAFİYET OLSUN :)");
          break;

        case 2:
          System.out.println("kahveniz hazirlaniyor...\n");
          Thread.sleep(1000);
          System.out.println(secim + " menengic kahveniz hazir. \n\nAFİYET OLSUN :)");
          break;

        case 3:
          System.out.println("kahveniz hazirlaniyor...\n");
          Thread.sleep(1000);
          System.out.println(secim + " türk kahveniz hazir. \n\nAFİYET OLSUN :)");
          break;

        default:
          System.out.println("gecersiz secim");
          Thread.sleep(1000);
          break;
      }

    }
  }

}
