import java.util.*;

public class PrintReverse {
    public static void printReverse(int n){
        while(n!=0){
            int a=n%10;
            System.out.println(a);
            n=n/10;
        }
    }

public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          printReverse(n);
 }
    
}
