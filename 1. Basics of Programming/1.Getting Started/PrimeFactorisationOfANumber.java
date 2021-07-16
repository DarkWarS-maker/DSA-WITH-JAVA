import java.util.*;

public class PrimeFactorisationOfANumber {
    public static void printPrimeFactor(int n){
        for(int i=2;i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
    }

public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  printPrimeFactor(n);
  
  
 }
    
}
