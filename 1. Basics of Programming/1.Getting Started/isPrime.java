import java.util.*;
public class isPrime {

    public static boolean isprime(int n){
          
        for(int i=2;i<n;i++){
            
            if(n%2==0){
                return false;
            }
        }
        return true;
    }

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
   int t=scn.nextInt();
   while(t>0){
       int n=scn.nextInt();
        if(isprime(n)){

       
       System.out.println("prime");
   }
   else{
       System.out.println("not prime");
   }
   t--;
       
       
   }
  
    

 }
    
}
