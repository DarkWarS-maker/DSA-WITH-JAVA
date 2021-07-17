import java.util.*;

public class AllIdxOfArr {

    public static Scanner sc = new Scanner(System.in);


    public static int[] allIdx(int arr[],int i,int data,int fd){

        if(i==arr.length){
              int arr1[]=new int[fd];
              return arr1;
        }
        int ans[];
        if(arr[i]==data){
           ans=allIdx(arr, i+1, data, fd+1);
           ans[fd]=i;
           return ans;
        }
        else{
             ans=allIdx(arr, i+1, data, fd);
             return ans;
        }

    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int data=sc.nextInt();
        int ans[] = allIdx(arr, 0, data,0);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

}
