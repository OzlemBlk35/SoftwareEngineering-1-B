/*Klavyeden girilen üst sınıra kadar olan asal sayıları listeleyen program
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir üst sınır giriniz");
        int n=input.nextInt();
        for(int i=2;i<=n;i++)
        {
            int s=0;
            for(int j=1;j<=i;j++)
            
                if(i%j==0)
                {
                  s=s+1;
                }
                if(s==2)
                {
                    System.out.println(i);
                }
            
        }
        
        
    }
    
}
