import java.util.*;

public class PrintFib {
    public static void printFib(int n){
        int a=0;
        int b=1;
        
        for(int i=1;i<=n;i++){
            System.out.println(a);
            int sum=a+b;
            a=b
            b=sum;
            
        }
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    printFib(n);
    
 }
    
}
