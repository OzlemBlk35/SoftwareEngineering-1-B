/*1-7 arasında girilen bir sayının haftanın hangi gününe denk geldiğini gösteren program
  Adım1:başla
  Adım2:1 ve 7 arasında bir sayı gir
  Adım3:haftanın gününü yaz
  Adım4:sonucu ekrana yaz
  Adım5:bitir
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sayi1,sayi;
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen 1 ve 7 arasında bir sayı giriniz");
        sayi1=input.nextInt();
        sayi=sayi1%7;
        if (sayi==1){
            System.out.println("Pazartesi");
        }
        else if (sayi==2){
            System.out.println("Salı");
        }
        else if (sayi==3){
            System.out.println("Çarşamba");
        }
        else if (sayi==4){
            System.out.println("Perşembe");
        }
        else if (sayi==5){
            System.out.println("Cuma");
        }
        else if (sayi==6){
            System.out.println("Cumartesi");
        } 
        else if (sayi==7){
            System.out.println("Pazar");
        }
    }
    
}
