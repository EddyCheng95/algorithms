package chapter1.section1;
/**
 * 矩阵的乘法运算
 * @author CY
 *
 */
public class Matrix {

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = i+j;
			}
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] b = {
				{2, 3, 1},
				{4, 5, 1},
				{6, 7, 1},		
		};
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] c = new int[a.length][b[0].length];
		for(int i =0; i<c.length;i++) {
			for(int j =0; j<c[i].length; j++) {
				for(int k =0; k<b.length;k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
