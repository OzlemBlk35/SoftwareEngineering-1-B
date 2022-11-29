/*Klavyeden girilen terim sayısı kadar "Pell sayıları"nıekrana yazdıran program.
 */import java.util.Scanner;
 

/**
 *
 * @author Asus
 */
public class example45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir terim sayısı giriniz");
        int n=input.nextInt();
        int p1=0;
        int p2=1;
        System.out.println(p1+" "+p2);
        for(int i=1;i<n-2;i++){
            int p3=2*p2+p1;
            System.out.println("p3:"+p3);
             p1=p2;
             p2=p3;
                
        }
    
}}
