package chapter1.section1;

import java.util.ArrayList;
import java.util.List;
/**
 * 求行列式
 * @author CY
 *
 */
public class Determinant {
	
	public static int det(int[][] a) {
		//如果该矩阵就是1行1列直接返回值
		if(a.length == 1) return a[a.length-1][a.length-1];
		
		//list用来存储余子式
		List<int[][]> list = new ArrayList<>();
		
		/*
		 * 找出第一行元素的代数余子式
		 */
		for(int i=0;i<a[0].length;i++) {
			//l用来存储除去0行i列的元素
			List<Integer> l = new ArrayList<>();
			for(int m = 1;m<a.length;m++) {
				for(int n = 0;n<a[m].length;n++) {
					if(n != i) {
						l.add(a[m][n]);
					}
				}
			}
			//创建0行i列的余子式b
			int[][] b = new int[a.length-1][a.length-1];
			for(int j =0;j<b.length;j++) {
				for(int k=0;k<b.length;k++) {
					//将l里的值从前到后的转移到b中
					b[j][k] = l.remove(0);
				}
			}
			
			//将余子式b存储到list里
			list.add(b);
		}
		
		int sum = 0;
		for(int i =0; i<a.length;i++) {
			/*
			 * 遍历a第一行的元素，将元素和代数余子式的积累加起来
			 * 
			 * 如果该余子式不是一个1行1列的矩阵，继续递归调用det方法求其行列式
			 */
			sum += a[0][i] * (int)Math.pow(-1, i+2) * det(list.remove(0));
		};
		return sum;
		
	}
	
	public static void main(String[] args) {
		int[][] a = {
				{3,4,5,11},
				{2,5,4,9},
				{5,3,2,12},
				{14,-11,21,29}
				
		};
		int answer = det(a);
		System.out.println(answer);
	}

}
