package chapter2.section1;

import edu.princeton.cs.algs4.StdIn;

/**
 * @author eddy
 * @date 2019-06-09 20:02
 *
 * 希尔排序
 *
 * 方法1大概是方法2的2到3倍
 *
 *
 * 希尔排序的排序效率和选择步长序列有直接关系，相关步长序列如下，目前最好的序列是 4、塞奇威克（Sedgewick） 的步长序列
 * 有多种步长序列：
 * 1、希尔（Shell）原始步长序列：N / 2，N / 4，...，1（重复除以2）;
 * 2、希伯德（Hibbard）的步长序列：1，3，7，...，2 k - 1;
 * 3、克努特（Knuth）的步长序列：1，4，13，...，（3 k - 1）/ 2;
 * 4、塞奇威克（Sedgewick） 的步长序列：1，5，19，41，109，....
 * 　　它是通过交织两个序列的元素获得的： 步长序列数组下标 n 从0开始
 *
 * 　　n偶数用 ：1，19，109，505，2161，...，9（4 k - 2 k）+ 1，k = 0,1,2,3，...
 *
 * 　　n奇数用 ：5，41，209，929，3905，...。k + 2（2 k + 2 - 3）+ 1，k = 0,1,2,3，...
 */
public class Shell {

    /*
    method1:
    使用的是：克努特（Knuth）的步长序列：1，4，13，...，（3 k - 1）/ 2;
     */
    public static void sort(Comparable[] a) {
//        int N = a.length;
//        int h  = 1;
//        while (h < N/3) {
//            h = 3 * h + 1;
//        }
//        while (h >= 1) {
//            for (int i = h; i < N; i++) {
//                for (int j = i; j >= h && less(a[j], a[j- h]); j -= h) {
//                    exch(a, j, j - h);
//                }
//            }
//            h = h/3;
//        }

       int N = a.length;
       int h = 1;
       while (h < N / 3) {
           h = 3 * h + 1;
       }
       while (h >= 1) {
           for (int i = h; i < N; i ++){
               for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
                   exch(a, j, j-h);
               }
           }
           h /= 3;
       }
    }

    /*
    method2:
    使用的的是：希尔（Shell）原始步长序列：N / 2，N / 4，...，1（重复除以2）;
     */
//    public static void sort (Comparable[] a) {
//        int N = a.length;
//        for (int h = N/2; h >= 1; h /= 2) {
//            for (int i = h; i < N; i++) {
//                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
//                    exch(a, j, j-h);
//                }
//            }
//        }
//    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i-1])) {
                return false;
            }
        }
        return true;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
