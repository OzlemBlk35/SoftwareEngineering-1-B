/*1 den başlayıp girilen bir n sayısına kadar olan tek sayıların toplamı
  Adım1:başla
  Adım2:klaveden bir sayı gir
  Adım3:eğer sayı%2=1 ise sayıyı seç ve topla
  Adım4:bitir
 *
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=input.nextInt();
        
        int toplam=0;
        int s=1;
        while(s<=sayi)
            if (s%2==1){
                toplam=toplam+s;
                s=s+1;
        }
            else{
                s=s+1;
        }
         System.out.println("tek sayılar toplamı=" +toplam);
    
}
}