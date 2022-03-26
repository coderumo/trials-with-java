import java.util.Scanner;

public class girisPaneli {
  public static void main(String[] args) {
    String kullaniciAdi1 = "rumeysa";
    String sifre1 = "1234";
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("kullanici adi giriniz: ");
      String kullaniciAdi2 = scanner.nextLine();
      System.out.print("şifre giriniz: ");
      String sifre2 = scanner.nextLine();
      if (kullaniciAdi1.equals(kullaniciAdi2) && sifre1.equals(sifre2)) {
        System.out.println("başarılı şekilde giriş yaptiniz!" + "\nhoşgeldiniz");
      } else if (!kullaniciAdi1.equals(kullaniciAdi2) && sifre1.equals(sifre2)) {
        System.out.println("kullanici adi hatali");
      } else if (kullaniciAdi1.equals(kullaniciAdi2) && !sifre1.equals(sifre2)) {
        System.out.println("şifre hatali");
      } else {
        System.out.println("kullanici adi ve şifre hatali");
      }

    }
  }
}
