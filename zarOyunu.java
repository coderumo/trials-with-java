
import java.util.Scanner;

public class zarOyunu {
  public static void main(String[] args) {
    int zar1, zar2 = 0;
    int oyuncu1, oyuncu2 = 0;// oyuncuların sahip olduğu para
    int tur = 0;//tur sayısı
    int fark = 0;//zarların sayısal değerlerinin arasındaki fark
    char t = 't';
    try (Scanner scanner = new Scanner(System.in)) {
      String para1 = "Birinci oyuncunun sahip oldugu para: ";
      System.out.print(para1);
      oyuncu1 = scanner.nextInt();
      String para2 = "İkinci oyuncunun sahip oldugu para: ";
      System.out.print(para2);
      oyuncu2 = scanner.nextInt();
      while (oyuncu1 > 0 && oyuncu2 > 0 && t == 't')
      {
        tur++;
        System.out.println("--------------------------------------");
        System.out.print("Şu an da oyunun"+tur+". turundasiniz\n");
        zar1=((int) (Math.random()*6+1));//zar sıfırdan başlamadığı için artı bir ekliyoruz
        zar2=((int)(Math.random()*6+1));
        System.out.println("-------------------------------------------------");
        System.out.println("oyuncu1'in attigi zarin sayisal degeri: "+zar1);
        System.out.println("oyuncu2'nin attigi zarin sayisal degeri: "+zar2);
        System.out.println("-------------------------------------------------");
        if(zar1>zar2){
          System.out.print(tur+". turun galibi oyuncu1\n");
          fark=zar1-zar2;
          oyuncu1 = oyuncu1+fark;
          oyuncu2=oyuncu2-fark;
          System.out.println("------------------------------------");
          System.out.println("oyuncu2'nin kalan parasi: "+oyuncu2);
          System.out.println("------------------------------------");
        }
        else if(zar2>zar1){
          System.out.print(tur+". turun galibi oyuncu2\n");
          fark=zar2-zar1;
          oyuncu1=oyuncu1-fark;
          oyuncu2=oyuncu2+fark;
          System.out.println("------------------------------------");
          System.out.println("oyuncu1'in kalan parasi: "+oyuncu1);
          System.out.println("------------------------------------");
        }
        else
        {
          System.out.println("tekrar zar atiniz!!");
        }
        if(oyuncu1<=0||oyuncu2<=0){
          break;
        }
        else{
          System.out.println("\nTekrar zar atmak için t'ye basiniz:");
          t=scanner.next().charAt(0);
        }


      }
      if(oyuncu1<=0){
        System.out.println("****************************************");
        System.out.println("*  oyuncu2 "+tur+". turda kazandi.           *");
        System.out.println("****************************************");
      }
      else{
        System.out.println("***************************************");
        System.out.println("*   oyuncu1 "+tur+". turda kazandi.         *");
        System.out.println("***************************************");
      }
    }

  }
}
