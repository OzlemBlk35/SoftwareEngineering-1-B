/*Klavyeden Girilen Pozitif Tamsayıyı Tersten Yazdıran Program
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Example12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("Klavyeden bir a sayısı alınız");
        int a = input.nextInt();
        int k=a;
        
        
        while (k!=0)
        {
            System.out.println(k%10);
            k/=10;     
        }
        // TODO code application logic here
       
           
          
        } 
        
    }
