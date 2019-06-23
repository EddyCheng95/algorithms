package chapter2.section2;

import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * @author eddy
 * @date 2019-06-11 22:22
 */
public class MergeBU {
    private static Comparable[] aux;

    public static void sort(Comparable[] a){
       int N  = a.length;
       aux = new Comparable[N];
       for (int sz = 1; sz < N; sz = sz + sz) {
           for (int lo = 0; lo < N-sz; lo += sz+sz) {
               merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
           }
       }
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (less(a[i], a[i-1])) {
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] args) {
//        String[] a = In.readStrings();
//        sort(a);
//        assert isSorted(a);
//        show(a);
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("数组长度： ");
        int length = in.nextInt();
        Integer[] a = new Integer[length];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        sort(a);
        show(a);
    }
}
