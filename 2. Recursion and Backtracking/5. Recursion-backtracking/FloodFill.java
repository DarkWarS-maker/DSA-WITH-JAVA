import java.util.*;

public class FloodFill {

    public static Scanner sc=new Scanner(System.in);


    public static void findPath(int arr[][],String asf,int sr,int sc,int dr,int dc){

        if(sr==(dr-1) && sc==(dc-1)){
            System.out.println(asf);
        }

        //we can use visited arr

        if(sr<0 || sc< 0 || sr==dr || sc==dc || arr[sr][sc]==1){
            return;
        }

        arr[sr][sc]=1;


        //right
        findPath(arr, asf+'r', sr, sc+1, dr, dc);

        

        //left
        findPath(arr, asf+'l', sr, sc-1, dr, dc);
       
        

        //top
        findPath(arr, asf+'t', sr-1, sc, dr, dc);
        
        

        //bottom
        findPath(arr, asf+'d', sr+1, sc, dr, dc);

        arr[sr][sc]=0;
        
        

    }

    public static void floodfill(int[][] maze, int sr, int sc,String asf) {
        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }

        if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 1 || maze[sr][sc] == 1) {
            return;
        }


        maze[sr][sc] = 1;

        //top move
        floodfill(maze, sr - 1, sc,asf + "t");
        //left move
        floodfill(maze, sr, sc - 1,asf + "l");
        //down move
        floodfill(maze, sr + 1, sc,asf + "d");
        //right move
        floodfill(maze, sr, sc + 1,asf + "r");

        maze[sr][sc] = 0;

    }

    public static void main(String[] args) {
        int n=sc.nextInt();
        int m=sc.nextInt();

        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
       // findPath(arr,"",0,0,n,m);
        floodfill(arr,0,0,"");
        
    }
    
}
