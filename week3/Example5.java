/*Klavyeden girilen bir sayının sıfırdan büyük,eşit yada küçük olduğunu gösteren program
  Adım1:başla
  Adım2:bir sayı al
  Adım3:eğer sayı<0 ise "Negatiftir yaz"
  Adım4:eğer sayı>0 ise "Pozitiftir yaz"
  Adım5:eğer sayı=0 ise "Sıfıra eşittir"yaz
  Adım6:bitir
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz");
        int sayi= input.nextInt();
        if(sayi<0){
            System.out.println(sayi+ "sayı negatiftir");
        }
        else if (sayi>0){
            System.out.println(sayi+"sayı pozitiftir");
        }
        else if (sayi==0){
            System.out.println(sayi+"sayı sıfıra eşittir");
        }
        
    }
    
}
