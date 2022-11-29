/*Klavyeden girilen 1 den büyük tamsayıların asal çarpanlarını bulan program
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int a=input.nextInt();
        int b=2;
        while(a>1)
        {
            if(a%b==0)
            {
                System.out.println(b);
                a=a/b;
            }
            else
            {
                b=b+1;
            }
        }
        
        
    
}}
