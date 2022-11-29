/*örnek 92 sayfa 236
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
           int a=2^i;
           int b=2^(i+1);
           if(b%2==0)
           {
               System.out.println(a*b);
           }
    }
        
    
}}
