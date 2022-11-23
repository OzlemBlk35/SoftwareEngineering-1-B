/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("bir s sayısı alınız");
        int s=input.nextInt();
      
        int t=0;
        for(int i=1;i<=s-1;i++)
        {
            if(s%i==0)
            {
                t=t+i;
            }
            else if(s==t)
            {
                System.out.println("Mükemmel sayı");
            }
            else
            {
                System.out.println("Mükemmel sayı değildir");
            }
        }
        
        
        
        
        
        
    }
    
}
