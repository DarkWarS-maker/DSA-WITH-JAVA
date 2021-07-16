import java.util.*;

;public class SpanOfArray {
    public static Scanner sc=new Scanner(System.in);


    public static int  findMax(int arr[],int n){
        int max=-(int)1e9;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }

    public static int findMin(int arr[],int n){
        int min=(int)1e9;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String args[]){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=findMax(arr,n);
        int min=findMin(arr,n);
        int ans=max-min;
        System.out.println(ans);
    }

    
}
