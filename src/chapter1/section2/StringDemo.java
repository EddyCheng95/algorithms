package chapter1.section2;

public class StringDemo {
    /*
    判断字符串是否是一条回文
     */
    public static boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N/2; i++)
            if (s.charAt(i) != s.charAt(N-1-i))
                return false;
        return true;
    }

    /*
    从一个命令行参数中提取文件名和扩展名
     */
    public static String[] fileName(String s) {
        return s.split("\\.");
    }

    /*
    检查一个字符串数组中的元素是否已按照字母表顺序排列
     */
    public static boolean isSorted(String[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1].compareTo(a[i]) > 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        String[] x = fileName("data.txt");
        System.out.println(x[0] + " and " + x[1]);
        String[] a = {"eddy", "eric", "bob", "abby"};
        System.out.println(isSorted(a));
        String[] b = {"abbe", "bob", "crime", "eddy"};
        System.out.println(isSorted(b));

    }
}
