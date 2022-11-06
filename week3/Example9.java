/*Çarpma operatörü kullanmadan iki sayıyı çarpan program
  Adım1:başla
  Adım2:klavyeden bir sayı al;sayi1
  Adım3:klavyeden bir sayı daha al;sayi2
  Adım4:s=0 için s=s+1 ve sonuc=0 için sonuc=sonuc+sayi1 hesapla
  Adım5:sonucu ekrana yaz
  Adım6:bitir
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi1=input.nextInt();
        System.out.println("Lütfen bir sayı daha giriniz");
        int sayi2=input.nextInt();
        
        int s=0;
        int sonuc=0;
        while(s<sayi2){
            s=s+1;
            sonuc=sonuc+sayi1;
        }
        
        
        System.out.println("İki sayının çarpımı"+sonuc);
        
    }
    
}
