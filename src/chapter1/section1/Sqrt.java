package chapter1.section1;
/**
 * 开平方的源码(牛顿迭代法)
 * @author CY
 *
 */
public class Sqrt {

	public static void main(String[] args) {
		System.out.println(sqrt(25));
		Math.sqrt(25);
	}
	
	public static double sqrt(double c) {
		if(c < 0) return Double.NaN;
		double err = 1e-15;
		double t = c;
		while(Math.abs(t- c/t) > err * t)
			t = (c/t + t) / 2.0;
		return t;
	}

}
