/*Derece cinsinden girilen açıyı radyan ve gradyan cinsine çevirme
  Adım1:başla
  Adım2:açıyı gir(aci)
  Adım3:radyan cinsinden işlemi tanımla
  Adım4:gradyan cinsinden işlemi tanımla
  Asım5:sonucu ekrana yaz
  Adım6:bitir
 *
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double aci;
        double grad,radyan;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen açıyı giriniz:");
        aci = input.nextDouble();
        
        radyan=aci*Math.PI/180;
        grad=aci*200/180;
        
        System.out.println("Radyan eşiti=" +radyan);
        System.out.println("Gradyan eşiti=" +grad);
       
        
        
      }       }
