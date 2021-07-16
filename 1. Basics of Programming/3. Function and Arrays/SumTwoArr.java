import java.util.*;

public class SumTwoArr {

    public static Scanner sc=new Scanner(System.in);

    public static void inputArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }

    public static int[] addTwoArry(int arr1[],int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int n3=Math.max(n1,n2);
        int ans[]=new int[n3];
        int k=n3-1;
        int i=n1-1;
        int j=n2-1;
        while(k>=0){
            ans[k]=(i>=0? arr1[i]:0)+(j>=0? arr2[j]:0);
            i--;
            j--;
            k--;
        }
        return ans;



    }
    public static void main(String args[]){
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        inputArr(arr1);
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        inputArr(arr2);
        int ans[]=addTwoArry(arr1,arr2);


       
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
    
}
