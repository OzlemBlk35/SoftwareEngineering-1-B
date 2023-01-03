/*Klavyeden girilen N*N tipindeki A matrisinin her bir satır elemanlarını kendi aralarında küçükten büyüğe doğru sıralayan program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("A matrisinin satır ve sütun değerini giriniiz"); 
        int N=input.nextInt();
        int [][]A=new int[N][N];
        int [][][]B=new int[N][N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.println("A matrisinin "+i+" inci satırı "+j+" inci sütunu");
                A[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                B[i][i][j]=A[i][j];
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<N;k++){
                    if(B[i][i][k]<B[i][i][j]){
                      int F=B[i][i][j];
                      B[i][i][j]=B[i][i][k];
                      B[i][i][k]=F;
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.println(B[i][i][j]);
            }
            System.out.println();
        }
        
        
        
        
        
        
    }
    
}
