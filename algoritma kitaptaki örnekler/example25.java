/*x>1 ve y>1 tamsayıları için x^y+y^x şeklinde elde edilebilen sayılara,"Leyland sayıları"denir.Klavyeden girilen x ve y değerleri içinmümkün olan
tüm Leyland sayılarını hesaplayıp ekrana yazdıran program
 *
 */import java.util.Scanner;


/**
 *
 * @author Asus
 */
public class example25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir x değeri giriniz");
        int x=input.nextInt();
        System.out.println("Lütfen bir y değeri giriniz");
        int y=input.nextInt();
        for(int i=2;i<=x;i++)
        {
            for(int j=2;j<=y;j++)
            {
                System.out.println(i^j+j^i);
            }
        }
    }
    
}
