/*Kenar uzunluğu ve o kenara ait tüksekliği girilen üçgenin alanını hesaplama
  Adım1:başla
  Adım2:üçgenin kenar uzunluğunu gir(x)
  Adım3:kenara ait yüksekliği gir(h)
  Adım4:alanı hesapla(x*h/2)
  Adım5:sonucu ekrana gir
  Adım6:bitir
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluğunu giriniz:");
        double x = input.nextDouble();
        System.out.println("Lütfen girdiğiniz kenar uzunluğuna ait yükseklik uzunluğunu giriniz:");
        double h = input.nextDouble();
        
        
        double ucgenınAlanı = x*h/2;
                
        System.out.println("Üçgenin Alanı:" +ucgenınAlanı+"");
        
        
        
        
            
    }
    
}
