package chapter1.section4;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author eddy
 * @date 2019-06-02 22:20
 */
public class DoublingRatio {

    public static void main(String[] args) {
        double prev = DoublingTest.timeTrial(125);
        for (int N = 250; true; N += N) {
            double time =DoublingTest.timeTrial(N);
            StdOut.printf("%7d %5.1f ", N, time);
            StdOut.printf("%5.1f\n", time/prev);
            prev = time;
        }
    }
}
