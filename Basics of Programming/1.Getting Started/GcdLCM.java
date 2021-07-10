import java.util.*;

public class GcdLCM {
    public static Scanner sc=new Scanner(System.in);
        
    
    public static void main(String[] args) {
      // write your code here  
      
      int n1=sc.nextInt();
      int m2=sc.nextInt();
      int n=n1;
      int m=m2;
      while(n%m!=0){
          int rem=n%m;
          n=m;
          m=rem;
          
      }
      int hcf=m;
      int lcm=(n1*m2)/hcf;
      System.out.println(hcf);
      System.out.println(lcm);
      
     }
    
}
