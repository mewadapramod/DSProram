package arrayNumber;

import java.util.Stack;

public class MakeStringGreat {

    public static String makeStringGood(String str) {

        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (char current : chars) {

            if (stack.size() == 0) {

                stack.push(current);
            } else {
                char top = stack.peek();
                if (Character.toUpperCase(current) == Character.toUpperCase(top)) {


                    if (Character.isUpperCase(current) && Character.isLowerCase(top) || Character.isUpperCase(top) && Character.isUpperCase(current)) {
                        stack.pop();

                    }
                    else{

                        stack.push(current);
                    }

                }else{
                    stack.push(current);
                }
            }
        }
        StringBuilder result = new StringBuilder();

        while(stack.size() != 0){
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }

    public static  void main(String[]args){

        System.out.println(makeStringGood("leEeetcoode"));
        System.out.println(makeStringGood("abBAcC"));

    }
}
