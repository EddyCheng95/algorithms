package chapter1.section1;
/**
 * 最大公约数（欧几里得算法）
 *
 * 思路：若q是0，则最大公约数为p。否则，将p除以q得到余数r，p和q的最大公约数即为q和r的最大公约数。
 *
 * @author CY
 *
 */
public class Gcd {

	/*
	递归的方法求最大公约数
	 */
	public static int gcd(int p, int q) {
		if(q == 0) return p;
		int r = p % q;
		return gcd(q, r);
	}

	/*
	循环的方式求最大公约数
	 */
	public static int gcd2(int p, int q) {
		if(q == 0) return p;
		while(true) {
			if (q == 0) {
				break;
			}
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
	
	public static void main(String[] args) {
		int g = gcd(5, 10);
		System.out.println(g);
		g = gcd2(5, 10);
		System.out.println(g);
	}

}
