/*kenar uzunlukları girilen bir üçgenin eşkenar,ikizkenar yada çeşitkenar olduğunu göstern program
  Adım1:başla
  Adım2:kenar uzunluklarını gir;kenar1,kenar2,kenar3
  Adım3:eğer kenar1=kenar2 , kenar1=kenar3 ve kenar2=kenar3 ise "Eşkenar üçgen yazdır"
  Adım4:eğer kenar1=kenar2 veya kenar1=kenar3 veya kenar2=kenar3 ise "İkizkenar üçgen yazdır"
  Adım5:eğer kenar1!=kenar2,kenar1!=kenar3 ve kenar2!=kenar3 ise "Çeşitkenar üçgen yazdır"
  Adım6:bitir
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
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen birinci kenar uzunluğunu giriniz");
        int kenar1  = input.nextInt();
        System.out.println("Lütfen ikinci kenar uzunluğunu giriniz");
        int kenar2 = input.nextInt();
        System.out.println("Lütfen üçüncü kenar uzunluğunu giriniz ");
        int kenar3 = input.nextInt();
        
        if (kenar1==kenar2&&kenar1==kenar3&&kenar2==kenar3){
            System.out.println("Eşkenar üçgendir");
        }               
        else if (kenar1==kenar2||kenar1==kenar3||kenar2==kenar3){
            System.out.println("İkizkenar üçgendir");
        }
        else if (kenar1!=kenar2&&kenar1!=kenar3&&kenar2!=kenar3){
            System.out.println("Çeşitkenar üçgendir");
        }
                
    }
    
}
