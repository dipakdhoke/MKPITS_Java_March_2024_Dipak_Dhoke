package Stack;

import java.util.Stack;

public class Stackprac {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.add("Dipak");
        stack.add("Sumit");
        stack.add("sujal");
        stack.add("saurabh");
        for (int i=0;i<stack.size();i++){
            System.out.println(stack.elementAt(i));
        }
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.push("sanjay"));

        System.out.println(stack);
    }
}
