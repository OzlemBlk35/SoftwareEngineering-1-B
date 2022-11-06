/*Girilen pozitif bir tamsayının, iki sayının kareleri toplamı şeklinde yazılıp yzılamayacağını hesaplayan program 
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
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int s=input.nextInt();
        int a;
        int b;
        System.out.println("\na-b");
        System.out.println("=====");
        for(a=0;a<=s;a++)
        {
            for(b=0;b<=s;b++)
            {
                if(a*a+b*b==s)
                {
                    System.out.println(a+"-"+b);
                }
            }
        }
        
        
        
        
        
        
    }
    
}
