import java.util.*;

public class PrintKPC {

    public static Scanner sc = new Scanner(System.in);

    public static String[] nokiaKeys = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKPCNum(String str, String ans) {

        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        int idx = ch - '0';

        String ros = str.substring(1);
        String arre = nokiaKeys[idx];
        for (int i = 0; i < arre.length(); i++) {
            printKPCNum(ros, ans + arre.charAt(i));
        }

    }

    public static void main(String args[]){
        String num=sc.nextLine();
        printKPCNum(num,"");


    }

}
