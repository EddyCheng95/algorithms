package chapter1.section2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

/**
 * In和Out的用例示例
 */
public class Cat {
    public static void main(String[] args) {
        //将所有输入文件复制到输出流（最后一个参数）中
        String[] arr = {"in1.txt", "in2.txt"};
        Out out = new Out("out.txt");
        for (int i = 0; i < arr.length; i++) {
            In in = new In(arr[i]);
            String s = in.readAll();
            out.println(s);
            in.close();
        }
        out.close();
    }
}
