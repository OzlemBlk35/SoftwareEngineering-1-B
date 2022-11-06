/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.util.Scanner;
 

/**
 *
 * @author Asus
 */
public class Example10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Klavyeden bir satır değeri alınız");
        int a=input.nextInt();
        System.out.println();
        
        for(int i=0;i<a;i++)
        {
            for(int j=a;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
        
        
    }
    
}
