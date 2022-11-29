/*Klavyeden girilen terim sayısı için "Madhava of Sangamagrama"seri toplamıyla pi değeri hesaplama

 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir terim sayısı giriniz");
        int N =input.nextInt();
        int t=0;
        for(int i=0;i<N-1;i++){
            t=t+(-1)^i/((2*i+1)*3^i);
            System.out.print((12)^(1/2)*t);
        }
        
        
    }
    
}
