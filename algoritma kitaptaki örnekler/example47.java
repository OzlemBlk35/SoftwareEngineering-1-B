/*Klavyeden girilen pozitif tamsayı değere göre "Pisagor üçlemesi"ni hesaplayan program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir n değeri giriniz");
        int n=input.nextInt();
        for(int i=1;i<=n-1;i++){
            for(int j=i+1;j<=n-i;j++){
                int k=n-(i+j);
                if((i^2)+(j^2)==(k^2)){
                    System.out.println(i+""+j+""+k);
                    System.out.println(i*j*k);
                }
            }
        }
    }
    
}
