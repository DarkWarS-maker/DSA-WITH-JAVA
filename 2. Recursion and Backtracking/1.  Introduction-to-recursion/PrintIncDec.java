import java.util.*;

public class PrintIncDec {

    public static Scanner sc=new Scanner(System.in);

    public static void OutPrintIncDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
         OutPrintIncDec(n-1);
         System.out.println(n);

    }
  
    public static void main(String[] args) {
        int n=sc.nextInt();
        OutPrintIncDec(n);
    }
    
}
