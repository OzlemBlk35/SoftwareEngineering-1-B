/*N tane şirketin bir yıla ait aylık kar oranları,bilgisayara girilmektedir.buna göre;
 1.Herbir şirketin yıllık ortalama kar miktarlarını.
 2.Herbir şirketin en az ve en fazla kar elde ettiği ayları ve miktarlarını.
 3.Herbir aya ait en az ve en fazla kar miktarları ve şirketleri veren program.
 */import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class example14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen şirket sayısını giriniz");
        int N=input.nextInt();
        int [][]A=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<12;j++){
                System.out.println("A matrisinin "+i+" inci satırı ve "+j+" ıncı sütunu");
                A[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            int yıllıkKar=0;
            for(int j=0;j<12;j++){
                yıllıkKar+=A[i][j];
            }
            yıllıkKar=yıllıkKar/12;
            System.out.println(i+"inci şirketin yıllık karı: "+yıllıkKar);
        }
        for(int i=0;i<N;i++){
            int fazlaKar=A[i][1];
            int azKar=A[i][1];
            int fazlaKarAy=1;
            int azKarAy=1;
            for(int j=1;j<=12;j++){
                if(A[i][j]<azKar){
                    azKar=A[i][j];
                    azKarAy=j;
                }
                else
                {
                    if(A[i][j]>fazlaKar){
                        fazlaKar=A[i][j];
                        fazlaKar=j;
                    }
                }
            }
            System.out.println(i+". şirket için en az kar miktarı: "+azKar);
            System.out.println(i+". şirket için en fazla kar miktarı: "+fazlaKar);
            System.out.println(i+". şirketin en az kar yaptığı ay: "+azKarAy);
            System.out.println(i+". şirketin en fazla kar yaptığı ay: "+fazlaKarAy);
        }
        
        for(int j=0;j<12;j++){
            int Az=A[1][j];
            int Fz=A[1][j];
            int Azs=1;
            int Fzs=1;
            for(int i=1;i<N;i++){
                if(A[i][j]<Az){
                    Az=A[i][j];
                    Azs=i;
                }
                else
                {
                    if(A[i][j]>Fz){
                        Fz=A[i][j];
                        Fzs=i;
                    }
                }
            }
            System.out.println(j+". ay için en az kar miktarı: "+Az);
            System.out.println(j+". ay için en fazla kar miktarı: "+Fz);
            System.out.println(j+". aya ait en az karı elde eden şirket: "+Azs);
            System.out.println(j+". aya ait en fazla karı elde eden şirket: "+Fzs); 
                    
        }
        
        
        
        
    }
    
}
