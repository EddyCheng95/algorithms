package chapter1.section3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

public class    Evaluate {
//    public static void main(String[] args) {
//        Stack<String> ops = new Stack<>();
//        Stack<Double> vals = new Stack<>();
//        while (!StdIn.isEmpty()) {
//            String s = StdIn.readString();
//            if (s.equals("("));
//            else if (s.equals("+")) ops.push(s);
//            else if (s.equals("-")) ops.push(s);
//            else if (s.equals("*")) ops.push(s);
//            else if (s.equals("/")) ops.push(s);
//            else if (s.equals("sqrt")) ops.push(s);
//            else if (s.equals(")")) {
//                String op = ops.pop();
//                double v = vals.pop();
//                if (op.equals("+")) v = vals.pop() + v;
//                if (op.equals("-")) v = vals.pop() - v;
//                if (op.equals("*")) v = vals.pop() * v;
//                if (op.equals("/")) v = vals.pop() / v;
//                if (op.equals("sqrt")) v = Math.sqrt(v);
//                vals.push(v);
//            }
//            else vals.push(Double.parseDouble(s));
//        }
//        StdOut.println(vals.pop());
//    }
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vls = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("(")) ;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double v = vls.pop();
                if (op.equals("+")) v = vls.pop() + v;
                if (op.equals("-")) v = vls.pop() - v;
                if (op.equals("*")) v = vls.pop() * v;
                if (op.equals("/")) v = vls.pop() / v;
                if (op.equals("sqrt")) v = Math.sqrt(v);
                vls.push(v);
            } else vls.push(Double.parseDouble(s));
        }
        StdOut.println(vls.pop());
    }
}
