/*Klavyeden girilen N*N tipindeki A matrisinin simetrik olup olmadığını kontrol eden program 
 *
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen satır ve sütun değerini giriniz");
        int N=input.nextInt();
        int [][] A=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.println("A dizisinin "+i+" inci satırı ve "+j+" inci sütunu");
                A[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(A[i][j]==A[j][i]){
                    
                }
                  else
                {
                    System.out.println("Simetrik değildir");
                }
                
                
            }
            System.out.println("Simetriktir");
        }
        
        
        
        
    }
    
}
