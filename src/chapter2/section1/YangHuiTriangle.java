package chapter2.section1;

/**
 * @author eddy
 * @date 2019-06-09 23:23
 */
public class YangHuiTriangle {
    public static void main(String[] args) {
        int rows = 10;
        for (int i = 0; i < rows; i++) {
            int num = 1;
            for (int j = 0; j < 10 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                String s = num + "";
                int space = 4 - s.length();
                System.out.print(num);
                for (int k = 0; k < space; k++) {
                    System.out.print(" ");
                }
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

//    public static void main(String[] args) {
//        int rows = 10;
//
//        for(int i =0;i<rows;i++) {
//            int number = 1;
//            //打印空格字符串
//            System.out.format("%"+(rows-i)*2+"s","");
//            for(int j=0;j<=i;j++) {
//                System.out.format("%4d",number);
//                number = number * (i - j) / (j + 1);
//            }
//            System.out.println();
//        }
//    }
}
