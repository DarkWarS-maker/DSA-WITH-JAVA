
import java.util.*;

public class inverseOfNumber {

    public static void main(String[] args) {
        // write your code here  
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int multi=1;
        while(n!=0){
            int rem=n%10;
            sum+=multi*Math.pow(10,rem-1);
            n/=10;
            multi++;
            
        }
        System.out.println(sum);
       }
    
}
