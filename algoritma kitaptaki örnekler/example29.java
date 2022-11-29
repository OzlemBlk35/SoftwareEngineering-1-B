/*İki basamaklı iki doğal sayının birler basamağındaki rakamların toplamı 10 ve onlar basamağındaki rakamları aynı ise 
bu iki doğal sayıya "bağdaşık sayılar" denir.Klavyeden girilen iki doğal sayının bağdaşık olup olmadığını tespit eden program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen birinci sayısı giriniz");
        int a=input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        int b=input.nextInt();
        int a0=a%10;
        int b0=b%10;
        int a1=(a-a0)/10;
        int b1=(b-b0)/10;
        if((a1==b1)&&(a0+b0==10))
        {
            System.out.println("Bağdaşık sayılar");
        }
        else
        {
            System.out.println("Bağdaşık sayılar değil");
        }
        
        
        
        
        
    }
    
}
