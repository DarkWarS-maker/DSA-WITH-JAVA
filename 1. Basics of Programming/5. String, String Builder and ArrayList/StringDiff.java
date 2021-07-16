import java.util.*;

public class StringDiff {
    public static String solution(String str){
		 String ans="";

         ans+=str.charAt(0);
         int n=str.length();
         int i=1;
         while(i<n){
             int diff=str.charAt(i)-str.charAt(i-1);
             ans+=diff;
             ans+=str.charAt(i);
             i++;


         }


		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

    
}
