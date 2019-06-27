package chapter1.section1;

import java.util.Scanner;

/**
 * 判断是否为素数的一种方法
 * @author CY
 *
 */
public class Prime {
	
	public static boolean isPrime(int N) {
		if(N<2) return false;
		for (int i =2;i*i <= N; i++)
			if(N % i == 0) return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入要判断的数： ");
		int N = in.nextInt();
		System.out.println(isPrime(N));

	}

}
