import java.util.*;

public class PrintAllPrime {

    public static boolean isprime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
            
        }
       return true;
        
        
        
    }
    
    public static void giveNum(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.println("Prime");
            }
            
            else{
                System.out.println("Not Prime");
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          giveNum(n);
    }
    
}
