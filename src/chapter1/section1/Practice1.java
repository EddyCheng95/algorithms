package chapter1.section1;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("练习1.1.1：");
        System.out.println((0 + 15) / 2);//7
        System.out.println(2.0e-6 * 1000000000.1);//溢出(错误)。2000.0000002
        System.out.println(true && false || true && true);//true
        System.out.println("练习1.1.2：");
        System.out.println((1 + 2.236) / 2);//1.618
        System.out.println(1 + 2 + 3 + 4.0);//10.0
        System.out.println(4.1 >= 4);//true
        System.out.println(1 + 2 + "3");//"33"
        System.out.println("练习1.1.3：");
//        equal();
        System.out.println("练习1.1.4：");
        int a = 9;
        int b = 10;
        int c = 0;
//      if (a > b) then c = 0;//错误
//      if a > b { c = 0 };错误
        if (a > b) c = 0;//正确
//      if (a > b) c = 0 else b = 0;错误
        System.out.println("练习1.1.5：");
//        doubles();
        System.out.println("练习1.1.6：");
//        printWhat();
        System.out.println("练习1.1.8：");

        System.out.println("练习1.1.7：");


        System.out.println("练习1.1.8：");
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char)('a' + 4));//参与运算时先将'a'转换为int值
    }

     private static void equal(){
         Scanner in = new Scanner(System.in);
         int n1 = in.nextInt();
         int n2 = in.nextInt();
         int n3 = in.nextInt();
         System.out.println(n1 == n2? (n2 == n3? "equal" : "not equal") : "out equal");
     }

     private static void doubles(){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println((x < 1 && x > 0) && (y > 0 && y < 1)? "true" : "false");
     }

     private static void printWhat() {
        int f = 0;
        int g = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
     }
}
