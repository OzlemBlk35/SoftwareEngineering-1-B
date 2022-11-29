/*Klavyeden girilen terim sayısı için "üçgensel sayılar" ı veren program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir terim sayısı giriniz");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            int u=i*(i+1)/2;
            System.out.println(u);
        }
        
    }
    
}
