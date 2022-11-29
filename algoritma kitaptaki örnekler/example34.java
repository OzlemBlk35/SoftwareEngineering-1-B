/*x,y,z,eleman[1,50] için "Markov sayıları"'nı listeleyen program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        for(int x=1;x<=50;x++){
            for(int y=x;y<=50;y++){
                for(int z=y;z<=50;z++){
                    while(x*x+y*y+z*z==3*x*y*z){
                        System.out.print(x+" "+y+" "+z);
                        
                    }
                }
            }
        }
        
        
        
    }
    
}
