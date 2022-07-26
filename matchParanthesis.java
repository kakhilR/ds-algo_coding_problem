import java.util.*;

class matchParanthesis{
    public static void isMatched(String str){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if((x=='[') || (x=='{') || (x=='(')){
                stack.push(x);
                continue;
            }
            if(stack.isEmpty()){
                System.out.println(false);
            }

            if(x == ']'){
                if(stack.peek()=='[' ){
                    stack.pop();
                    continue;
                }
                else{
                    System.out.println(false);
                }
            }else if(x == '}'){
                if(stack.peek() == '{'){
                    stack.pop();
                    continue;
                }else{
                    System.out.println(false);
                }
            }else if(x == ')'){
                if(stack.peek() == '('){
                    stack.pop();
                    continue;
                }else{
                    System.out.println(false);
                }
            }else{
                System.out.println(false);
            }
        }
        if(stack.isEmpty()){
            System.out.println(true);
        }
    }
	public static void main(String[] args) {
	    String str = "([{[[]]}])";
	    isMatched(str);
// 		System.out.println("Hello World");
	}
}

//  executable code
// https://www.onlinegdb.com/edit/t1up1Rwl9