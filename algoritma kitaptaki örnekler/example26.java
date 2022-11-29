/*Sayılar teorisinde 4k+1 şeklinde ifade edilebilen pozitif tamsayılar,"Hilbert sayıları"olarak adlandırılmaktadır.Klavyeden
girilen pozitif tamsayının,Hilbert sayısı olup olmadığını test eden program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tamsayı giriniz");
        int s=input.nextInt();
        if((s-1)%4==0)
        {
            System.out.println("Hilbert sayısıdır");
        }
        else
        {
            System.out.println("Hilbert sayısı değildir");
        }
        
    }
    
}
