/*1 ile 99 arası klavyeden girilen bir sayının tahmini
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int max=99;
        int min=1;
        int s=0;
        int BS=(int)(Math.random()*98)+1;
      
        while(true)
        {
            System.out.println("Lütfen 1 ile 99 arası bir sayı giriniz");
            int sayi=input.nextInt();
            if(sayi<BS){
                System.out.println("Lütfen daha büyük bir sayı giriniz");
            }
            else if(sayi>BS){
                System.out.println("Lütfen daha küçük bir sayı giriniz");
            }
            else if(sayi==BS){
                System.out.println("Tahmininiz doğru");
            break;}
            
        
    }
    
}}
