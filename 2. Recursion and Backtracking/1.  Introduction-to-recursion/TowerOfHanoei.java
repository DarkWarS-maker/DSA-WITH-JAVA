import java.util.*;

public class TowerOfHanoei {

    public static Scanner sc=new Scanner(System.in);

     public static void printPath(int n,char sr,char des,char hel){
         if(n==0){
             return;

         }
         printPath(n-1, sr, hel,des);
         System.out.println("Disk "+n+" "+sr+" to "+des);
         printPath(n-1, hel, des, sr);
     }

        public static void main(String[] args) {
            int n=sc.nextInt();
            printPath(n,'A','B','C');

        }

    
}
