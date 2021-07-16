import java.util.*;

public class Fact {

    public static Scanner sc=new Scanner(System.in);

    public static int findFact(int n){
        if(n==0){
            return 1;
        }

        int factAns=findFact(n-1);
        return n*factAns;
    }

    public static void main(String args[]){

        int n=sc.nextInt();
        int ans=findFact(n);
        System.out.println(ans);

    }
    
}
