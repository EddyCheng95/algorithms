package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

public class Test {
    public static void main(String[] args) {
        System.out.println(Math.abs(-2147483648));
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println('b');
        System.out.println((char)('a' + 4));
        //参与运算时先将'a'转换为int值

        double t = 9.0;
        while (Math.abs(t - 9.0/t) > 0.001) {
            t = (9.0/t + t) / 2.0;
            StdOut.printf("%.5f\n", t);
        }

        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;

        StdOut.println(sum);

        int sum1 = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sum1++;

        StdOut.println(sum1);
    }
}
