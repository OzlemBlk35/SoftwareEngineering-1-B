/*Klavyeden girilen bir tamsayının "eksik sayı"olup olmadığını  ekrana yazdıran program.
 * 
 */import java.util.Scanner;
 

/**
 *
 * @author Asus
 */
public class example30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int a=input.nextInt();
        int t=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
                t=t+i;
        }
        if(t<2*a)
        {
            System.out.printf("Eksik sayıdır ");
         
        }
        else
        {
            System.out.println("Eksik sayı değildir");           
        }
        
    }
    
}
