/*1 den başlayıp girilen bir n sayısına kadar olan 
  Adım1:başla
  Adım2:klavyeden bir n sayısı al
  Adım3:s<=n olduğu zaman s=1 için s=s+1 ve toplam=0 ve sonuc=0 için toplam=toplam+sonuc işlemini hesapla
  Adım4:sonucu ekrana yaz
  Adım5:bitir
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz");
        int n = input.nextInt();
        int s=1;
        int sonuc=0;
        int toplam=0;
        while(s<=n){
            sonuc=s*s;
            System.out.println(s+"sayının karesi:"+sonuc);
            toplam=toplam+sonuc;
            s=s+1;
        }
        System.out.println("Toplam:"+toplam);
        
    }
    
}
