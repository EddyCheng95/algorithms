package chapter2.section1;

import chapter2.section3.Quick3way;

import java.util.Scanner;

/**
 * @author eddy
 * @date 2019-06-16 21:34
 * 第二章所有的排序，在此分别测试，后期改为junit测试
 */

public class SortTestEach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数组长度:");
        int N = in.nextInt();
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = (int)(Math.random()*10000);
        }
        System.out.println("排序前的数组：");
        Quick3way.show(a);
        long start = System.currentTimeMillis();
        Quick3way.sort(a);
        long end = System.currentTimeMillis();
        System.out.println("排序后的数组：");
        Quick3way.show(a);
        System.out.println("排序所用时间：" + (end - start) +"ms");
    }
}
