/*Klavyeden girilen terim sayısı kadar çarpım yaparak pi sayısını "John Wallis"ardışık çarpımıyla hesaplayan program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir terim sayısı giriniz");
        int N =input.nextInt();
        double c=1;
        double c1;
        for(int i=1;i<=N;i++){
            c1=4*i*i;
            c=c*c1/(c1-1);
        }
        System.out.println(2*c);
        
        
        
    }
    
}
