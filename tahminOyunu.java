
import java.util.Random;
import java.util.Scanner;

public class tahminOyunu {
  public static void main(String[] args) {
    int tahmin_hakki = 5;
    while (true) {
      System.out.print("***************************************"
          + "Sayi Tahmin Oyununa Hoş Geldiniz!"
          + "\nOyunumuzda tahmin edilecek sayı 0 ile 20 arasındadır\n"
          + "Toplam 3 tahmin hakkınız bulunmaktadır\n"
          + "Tahmin hakkınız bitince oyun sonlanır\n"
          + "Oyun başladı\nBaşarılar\n"
          + "*****************************"
          + "\nTahmini sayıyı giriniz: ");

      Random random = new Random();
      int tahmin_edilecek_sayi = random.nextInt(10);// random sınıfından nesne üreterek rastgele sayi seçildi
      try (Scanner scanner = new Scanner(System.in);) {
        for (int i = tahmin_hakki; i > 0; i--) {
          int tahmin_edilen_sayi = scanner.nextInt();// kullanici sayi tahmini yapti
          if (tahmin_edilecek_sayi == tahmin_edilen_sayi) {
            System.out.print("TEBRİKLER DOĞRU TAHMİN ETİİNİZ\n"
                + "\ndevam etmek için 1'e basin "
                + "\nçıkış yapmak için 0'a basin ");
            int secim = scanner.nextInt();
            if (secim == 0) {// çıkış
              System.out.println("cikis yapiliyor...");
              return;
            } else {
              break;// devam döngüye
            }
          } else if (tahmin_edilecek_sayi != tahmin_edilen_sayi) {
            System.out.println("Hatalı tahmin. Kalan deneme hakınınz " + (i - 1));

            if (i == 1) {
              System.out.println("Tahmin hakıınız bitti."
                  + "\nTekrar oynamak için 1 'e basin "
                  + "\nçıkış yapmak için 0'a basin ");
              int ssecim = scanner.nextInt();
              if (ssecim == 0) {
                System.out.println("çıkış yapılıyor");
                return;
              } else {
                break;
              }
            }
            TahminOrani(tahmin_edilecek_sayi, tahmin_edilen_sayi);
          }
        }
      }

    }
  }

  static void TahminOrani(int tahmin_edilecek_sayi, int tahmin_edilen_sayi) {
    int q = tahmin_edilecek_sayi - tahmin_edilen_sayi;
    if (q >= -2 && q <= 0 || q >= 0 && q <= 2) {
      System.out.println("Tahmin edilecek sayiya çok yaklaştiniz..");
    } else if (q >= -4 && q <= -2 || q >= 2 && q <= 4) {
      System.out.println("Tahmin edilecek sayiya yaklaştiniz..");
    } else if (q >= -6 && q <= -5 || q >= 5 && q <= 6) {
      System.out.println("Tahmin edilecek sayidan uzaklaştiniz..");
    } else if (q >= -9 && q <= -7 || q >= 7 && q <= 9) {
      System.out.println("Tahmin edilecek sayidan çok uzaklaştiniz..");
    }
  }

}
