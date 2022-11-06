/*Yarıçapı girilen kürenin hacmi ve yüzey alanıı hesaplama
  Adım1:başla
  Adım2:kürenin yarıçapını gir
  Adım3:hacim=4*3,14*r*r*r/3
  Adım4:alan=4*3,14*r*r
  Adım5:sonucu ekrana yaz
  Adım6:bitir
 *
 */import java.util.Scanner;
 

/**import java.lang.Math;
 *
 * @author Asus
 */
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kürenin yarıçapını giriniz:");
        double r = input.nextDouble();
                        
        
        double hacim = 4*Math.PI*Math.pow(r, 3)/3;
        double alan = 4*Math.PI*Math.pow(r, 2);
        System.out.println("kürenin hacmi=" +hacim+"");
        System.out.println("kürenin alanı= " +alan+"");
    }     }
        
    

