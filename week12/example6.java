/*1' den N'e kadar olan sayıların kareleri toplamını yazdıran method.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir N değeri giriniz");
        int A=input.nextInt();
        System.out.println("Toplam:"+toplam(A));
        
        
        
    }
    
    
    public static  int toplam (int N){
        int toplam=0;
        for(int i=0;i<=N;i++){
            toplam+=Math.pow(i,2);
            i++;
        }
        return toplam;
    }}
       
        
       
    
    

