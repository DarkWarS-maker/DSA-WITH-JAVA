import java.util.*;
public class DuplicateBrackets {
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String st=sc.nextLine();
        
        Stack<Character> stt=new Stack<>();
        
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            
            if(ch==')'){
                if(stt.peek()=='('){
                    System.out.println("true");
                    return;
                }
                else{
                    while(stt.peek()!='('){
                        stt.pop();
                    }
                    stt.pop();
                }
                
            }
            else{
                stt.push(ch);
            }
        }
        System.out.println("false");

    }
    
}
