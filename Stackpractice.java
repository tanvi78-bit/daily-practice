/*import java.util.*;
public class Stackpractice {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr= stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());     

    }

    }
    }*/

//Balanced Parentheses check using stack 
import java.util.*;
public class Stackpractice {
    public static void main(String[] args) {
        String expression="(a+b)*{c-d}";
        Stack<Character> stack=new Stack<>();
        boolean isBalanced=true;
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(ch=='('|| ch=='{'|| ch=='['){
                stack.push(ch);
            }
            if(ch==')'|| ch=='}'|| ch==']'){
                if(stack.empty()){
                    isBalanced=false;
                    break;
                }
                char top=stack.peek();
                if(ch==')'&& top=='(' || ch=='}'&& top=='{' || ch==']'&& top=='['){
                    stack.pop();
                }else{
                    isBalanced=false;
                    break;
                }
            }
        }
        if(!stack.empty()){
            isBalanced=false;
        }if(isBalanced){
            System.out.println("Balanced Expression");
        }else{
             System.out.println("UnBalanced Expression");
        }

    }
}


