/*Klavyeden girilen n  sayısına göre;1' den n'e kadar olan tamsayıların toplamını(t1),
1'den n'e kadar tek tamsayıların toplamını(t2) ve 2'den n'e kadarçift tamsayılarınntoplamını
(t3)hesaplayan program
  t1:1 den n e kadar olan tamsayıların toplamı
  t2:1 den n e kadar tek tamsayıların toplamı
  t3:1 den n e kadar olan çift tamsayıların toplamı
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
        int i,n;float t1=0,t2=0,t3=0;
        Scanner klavye=new Scanner(System.in);
        System.out.print("Lütfen bir pozitif tamsayı giriniz:");
        n=klavye.nextInt();
        for(i=1;i<=n;i++)
        {
            t1+=i;
        }
        for(i=1;i<=n;i+=2)
        {
            t2+=i;
        }
        for(i=2;i<=n;i+=2)
        {
            t3+=i;
        }
        System.out.println("\n1 den "+n+"'e kadar sayıların toplamı:"+t1);
        System.out.println("1 den "+n+"'e kadar tek sayılarıntoplamı:"+t2);
        System.out.println("1 den"+n+"'e kadar çift sayıların toplamı:"+t3);
        
       
                
    }
    
}
