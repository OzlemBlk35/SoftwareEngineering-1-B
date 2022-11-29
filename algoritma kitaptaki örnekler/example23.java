/*n.2^n+1 şeklinde yazılabilen sayılara "Cullen sayıları"denir.
Klavyeden girilen terim sayısı kadar Cullen sayılarını listeleyen program
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir terim sayısı giriniz");
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(i*2^i+1);
        }
    }
    
}
