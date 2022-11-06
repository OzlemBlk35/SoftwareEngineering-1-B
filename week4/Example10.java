/*f(x)=x^2-5*x+3
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
        System.out.println("Klavyeden bir x sayısı al");
        int x=input.nextInt();
        int fonksiyon=-(x^2-5*x+3);
        if(fonksiyon<0)
        {
            System.out.println("-1");
        }
        
        else if(fonksiyon==0)
        {
            System.out.println("0");
        }
        else if(fonksiyon>0)
        {
            System.out.println("1");
        }
        System.out.println("fonksiyon"+fonksiyon);
            
           
            
    }
        
        
                
    }
    

