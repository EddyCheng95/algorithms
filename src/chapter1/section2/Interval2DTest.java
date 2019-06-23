package chapter1.section2;

import edu.princeton.cs.algs4.*;

import java.util.Scanner;

/**
 * Interval2D的测试用例
 */
public class Interval2DTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double xlo = in.nextDouble();
        double xhi = in.nextDouble();
        double ylo = in.nextDouble();
        double yhi = in.nextDouble();
        int T = in.nextInt();

        Interval1D xinterval = new Interval1D(xlo, xhi);
        Interval1D yinterval = new Interval1D(ylo, yhi);
        Interval2D box = new Interval2D(xinterval, yinterval);
        box.draw();

        Counter c = new Counter("hits");
        for (int t = 0; t < T; t++) {
            double x = Math.random();
            double y = Math.random();
            Point2D p = new Point2D(x, y);
            if (box.contains(p)) c.increment();
            else p.draw();
        }
        StdOut.println(c);
        StdOut.println(box.area());
    }
}
