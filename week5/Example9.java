/*
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
        Scanner input=new Scanner(System.in);
        System.out.println("Klavyeden bir s sayısı alın");
        int s=input.nextInt();
        int a;
        int b;
        for(a=0;a<=s/3;a++)
        {
            for(b=0;b<=s/5;b++)
            {
                if(3*a+5*b==s)
                {
                    System.out.println(a+","+b);
                }
                
            }
        }
        
        
        
    }
    
}
