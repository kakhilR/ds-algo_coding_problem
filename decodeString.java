// given string word = "3[ab2[cd]e]2[fg]p" 
// output = abcdcdeabcdcdeabcdcdefgfgp

import java.util.*;

// algo
//(if != ']') push the character in to stack until find ']'
// if ']' found pop character from stack and convert them to string until '[' found
// check for numbers after '[' convert it to Integer 
// mutilply the constructed string with number reapeat until stack is empty

public class decodeString {
    public static void expandString(String word){
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<word.length();i++){
            if(word.charAt(i) == ']'){
                String temp = "";
                while(stack.isEmpty() == false && stack.peek() != '[' ){
                    temp = stack.get(stack.size()-1) + temp;
                    stack.remove(stack.size()-1);
                }
                stack.remove(stack.size()-1);
                
                String num = "";
                while(stack.isEmpty()== false && Character.isDigit(stack.get(stack.size()-1)) != false){
                    num = stack.get(stack.size()-1) + num;
                    stack.remove(stack.size()-1);
                }
                int number = Integer.parseInt(num);
                String repeat ="";
                for(int s=0;s<number;s++){
                    repeat += temp; 
                }
                
                for(int c =0;c<repeat.length();c++){
                    System.out.println(repeat.charAt(c));
                    stack.push(repeat.charAt(c));
                }
            }
            else{
                stack.push(word.charAt(i));
            }
        }
        String result ="";
        while(stack.isEmpty() == false){
            result = stack.get(stack.size()-1) + result;
            stack.remove(stack.size()-1);
        }
        System.out.println(result+" String");
    }
	public static void main(String[] args) {
	    String word = "3[ab2[cd]e]2[fg]p";
	    expandString(word);
	}
}

// executable code link
// https://www.onlinegdb.com/edit/PjJ5YsK3p