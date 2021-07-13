import java.util.*;

public class TheStateOfWankanda {

    public static Scanner sc=new Scanner(System.in);

    public static void printDiagonally(int arr[][],int n,int m){
        int sr=0;
        int sc=0;
        

        int step=0;
        while(step!=m){
            int j=step;
            for(int i=0;i<n && j<m ;i++,j++){
                System.out.println(arr[i][j]);
            }
              step++;
            
        }
    }

    public static void main(String args[]){
        int n=sc.nextInt();
        int arr[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printDiagonally(arr,n,n);


    }
    
}
