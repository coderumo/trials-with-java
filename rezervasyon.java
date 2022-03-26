
import java.util.Scanner;

public class rezervasyon {
  public static void main(String[] args) {
    System.out.println("Otelimize hod geldiniz!!"
        + "Otelimizde toplam 12 oda bulunmakta ve oda numaralari 1 ile 12 arasindadir.");
    String ad[] = new String[12];
    ad[3] = "ahmet";
    ad[2] = "selma";
    ad[7] = "somer";
    ad[5] = "emre";

    System.out.println("\n lutfen adinizi, soyadinizi ve almak istediginiz oda numarasiniz giriniz: ");
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("adiniz: ");
      String isim = scanner.nextLine();
      while (true) {
        System.out.print("almak istediginiz oda numarasi: ");
        int numara = scanner.nextInt();

        for (int i = 0; i < ad.length;) {
          if (ad[numara] != null) {
            System.out.println(numara + " nolu odamizda " + ad[numara] + " kalmaktadir.Başka bir oda seciniz.");
            break;
          } else {
            System.out.println("odaniza yerleşebilirsiniz");
            ad[numara] = isim;
            return;
          }
        }
      }
    }

  }

}
