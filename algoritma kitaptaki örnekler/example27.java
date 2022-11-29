/*(m,n) tamsayı çifti için;m'nin kendisi hariç tam bölenlerinintoplamı n'nin kendisi hariç tam bölenlerinin toplamı m'ye eşit ise
 * bu iki sayıya "Dost sayılar" denir.Klavyeden girilen iki tamsayının,"Dost sayılar" olup olmadığını tespit eden program.
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz");
        int a=input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        int b=input.nextInt();
        int ta=0;
        int tb=0;
        for(int i=1;i<=a-1;i++){
            if(a%i==0)
            {
                ta=ta+i;
            }
        }
        for(int j=1;j<=b-1;j++){
            if(b%j==0)
            {
                tb=tb+j;
            }
        }
        if((ta==b) && (tb==a))
        {
            System.out.println("Dost sayılardır");
        }
        else
        {
            System.out.println("Dost sayılar değildir"); 
                    
        }
               
    }
    
}
