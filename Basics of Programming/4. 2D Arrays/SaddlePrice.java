import java.util.*;
public class SaddlePrice {

    public static Scanner sc=new Scanner(System.in);

    public static void findSaddlePoint(int arr[][],int n){
        

    }

    public static void main(String args[]){
        int n=sc.nextInt();
        int arr[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        findSaddlePoint(arr,n);

    }
    
}
