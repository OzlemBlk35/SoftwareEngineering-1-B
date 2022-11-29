/*Klavyeden girilen terim sayısınca (n) "Tribonacci serisi"nin elemanlarını ekrana yazdıran program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir terim sayısı giriniz");
        int n=input.nextInt();
        int t1=1;
        int t2=1;
        int t3=2;
        System.out.print(t1+""+t2+""+t3);
        for(int i=1;i<=n-3;i++){
            int t4=t1+t2+t3;
            System.out.println(t4);
            t1=t2;
            t2=t3;
            t3=t4;
        }
        
        
        
    }
    
}
