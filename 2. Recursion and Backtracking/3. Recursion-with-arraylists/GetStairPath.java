import java.util.*;

public class GetStairPath {

    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<String> getPath(int n) {

        if(n==0){
            ArrayList<String> bs=new ArrayList<>();
            bs.add
            return bs;
        }
        if(n<0){
            ArrayList<String> bs=new ArrayList<>();
          
            return bs;

        }

        ArrayList<String> path1 = getPath(n - 1);
        ArrayList<String> path2 = getPath(n - 2);
        AbstractList<String> path3 = getPath(n - 3);

        ArrayList<String> ans = new ArrayList<>();
        for (String an : path1) {
            ans.add(1 + an);
        }
        for (String an : path2) {
            ans.add(2 + an);
        }
        for (String an : path3) {
            ans.add(3 + an);
        }

        return ans;

    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<String> ans = getPath(n);
        System.out.println(ans);

    }

}
