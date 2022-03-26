
import java.util.Random;

public class randomDizi {
  public static void main(String[] args) {
    int[] dizi = new int[5];// integer dizi nesnesi olulturduk 5 boyutlu
    for (int i = 0; i < dizi.length; i++) {
      Random random = new Random();// random nesne oluşturduk
      int rand = random.nextInt(10);
      dizi[i] = rand;
    }

    int ekucuk;
    int ebuyuk;
    ekucuk = dizi[0];
    ebuyuk = dizi[0];
    for (int i = 1; i < dizi.length; i++) {
      if (dizi[i] < ekucuk) {
        ekucuk = dizi[i];

      }
      if (dizi[i] > ebuyuk) {
        ebuyuk = dizi[i];
      }

    }
    System.out.println("5 sayı arasından en küçük sayı:" + ekucuk);
    System.out.println("5 sayı arasından en büyük sayı:" + ebuyuk);

    
    byte c[];
    byte[] a = { 1, 2, 3, 4 };
    c = a;
    System.out.println("");
    diziyi_bastir(c);
  }

  static void diziyi_bastir(byte[] c) {
    for (byte ss : c) {
      System.out.println("değerler:" + ss);
    }
  }
}
