package baitap04;

import java.util.Stack;

public class ReverceString {
    public static void main(String[] args) {
        String string = "Để nông dân biết code";
        String[]strings = string.split("\s");
        Stack <String> stack = new Stack<>();
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
            stack.push(strings[i]);
        }
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
