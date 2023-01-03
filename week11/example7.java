/*Klavyeden girilen N*N tipindeki A matrisinin yedek köşegeninin üstünde kalan elemanların toplamını hesaplayan program
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
        System.out.println("Lütfen satır ve sütun değerini giriniz");
        int N=input.nextInt();
        int [][]A=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.println("A matrisinin "+i+" inci satırı "+j+" inci sütunu");
                A[i][j]=input.nextInt();
            }
        }
        int toplam=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if((i+j)<(N+1)){
                    toplam+=A[i][j];
                }
            }
        }
        System.out.println("Toplam: "+toplam);
        
    }
    
}
