/*Klavyeden girilen terim sayısına göre,NegaFibonacci serisinin terimlerini yazdıran program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir terim sayısı giriniz");
        int n=input.nextInt();
        int f1=1;
        int f2=-1;
        System.out.print(f1+""+f2);
        for(int i=1;i<n-2;i++){
            int f3=f1-f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }
        
        
    }
    
}
