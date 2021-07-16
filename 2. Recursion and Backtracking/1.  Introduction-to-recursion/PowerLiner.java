import java.util.*;

public class PowerLiner {

    public static Scanner sc=new Scanner(System.in);

    public static int findPow(int n,int x){
        if(x==0){
            return 1;
        }

        int factAns=findPow(n,x-1);
        return n*factAns;
    }
    public static void main(String[] args) {
        int n=sc.nextInt();
        int x=sc.nextInt();
        int ans=findPow(n,x);
        System.out.println(ans);
        
    }
    
}
