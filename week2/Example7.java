/*Kütlesi,hızı ve yerden yüksekliği girilen bir cismin kinetik ve potansiyel enerjisini hesaplama
  Adım1:başla
  Adım2:cismin kütlesini gir
  Adım3:cismin hızını gir
  Adım4:cismin yerden yüksekliğini gir
  Adım5:potansiyel enrjiyi hesapla
  Adım6:kinetik enerjiyi hesapla
  Adım7:sonucu ekrana yaz
  Adım8:bitir
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cismin kütlesini giriniz:");
        double m = input.nextDouble();
        System.out.println("Lütfen cismin hızını giriniz:");
        double v = input.nextDouble();
        System.out.println("Lütfen cismin yerden yüksekliğini giriniz:");
        double h = input.nextDouble();
        
        
        double potansıyelEnerjı = m*h*10;
        double kınetıkEnerjı = m*Math.pow(v, 2)/2;
        
        System.out.println("Cismin potansiyel enerjisi=" +potansıyelEnerjı+"");
        System.out.println("Cismin kinetik enerjisi=" +kınetıkEnerjı+"");
        
               
     
        
        
        
        
        
        
    }
    
}
