import java.util.*;

public class BenjaminBulbs {
    public static Scanner sc=new Scanner(System.in);
      
      public static void benjaminBulbs(int n){
          for(int i=1;i*i<=n;i++){
              System.out.println(i*i);
          }
          
          
      }
  
  public static void main(String[] args) {
    // write your code here  
    int n=sc.nextInt();
    benjaminBulbs(n);
   }
    
}
