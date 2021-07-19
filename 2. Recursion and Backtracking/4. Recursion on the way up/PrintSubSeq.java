import java.util.*;

public class PrintSubSeq {

    public static Scanner sc = new Scanner(System.in);

    public static void PrintSubSeq(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        PrintSubSeq(ros, ans + ch);
        PrintSubSeq(ros, ans);
    }

    public static void  main(String args[]){
        String str=sc.nextLine();
        PrintSubSeq(str,"");
    }

}
