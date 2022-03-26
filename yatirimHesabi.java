
import java.util.Scanner;

public class yatirimHesabi {
  public static void main(String[] args) {
    double faizOrani = 24;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("yatirmak istediğiniz para milktarini giriniz: ");
      double anaPara = scanner.nextDouble();
      System.out.print("vade süresini giriniz yıl cinsinden: ");
      int vadeSüresi = scanner.nextInt();
      double faizMiktari = (anaPara * (faizOrani / 100) * vadeSüresi);
      System.out.println("vade sonundaki faiz mikatri: " + faizMiktari + "TL'dir.");
      double faizliPara = anaPara + faizMiktari;
      System.out.println("vade sonundaki toplam para miktari: " + faizliPara + "TL'dir.");
    }
  }
}
