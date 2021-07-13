import java.util.*;

public class MatrixMulti {

    public static Scanner sc = new Scanner(System.in);


    public static int[][] printMulti(int arr1[][],int arr2[][]){
        int n1=arr1.length;
        int m1=arr1[0].length;
        int n2=arr2.length;
        int m2=arr2[0].length;
        int ans[][]=new int[n1][m2];
        for(int r=0;r<n1;r++){
            for(int c=0;c<m2;c++){
                for(int k=0;k<m1;k++){
                    ans[r][c]+=arr1[r][k]*arr2[k][c];
                }
            }
        }
        return ans;
    }

    public static void displayArray(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int arr1[][] = new int[n1][m1];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int arr2[][] = new int[n2][m2];

        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        if(m1!=n2){
            System.out.println("Invalid input");
        }
        else{
            int ans[][]=printMulti(arr1,arr2);
            displayArray(ans);
           
        }

    }

}
