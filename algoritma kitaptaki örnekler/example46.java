/*Klavyeden girilen satır sayısı için "Floyd üçgeni"ni ekrana yazdıran program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir satır sayısı giriniz");
        int n=input.nextInt();
        int s=1;
        System.out.println("Floyd Üçgeni");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d\t",s);
                s=s+1;
            }
            System.out.println();
            
        }
       
        
    }
    
}
