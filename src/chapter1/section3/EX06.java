package chapter1.section3;

import com.sun.org.apache.xpath.internal.operations.String;

public class EX06 {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            q.enqueue(i);
        }
        for (int i : q) {
            System.out.print(i);
        }
        while(!q.isEmpty()) {
            stack.push(q.dequeue());
        }
        while(!stack.isEmpty()) {
            q.enqueue(stack.pop());
        }
        System.out.println();
        for (int i : q){
            System.out.print(i);
        }

    }

}
