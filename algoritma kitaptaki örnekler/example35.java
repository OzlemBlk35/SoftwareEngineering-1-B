/*Klavyeden girilen pozitif tamsayının "Aritmetik sayı"olup olmadığını kontrol eden program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int a=input.nextInt();
        int t=0;
        int s=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                t=t+i;
                s=s+1;
            }
        }
        if(t%s==0)
        {
            System.out.println("Aritmetik sayıdır");
        }
        else
        {
            System.out.println("Aritmetik sayı değildir");
        }
        
    }
    
}
