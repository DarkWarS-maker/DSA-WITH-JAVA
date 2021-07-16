import java.util.*;


public class ReverseArr {

    public static Scanner sc=new Scanner(System.in);

    public static void swap(int arr[],int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static void reverseArr(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;


        }
    }

    public static void main(String args[]){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverseArr(arr);

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
    
}
