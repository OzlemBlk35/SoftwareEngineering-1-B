/*Klavyeden girilen bir tamsayının mükemmel sayı olup olmadığını test eden program.
 *
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int a=input.nextInt();
        int t=0;
        for(int i=1;i<=a-1;i++){
            if(a%i==0)
            {
                t=t+i;
            }
        }
        if(a==t)
        {
            System.out.println("Mükemmel sayıdır");
        }
        else
        {
            System.out.println("Mükemmel sayı değilddir");
        }
        
    
    
}}
