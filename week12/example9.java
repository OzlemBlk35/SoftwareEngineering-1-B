/*İki boyutlu bir diziyi 0 ve girilen bir üst sınır arası random bir değer atayıp döndüren method.
 */import java.util.Scanner;
 import java.util.Random;

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
        System.out.println("Lütfen bir üst değer giriniz");
        int N=input.nextInt();
        int [][]dizi=random_array(N);
       
       
   
        
        
        
        
      
        
    }
    
public static int [][]random_array(int N){
    Scanner input=new Scanner(System.in);
    System.out.println("Dizinin satır sayısını giriniz");
     int a=input.nextInt();
    System.out.println("Dizinin sütun sayısını giriniz");
    int b=input.nextInt();
    int [][]dizi=new int[a][b];
    Random r=new Random();
    for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            dizi[i][j]=r.nextInt(N);
            System.out.print(dizi[i][j]+" ");
        }
        System.out.println();
    }
    return dizi;
        
         
}}

    
   
   
    
    

