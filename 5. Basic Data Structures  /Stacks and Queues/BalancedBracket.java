import java.util.*;
public class BalancedBracket {
    public static Scanner sc =new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String str=sc.nextLine();
        
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
                
            }
            else if(ch==')'){
                if(st.size()==0){
                    System.out.println(false);
                    return;
                }
                else if(st.peek()!='('){
                    System.out.println(false);
                    return;
                    
                }
                else{
                    st.pop();
                }
            }
            else if(ch==']'){
                 if(st.size()==0){
                    System.out.println(false);
                    return;
                }
                else if(st.peek()!='['){
                    System.out.println(false);
                    return;
                    
                }
                else{
                    st.pop();
                }
                
            }
            else if(ch=='}'){
                 if(st.size()==0){
                    System.out.println(false);
                    return;
                }
                else if(st.peek()!='{'){
                    System.out.println(false);
                    return;
                    
                }
                else{
                    st.pop();
                }
                
            }
            else{
                
            }
        }
        if(st.size()!=0){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }

    }

    
}
