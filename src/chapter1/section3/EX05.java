package chapter1.section3;

/**
 * 存进N的2进制形式
 */
public class EX05 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int N = 50;
        while(N > 0) {
            stack.push(N%2);
            N /= 2;
        }
        for (int i : stack) {
            System.out.print(i);
        }
    }
}
