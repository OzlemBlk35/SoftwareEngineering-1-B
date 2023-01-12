/*İki boyutlu dizilerin toplamını bir dizi olarak döndüren method.
 *
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz");
        int a=input.nextInt();
        System.out.println("Lütfen sütun sayısını giriniz");
        int b=input.nextInt();
        array(a,b);
    }
    
    
   public static int [][] array(int a,int b){
       Scanner input=new Scanner(System.in);
       int [][]A=new int[a][b];
       int [][]B=new int[a][b];
       int [][]C=new int[a][b];
       for(int i=0;i<a;i++){
           for(int j=0;j<b;j++){
               System.out.println("A dizisinin "+i+" ıncı satırı ve "+j+" ıncı sütunu");
               A[i][j]=input.nextInt();
               System.out.println("B dizisinin "+i+" ıncı satırı ve "+j+" ıncı sütunu");
               B[i][j]=input.nextInt();
           }
       }
       for(int i=0;i<a;i++){
           for(int j=0;j<b;j++){
               C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
           }
           System.out.println();
       }
        return C;
       
       
   }
   
    
}

     
