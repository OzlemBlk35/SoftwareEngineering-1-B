/*Klavyeden girilen N*N tipindeki A matrisinden üst üçgen B matrisi oluşturan program
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen satır ve sütun değerini giriniz");
        int N =input.nextInt();
        int [][]A=new int[N][N];
        int [][]B=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.println("A matrisinin "+(i+1)+" inci satırı ve "+(j+1)+" inci sütunu ");
                A[i][j]=input.nextInt();
                if(i>j){
                    B[i][j]=0;
                }
                else
                {
                    B[i][j]=A[i][j];
                }
            
               
        }
        
        
    } System.out.println("ÜST ÜÇGEN MATRİSİ");
       for(int i=0;i<N;i++){
           for(int j=0;j<N;j++){
               System.out.print(B[i][j]+" ");
               
           }
           System.out.println();
       }
}}
