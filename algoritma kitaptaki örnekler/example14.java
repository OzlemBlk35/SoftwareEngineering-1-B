/*uzun kenarları eşit ve bu kenarlardan birinin,kısa kenara oranı ;altın orana eşit olan ikizkenar üçgenlere "Altın üçgen"denir.
 Klavyeden kısa kenarı girilen altın üçgenin tüm kenarlarını yazdıran program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kısa kenarını giriniz");
        double a=input.nextDouble();
        double b=a*(1+Math.pow(5, 0.5))/2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(b);
        
    }
    
}
