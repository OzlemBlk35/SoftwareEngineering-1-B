/*Klavyeden girilen bir sayının asal olup olmadığını yazdıran method.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
         System.out.println("Lütfen bir sayı giriniz.");
         int a=input.nextInt();
         primal_number(a);
         
    }
      public static void primal_number(int sayi){
         int sayac=0;
          for(int i=1;i<=sayi;i++){
             if(sayi%i==0)
             {
                 sayac++;
             }
      }
            if(sayac==2)
          {
              System.out.println(sayi+" sayısı asal sayıdır.");
          }
            else
            {
                System.out.println(sayi+" sayısı asal değildir.");
            }
            
      }
}