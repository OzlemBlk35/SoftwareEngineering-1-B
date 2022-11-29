/*Her iki basamağı da asal sayı olan iki basamaklı sayıları listeleyen program
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        for(int i=2;i<=7;i++){
            for(int j=2;j<=7;j++)
            {
                if(((i==2)||(i==3)||(i==5)||(i==7))&&((j==2)||(j==3)||(j==5)||(j==7)))
                        {
                            System.out.println(10*i+j);
                        }    
            }     
    }
    
}}
