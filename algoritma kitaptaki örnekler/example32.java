/*a pozitif bir tamsayı olmak üzere a(a+1)ile elde edilebilen sayılara "heterometrik sayı" denir.Klavyeden girilen adet sayısınca 
 * "Heterometrik sayılar"'ı oluşturan ve bunları açık yazarak alt alta listeleyen program.
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir adet sayısı giriniz");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i);
            System.out.print(i+1);
            System.out.print(i*(i+1));
        }
        
    }
    
}
