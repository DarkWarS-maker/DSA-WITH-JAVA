import java.util.*;

public class GetKPC {
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String str=sc.nextLine();
        ArrayList<String> ans=getKPC(str);
        System.out.println(ans);
        

    }
    
    public static String arr[]={ ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {
        
       if(str.length()==0){
           ArrayList<String> base=new ArrayList<>();
           base.add("");
           
           return base;
       }
       int ch=str.charAt(0)-'0';
       String word=arr[ch];
       ArrayList<String> recAns=getKPC(str.substring(1));
       
       ArrayList<String> myAns=new ArrayList<>();
       for(int i=0;i<word.length();i++){
            char chr=word.charAt(i);
            for(String a:recAns){
                myAns.add(chr+a);
            }
       }
       return myAns;
    }
    
}
