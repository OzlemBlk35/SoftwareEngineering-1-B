/*Herbir hanenin,basamak sayısı kadar üslerinin toplamı yine aynı sayıya eşit olan tamsayılara,"Armstrong sayılar"denir.
 * 100-999 arasındaki Armstrong sayılarını listeleyen program.
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int s;
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                for(int k=0;k<9;k++)
                {
                    s=100*i+10*j+k; 
                    if(s==(i^3)+(j^3)+(k^3))
                    {
                        System.out.println(s);
                    }
                }
                
                
              
            }
        }
        
    }
    
}
