/*Direnci ve akımı girilen bir iletkenin uçları arasındaki gerilimi hesaplama
  Adım1:başla
  Adım2:iletken direncini gir
  Adım3:iletkendeki akımı gir
  Adım4:gerilimi hesapla
  Adım5:sonucu ekrana yaz
  Adım6:bitir
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
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iletkenin direncini giriniz:");
        double R = input.nextDouble();
        System.out.println("Lütfen iletkendeki akımı giriniz:");
        double i = input.nextDouble();
        
        
        Double ıletkenınuclarıarasındakıgerılım = R*i;
        System.out.println("İletkenin uçları arasındaki gerilim="  +ıletkenınuclarıarasındakıgerılım+"");
    }
    
}
