/*Yükleri ve aralarındaki uzaklık girilen iki cismin elektriksel kuvvetini hesaplama
  Adım1:başla
  Adım2:birinci cismin elektrik yükünü gir
  Adım3:ikinci cismin elektrik yükünü gir
  Adım3:cisimler arası uzaklığı gir
  Adım4:coulomb sabitini tanımla(9*(10^9))(k)
  Adım5:k*q1*q2/(d^2)işlemini hesapla
  Adım6:sonucu ekrana yaz
  Adım7:bitir
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Example11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen birinci cismin elektriksel yükünü giriniz:");
        int q1= input.nextInt();
        System.out.println("Lütfen ikinci cismin elektriksel yükünü giriniz:");
        int q2= input.nextInt();
        System.out.println("Lütfen cisimler arası uzaklığı giriniz:");
        int d = input.nextInt();
        int k = 9*10*10*10*10*10*10*10*10*10;
        int elektrıkselKuvvet = k*q1*q1/d*d;
        System.out.println("Elektriksel kuvvet:"+elektrıkselKuvvet);
        
        
      
        
    }
    
}
