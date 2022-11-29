/*Klavyeden girilen terim(n)sayısı için Fibonacci serisinin ilk n terimini bulup ekrana yazan program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example41 {

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
        System.out.print(t1+""+t2);
        for(int i=1;i<=n-2;i++){
            int t3=t1+t2;
            System.out.print(t3);
            t1=t2;
            t2=t3;
        }
        
    }
    
}
