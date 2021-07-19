import java.util.*;
public class MazePathWithJump {

    public static Scanner sc=new Scanner(System.in);

    public static void printMazePath(int sr, int sc, int dr, int dc, String ans) {

        if (sr == dr && sc == dc) {
            System.out.println(ans);
            return;
        }

        // Horizontal
          
        for(int i=1;sc+i<=dc;i++){
            printMazePath(sr, sc + i, dr, dc, ans + "H"+i);
        }
       
        // Vertical
        for(int i=1;sr+i<=dr;i++){
            printMazePath(sr+i, sc, dr, dc, ans + "V"+i);
        }
    }


    
    public static void main(String[] args) {
        int dr = sc.nextInt();
        int dc = sc.nextInt();
        printMazePath(1, 1, dr, dc, "");
    }
    
}
