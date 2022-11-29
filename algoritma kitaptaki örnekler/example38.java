/*Klavyeden girilen m ve n değerleri için E(m,n) "Eularian sayısı"'nıhesaplayan program.
 *
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir m değeri giriniz");
        int m=input.nextInt();
        System.out.println("Lütfen bir n değeri giriniz");
        int n=input.nextInt();
        int t=(n+1)^m;
        for(int i=1;i<n;i++){
            int f1=1;
            int f2=1;
            int f3=1;
            for(int k=1;k<=m+1;k++){
                f1=f1*k;
            }
            for(int k=1;k<i;k++){
                f2=f2*k;
            }
            for(int k=1;k<m+1-i;k++){
                f3=f3*k;
            }
            int c=f1/(f2*f3);
            t=t+((-1)^i)*c*(n+1-i)^m;
        }
        
    }
    
}
