import java.util.*;

public class FloodFill {

    public static Scanner sc=new Scanner(System.in);


    public static void findPath(int arr[][],String asf,int sr,int sc,int dr,int dc){

        if(sr==dr && sc==dc){
            System.out.println(asf);
        }

        //we can use visited arr

        arr[sr][sc]=1;


        //right

        if(sc+1<=dc && arr[sr][sc]!=1){
            findPath(arr, asf+r, sr, sc+1, dr, dc);
        }

        //left
        if(sc-1>=0 && arr[sr][sc]!=1){
            findPath(arr, asf+l, sr, sc-1, dr, dc);
        }

        //top
        if(sr-1>=0 && arr[sr][sc]!=1){
            findPath(arr, asf+t, sr-1, sc, dr, dc);
        }

        //bottom
        if(sr+1<=dr && arr[sr][sc]!=1){
            findPath(arr, asf+b, sr+1, sc, dr, dc);

        }

    }

    public static void main(String[] args) {
        int n=sc.nextInt();
        int m=sc.nextInt();

        int arr[]=new int[n][m];
        findPath(arr,"",0,0,n,m);
        
    }
    
}
