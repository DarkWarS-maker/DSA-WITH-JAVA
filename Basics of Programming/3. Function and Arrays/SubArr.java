import java.util.*;

public class SubArr {

    public static Scanner sc=new Scanner(System.in);


    public static void printSubArray(int arr[]){
        int n=arr.length;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[]){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printSubArray(arr);

    }

    
}
