/*Klavyeden girilen bölüm sayısına göre 2^(1/2)değerini hesaplayan program
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir bölüm sayısı giriniz");
        int n=input.nextInt();
        double t=1;
        for(int i=0;i<n;i++)
        t=2+1/t;
        System.out.printf("Karekök(2)=%f\n",1+1/t);    
        
       
        
        
        
        
    }
    
}
