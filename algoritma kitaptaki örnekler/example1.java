/*Klavyeden girilen x değerinin kosinüs'ünü belirtilen terim sayısına kadar seriye açarak hesaplayan program 
 *
 */import java.util.Scanner;


public class example1 {

    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir açı değeri giriniz");
        Double aci=input.nextDouble();
        System.out.println("Lütfen bir terim sayısı giriniz");
        int N =input.nextInt();
        int t=1;
        double F;
        int J;
        double x;
        x=Math.toRadians(aci);
        for(int i=1;i<N-1;i++){
            F=1;
            for(J=1;J<2*i;J++)
            F*=J;
            J*=(-1);
            t+=J*Math.pow(x, 2*i)/F;
            System.out.printf("\nSeri açılımı ile hesaplanan değer:%.5f\n",t); 
          
            
            
        }
        
        
        
                
                
                
                
                
        
        
        
        
        
        
        
        
        
        
    }
    
}
