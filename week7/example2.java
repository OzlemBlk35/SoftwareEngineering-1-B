/*Klavyeden girilen n elemanlı a dizisinin aritmetik,geometrik,harmonik,kontraharmonik ortalamasını hesaplayan program
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir eleman sayısı giriniz");
        int n=input.nextInt();
        int []a=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println((i+1)+"inci eleman");
            a[i]=input.nextInt();
        }
            double t=0;
            double c=1;
            double HarmonıkToplam=0;
            double KarelerToplamı=0;
        
        for(int i=0;i<a.length;i++){
            t+=a[i];
            c*=a[i];
            HarmonıkToplam+=1/a[i];
            KarelerToplamı+=Math.pow(a[i], 2);
        }    
        double AO=t/n;
        double GO=Math.pow(c, (1/n));
        double HO=n/HarmonıkToplam;
        double KHO=KarelerToplamı/t;
            System.out.println("Aritmetik Ortalama:"+AO);
            System.out.println("Geometrik Ortalama:"+GO);
            System.out.println("Harmonik Ortalama:"+HO); 
            System.out.println("Kontraharmonik Ortalama:"+KHO);        
            
        }
                
    }
    

