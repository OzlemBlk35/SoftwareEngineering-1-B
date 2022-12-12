/*Klavyeden girilen n elemanlı A ve B dizilerinin "skaler çarpım"ını heaplayan program
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int N;
        do
        {
            System.out.println("Lütfen pozitif bir N sayısı giriniz");
            N=input.nextInt();
        }while(N<0);
        
       int a[]=new int[N];
       int b[]=new int[N];
       
        for(int i=0;i<a.length;i++){
            System.out.println("A dizisi için "+(i+1)+"inci sayı");
            a[i]=input.nextInt();
        }
        for(int i=0;i<b.length;i++){
            System.out.println("B dizisi için "+(i+1)+"inci sayı");
            b[i]=input.nextInt();
            }
       int sc=0;   
       for(int i=0;i<N;i++){
           sc=sc+a[i]*b[i];
          
       }
       System.out.println(sc);
       
       
       
    }
    
}
