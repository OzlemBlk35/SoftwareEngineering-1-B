/*Dışarıdan girilen N değerine göre;
   *
   **
   ***
   ****
 şeklini oluşturan method
*/import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir satır sayısı giriniz");
        int N=input.nextInt();
        star(N);
    }
    
    
    
    public static void star(int N){
        for(int i=0;i<=N;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
            
}
