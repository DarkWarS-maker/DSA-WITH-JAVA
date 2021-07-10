import java.util.*;



public class Pattern2 {

    public static Scanner sc=new Scanner(System.in);

    public static void printPattern(int n){
        int nst=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*\t");
            }
            nst-=1;
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=sc.nextInt();
        printPattern(n);
        
    }

    
}
