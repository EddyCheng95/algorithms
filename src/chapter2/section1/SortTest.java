package chapter2.section1;

import chapter2.section2.Merge;
import chapter2.section2.MergeBU;
import chapter2.section3.Quick;
import chapter2.section3.Quick3way;

import java.util.Scanner;

/**
 * @author eddy
 * @date 2019-06-15 21:53
 * 第二章所有的排序一起测试，以对比排序速度
 */
public class SortTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数组长度:");
        int N = in.nextInt();
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = (int)(Math.random()*100);
        }
//        System.out.println("排序前的数组：");
//        Selection.show(a);
        Integer[] b = a;
        Integer[] c = a;
        Integer[] d = a;
        Integer[] e = a;
        Integer[] f = a;

        System.out.println("选择排序所用时间: " + selectionSort(a) + "ms");
        System.out.println("插入排序所用时间: " + insertionSort(b) + "ms");
        System.out.println("希尔排序所用时间: " + shellSort(c) + "ms");
        System.out.println("自顶向下的归并排序所用时间: " + mergeSort(d) + "ms");
        System.out.println("自底向上的归并排序所用时间: " + mergeBUSort(e) + "ms");
        System.out.println("快速排序所用时间: " + quickSort(f) + "ms");
    }


    /*
    测试选择排序
     */
    private static long selectionSort(Comparable[] a) {
        long start = System.currentTimeMillis();
        Selection.sort(a);
        long end = System.currentTimeMillis();
//        System.out.println("排序后的数组：");
//        Selection.show(a);
        return end - start;
    }

    /*
    测试插入排序
     */
    private static long insertionSort(Comparable[] a) {
        long start = System.currentTimeMillis();
        Insertion.sort(a);
        long end = System.currentTimeMillis();
//        System.out.println("排序后的数组：");
//        Insertion.show(a);
        return end - start;
    }

    /*
    测试希尔排序
     */
    private static long shellSort(Comparable[] a) {
        long start = System.currentTimeMillis();
        Shell.sort(a);
        long end = System.currentTimeMillis();
//        System.out.println("排序后的数组：");
//        Shell.show(a);
        return end - start;
    }

    /*
    测试自顶向下的归并排序
     */
    private static long mergeSort(Comparable[] a) {
        long start = System.currentTimeMillis();
        Merge.sort(a);
        long end = System.currentTimeMillis();
//        System.out.println("排序后的数组：");
//        Merge.show(a);
        return end - start;
    }

    /*
    测试自底向上的归并排序
     */
    private static long mergeBUSort(Comparable[] a) {
        long start = System.currentTimeMillis();
        MergeBU.sort(a);
        long end = System.currentTimeMillis();
//        System.out.println("排序后的数组：");
//        MergeBU.show(a);
        return end - start;
    }

    /*
    测试快速排序
     */
    private static long quickSort(Comparable[] a) {
        long start = System.currentTimeMillis();
        Quick.sort(a);
        long end = System.currentTimeMillis();
//        System.out.println("排序后的数组：");
//        Quick.show(a);
        return end - start;
    }

    private static long quick3waySort(Comparable[] a) {
        long start = System.currentTimeMillis();
        Quick3way.sort(a);
        long end = System.currentTimeMillis();
        System.out.println("排序后的数组：");
        Quick3way.show(a);
        return end - start;
    }

}
