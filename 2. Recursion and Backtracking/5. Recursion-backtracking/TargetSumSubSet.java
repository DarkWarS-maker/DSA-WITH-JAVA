import java.util.*;

public class TargetSumSubSet {

    public static Scanner sc=new Scanner(System.in);

    public static void printAns(int arr[],int idx,int n,String asf,int tar,int sum){

        if(idx==n){ 
            if(sum==tar){
                System.out.print(asf);
                System.out.println();
            }
            return;
        }

        if(sum>tar){ //nice
            return;
        }

        printAns(arr,idx+1, n, asf+arr[idx]+" ", tar,sum+arr[idx]);
        printAns(arr, idx+1, n, asf, tar,sum);

    }

    public static void main(String[] args) {
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        printAns(arr,0,n,"",tar,0);
        
    }
    
}
