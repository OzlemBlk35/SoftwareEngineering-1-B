/*Klavyeden girilen bölüm sayısına göre 5^(1/2) değerini hesaplayan program
 * 
 */ import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example12 {

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
        t=4+1/t;
        System.out.printf("Karekök(5)=%f\n",2+1/t);
    }
    
}
