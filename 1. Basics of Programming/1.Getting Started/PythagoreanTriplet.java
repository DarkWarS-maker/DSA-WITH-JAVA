import java.util.*;

public class PythagoreanTriplet {
    public static Scanner sc=new Scanner(System.in);
      
      public static boolean checkPythogorousTriplet(int a,int b,int c){
          return (b * b + c * c == a * a) || (a * a + c * c == b * b) || (a * a + b * b == c * c);
      }
  
  public static void main(String[] args) {
    // write your code here  
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(checkPythogorousTriplet(a,b,c)){
        
         System.out.println("true");
    }
    else{
        System.out.println("false");
    }
   }
}
