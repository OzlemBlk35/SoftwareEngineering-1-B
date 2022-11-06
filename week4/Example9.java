/* kombinasyon hesaplama
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float f1=1,f2=1,f3=1,k;
        int n,r;
        Scanner klavye=new Scanner(System.in);
        System.out.print("n=");
        n=klavye.nextInt();
        System.out.print("r=");
        r = klavye.nextInt();
        for(int i=1;i<=n;i++)
        {
            f1*=i;if(i<=r)f2*=i;if(i<=n-r)f3*=i;
        }
        k=f1/(f2*f3);
        System.out.println("\nSonuc="+k);
        
    }
    
}
