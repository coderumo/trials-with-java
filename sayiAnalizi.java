
import java.util.Scanner;

public class sayiAnalizi {
  public static void main(String[] args) {
    try (Scanner x = new Scanner(System.in)) {
      System.out.print("bir sayi giriniz: ");
      int a = x.nextInt();

      System.out.print("bir sayi giriniz: ");
      int b = x.nextInt();

      System.out.print("bir sayi giriniz: ");
      int c = x.nextInt();

      System.out.println("en kücük sayi: " + Math.min(Math.min(a, b), Math.min(b, c)));
      System.out.println("en büyük sayi: " + Math.max(Math.max(a, b), Math.max(b, c)));
    }

  }
}
