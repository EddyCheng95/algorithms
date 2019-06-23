package chapter1.section1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        //数组必须是有序的
        int lo = 0;
        int hi = a.length-1;
        while (lo <= hi) {
            //被查找的键要么不存在，要么必然存在于a[lo...hi]之中
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int N = in.nextInt();
        int[] whitelist = new int[N];
        for (int i = 0; i < N; i++)
            whitelist[i] = (int)(Math.random() * 100);
        int key;
        Arrays.sort(whitelist);
        System.out.println("请输入你要查找的数：");
        while ((key = in.nextInt()) != -1) {
            if (rank(key, whitelist) < 0)
                System.out.println(key + "不在白名单");
            else System.out.println(key + "在白名单");

        }
    }
}
