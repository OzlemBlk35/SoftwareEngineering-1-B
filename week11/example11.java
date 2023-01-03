/*Klavyeden girilen N*N tipindeki A matrisinin her bir sütun elemanları çarpımından N elemanlı B dizisi oluşturan program
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen satır ve sütun sayısını giriniz");
        int N=input.nextInt();
        int [][]A=new int[N][N];
        int []B=new int[N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.println("A matrisinin "+i+" inci satırı ve "+j+" inci sütunu");
                A[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<N;i++){
             B[i]=0;
            for(int j=0;j<N;j++){
                B[i]*=A[j][i];
                System.out.println(B[i]);
            }
            
        }
        
        
        
        
        
        
    }
    
}
