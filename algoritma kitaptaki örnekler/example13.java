/*Klavyeden girilen AB doğru parçasının uzunluğunu "altın oran"'a uygun bölerek AC ve CB uzunluklarını yazdıran program
 * 
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir AB uzunluğu giriniz");
        double ab= input.nextDouble();
        double cb=2*ab/(1+Math.pow(5, 0.5));
        double ac=ab-cb;
        System.out.println(ac);
        System.out.println(cb);
        
    }
    
}
