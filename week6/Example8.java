/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Bir a sayısı giriniz");
        int a=input.nextInt();
        System.out.println("Bir b sayısı giriniz");
        int b=input.nextInt();
        
        int ta=0;
        int tb=0;
        
        for(int i=1;i<=a-1;i++)
        {
            if(a%i==0)
            {
             ta=ta+i;   
            }    
        }
        for(int i=1;i<=b-1;i++)
        {
            if(b%i==0)
            {
                tb=tb+i;
            }
        }
         if(ta==b && tb==a)
         {
             System.out.println("dost sayılar");
         }
         else 
         {
             System.out.println("dost sayılar değil");
         }
        
        
        
        
    }
    
}
