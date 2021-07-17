import java.util.*;

public class SubSeqe {

    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<String> getSubSeq(String ans) {

        if (ans.length() == 0) {
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }

        char ch = ans.charAt(0);
        String ros = ans.substring(1);
        
        ArrayList<String> recAns = getSubSeq(ros);
        ArrayList<String> ansR = new ArrayList<>();
        for (int i = 0; i < recAns.size(); i++) {
            String cha = recAns.get(i);
            ansR.add(cha);
            ansR.add(ch + cha);
        }

        return ansR;

    }

    public static void main(String[] args) {
        String str = sc.nextLine();
        ArrayList<String> ans = getSubSeq(str);
        for (int i = 0; i < ans.size(); i++) {
            String cha = ans.get(i);
            System.out.println(cha);
        }

    }

}
