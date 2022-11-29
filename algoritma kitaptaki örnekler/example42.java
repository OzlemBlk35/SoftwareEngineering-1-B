/*Basamakları toplamı Fibonacci sayısı olan 0-99 arasındaki tamsayıları listeleyen program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int s=i*j;
                if((s==1)||(s==2)||(s==3)||(s==5)||(s==8)||(s==13)){
                    System.out.println(10*i+j);
                }
                    }
        }
        
        
        
    }
    
}
