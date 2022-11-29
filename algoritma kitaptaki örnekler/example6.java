/*Klavyeden girilen x ve n değerine göre e^x i binom açılımı ile hesaplayan program
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir terim sayısı giriniz");
        int N =input.nextInt();
        System.out.println("Lütfen bir x değeri giriniz");
        int x=input.nextInt();
        int sonuc=(1+x/N)^N;
        System.out.println("sonuç"+sonuc);
        
        
    }
    
}
