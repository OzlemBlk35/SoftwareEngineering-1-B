/*Klavyeden girilen x değeri için,yine klavyeden girilen tarim sayısı(N)kadar seriye açarak e^x i hesaplayan program
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double T=1;
        double F=1;
        System.out.println("Lütfen bir terim sayısı giriniz");
        int N=input.nextInt();
        System.out.println("Lütfen bir x değeri giriniz");
        double x=input.nextDouble();
        for(int i=1;i<N-1;i++){
            F=F*i;
            T+=Math.pow(x, i)/F;
        }
        System.out.printf("\nSeri açılımı ile e üzeri x değeri:&.5f\n",T);
        System.out.printf("Komutla e üzeri x değeri:%.5f\n",Math.exp(x));
        
        
        
    }
    
}
