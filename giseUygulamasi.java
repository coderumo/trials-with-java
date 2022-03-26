import java.util.Scanner;

public class giseUygulamasi {
  public static int maliyetB(int gecirilenSüre) {// araÃ§sÄ±z giriÅŸ maliyet hesaplama fonksiyonu
    int girisParasi = 50;
    int dkBasi = 2;
    return (gecirilenSüre * dkBasi + girisParasi);
  }

  public static int maliyetA(int gecirilenSüre, int otoparkSüresi) {// araÃ§lÄ± giriÅŸ maliyet hesaplama fonksiyonu
    int girisParasi = 50;
    int dkBasi = 2;
    int otodkBasi = 3;
    return ((dkBasi * gecirilenSüre) + (otodkBasi * otoparkSüresi) + girisParasi);
  }

  public static void main(String[] args) {
    System.out.println("Hava Alanına Hoş Geldiniz\n"
        + "Havaalana giriş ücreti 50 TL'dir\n"
        + "Havaalanına araçslı girişler için A kapısı seçilecektir\n "
        + "araçsız girişler için ise B kapısı seçilecektir\n"
        + "Havalanında geçirdiğiniz her dakika boyunca ücrete tabi tutulacaksınız\n"
        + "HavaalanÄ±nda geçirdiğiniz her dakika için 2 TL ücret alınacaktır\n"
        + "Havaalanında aracınızla geçirdiğiniz her dakika için 2 TL ve ek olarak"
        + " otoparkta geçirdiğiniz her dakika için 3 TL ücret alınacaktır");
    System.out.print("");
    System.out.print("Giris secimi yapiniz: ");
    try (Scanner scanner = new Scanner(System.in)) {
      String girisSecimi = scanner.nextLine();

      while (true) {
        if (girisSecimi.equals("A")) {// araÃ§lÄ± giriÅŸ giÅŸesi
          System.out.println("araçlı girişe hos geldiniz!!");
          System.out.print("Otoparkta geçirdiginiz dakikayi giriniz: ");
          int otoparkSüresi = scanner.nextInt();
          System.out.print("Havaalaninda gecirdiginiz dakikayi giriniz: ");
          int gecirilenSüre = scanner.nextInt();
          System.out.println("Toplam borcunuz: " + maliyetA(gecirilenSüre, otoparkSüresi));
          return;
        } else if (girisSecimi.equals("B")) {
          System.out.println("Aracsiz girise hos geldiniz: ");
          System.out.print("Havaalaninda gecirdiginiz dakikayi giriniz: ");
          int gecirilenSüre = scanner.nextInt();
          System.out.println("Toplam borcunuz: " + maliyetB(gecirilenSüre));
          return;
        }
        else{
          System.out.print("Hatali giris yaptiniz");
          break;
        }
      }
    }

  }
}
