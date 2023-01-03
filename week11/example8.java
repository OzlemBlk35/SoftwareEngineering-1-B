/*Klavyeden girilen N*N tipindeki A matrisinin sondan bir önceki satır ve sütunundaki elemanların toplamını hesaplayan program
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen satır ve sütun sayısını giriniz");
        int N =input.nextInt();
        int [][]A=new int [N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.println("A matrisinin "+i+" inci satırı ve "+j+" inci sütunu");
                A[i][j]=input.nextInt();
            }
        }
        int toplam=0;
        for(int i=0;i<N-1;i++){
            toplam+=A[i][N-1]+A[N-1][i];
        }
        int T=toplam-A[N-1][N-1];
        System.out.println("Toplam: "+T);
        
    }
    
}
