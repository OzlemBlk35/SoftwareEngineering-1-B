/*Klavyeden girilen pozitif tamsayının "Ore sayısı"olup olmadığını test eden program.
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example33 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        float a=input.nextFloat();
        int s=0;
        float t=0;
        for(int i=1;i<=a;i++){
            if(a%i==0)
            {
                s=s+1;
                t=t+(1/i);
            }
        }
        float ho=s/t;
        if(ho==(int)ho)        
        {
            System.out.println("Ore sayısıdır");
        }
        else
        {
            System.out.println("Ore sayısı değildir");
        }
        
        
    }
    
}
