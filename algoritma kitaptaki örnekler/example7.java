/*Klavyeden girilen bir terim sayısına göre "Brothers formülü"kullanarak e değerini hesaplama
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir terim sayısı giriniz");
        int N=input.nextInt();
        int t=2;
        for(int i=1;i<=N;){
            int f=(2*i+1)*i;
            t=t+(2*i+1)/f;
            System.out.print(t);
        }
     
        
    }
    
}
