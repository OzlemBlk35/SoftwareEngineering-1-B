/*Çembersel hareket yapan bir cismin merkezcil kuvvetini hesaplama
  Adım1:başla
  Adım2:cismin merkeze olan uzaklığını gir
  Adım3:cismin kütlesini gir
  Adım4:cismin hızını gir
  Adım5:merkezcil kuvvet formülünü tanımla(m*v*v/r)
  Adım6:merkezcil kuvveti hesapla
  Adım7:sonucu ekrana yaz
  Adım8:bitir
 *
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen çembersel hareket yapan cismin merkeze olan uzaklığını giriniz:");
        int r = input.nextInt();
        System.out.println("Lütfen cismin kütlesini giriniz:");
        int m = input.nextInt();
        System.out.println("Lütfen cismin hızını giriniz:");
        int v = input.nextInt();
        int merkezcılKuvvet = m*v*v/r;
        System.out.println("Cismin merkezcil kuvveti:" +merkezcılKuvvet+"");
        
    }
    
}
