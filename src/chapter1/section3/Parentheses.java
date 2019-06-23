package chapter1.section3;

import java.util.Scanner;

public class Parentheses {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String s = sca.nextLine();
        char[] a = s.toCharArray();
        Stack<Character> sta = new Stack<>();
        for (char c : a) {
            if (c=='{' || c=='[' || c=='(') {
                sta.push(c);
            } else {
                if(c=='}') {
                    if (sta.pop() != '{') {
                        System.out.println("false!");
                        return;
                    }
                } else if(c==']') {
                    if (sta.pop() != '[') {
                        System.out.println("false!");
                        return;
                    }
                } else if(c==')') {
                    if (sta.pop() != '(') {
                        System.out.println("false!");
                        return;
                    }
                }

            }
        }

        System.out.println("true");

    }
}
