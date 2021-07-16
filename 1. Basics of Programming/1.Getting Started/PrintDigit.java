import java.util.*;

public class PrintDigit {
    public static int  powerDigit(int n){
        n=n/10;
        int pr=1;
        while(n!=0){
            n=n/10;
            pr=pr*10;
        }
        return pr;
    }
    
    public static  void printFord(int n){
        
        int pr=powerDigit(n);
        while(pr!=0){
            int a=n/pr;
            System.out.println(a);
            n=n%pr;
            pr=pr/10;
        }
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  printFord(n);
  
 }
    
}
