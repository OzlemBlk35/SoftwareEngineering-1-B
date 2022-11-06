/*Koninin yüzey alanı ve hacmini hesaplama
  Adım1:başla
  Adım2:koninin taban yarıçapını gir
  Adım3:koninin yanal uzunluğunu gir
  Adım4:koninin yüksekliğini gir
  Adım5:alanı hesapla
  Adım6:hacmi hesapla
  Adım7:sonucu ekrana yaz
  Adım8:bitir
 * 
 */ import java.util.Scanner;

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
        System.out.println("Lütfen koninin taban yarıçapını giriniz:");
        double r = input.nextDouble();
        System.out.println("Lütfen koninin yanal uzunluğunu giriniz:");
        double s = input.nextDouble();
        System.out.println("Lütfen koninin yüksekliğini giriniz:");
        double h = input.nextDouble();
        double konınınAlanı = r*Math.PI*s+Math.PI*Math.pow(r,2);
        double konınınHacmı = h*Math.PI*r*r/3;
        System.out.println("Koninin yüzey alanı:" +konınınAlanı+"");
        System.out.println("Koninin hacmi:" +konınınHacmı+"");
        
        
        
        
        
    }
    
}
