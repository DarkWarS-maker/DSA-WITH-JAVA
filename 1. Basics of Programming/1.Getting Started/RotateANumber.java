import java.util.*;

public class RotateANumber {
    public static int countDigit(int n){
        int ans=0;
        while(n!=0){
            n=n/10;
            ans++;
            
        }
        return ans;
    }
    
    public static int rotateNum(int n,int r){
        int cd=countDigit(n);
        int mul=1;
        int div=1;
        for(int i=1;i<=cd;i++){
            if(i<=r){
                div*=10;
            }
            else{
                mul*=10;
                
            }
        }
        int a=n%div;
        int b=n/div;
        
        return (a*mul)+b;
    }
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
       int ans= rotateNum(n,r);
       System.out.println(ans);
    }
}
    
    


