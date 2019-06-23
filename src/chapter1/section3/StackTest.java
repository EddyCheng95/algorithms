package chapter1.section3;

public class StackTest {
    public static void main(String[] args) {
        ResizingArrayStack<Integer> rs = new ResizingArrayStack();
        rs.push(12);
        rs.push(13);
        rs.push(14);
        rs.push(15);
        rs.push(16);
        rs.push(17);
        System.out.println(rs.pop());
        for (Integer i : rs) {
            System.out.println(i);
        }

    }
}
