package chapter1.section3;

import java.util.ArrayList;
import java.util.List;

public class test {

        public static boolean isHappy(int n) {
            List<Integer> l = new ArrayList();
            while(n>0){
                l.add(n%10);
                n = n/10;
            }
            int num = 0;
            for(int x : l){
                num += x*x;
            }
            if (num==1)
                return true;
            else return isHappy(num);
        }


    public static void main(String[] args) {
        boolean a = isHappy(19);
        System.out.println(a);
    }
}
