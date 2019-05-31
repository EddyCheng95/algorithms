package chapter1.section1;

public class BinarySearch1 {
	
	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length - 1);
	}
	
	public static int rank(int key, int[] a, int lo, int hi) {
		//如果key存在于a[]中，它的索引不会小于lo且不会大于hi
		if (lo > hi) return -1;
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid]) return rank(key, a, lo, mid - 1);
		else if (key > a[mid]) return rank(key, a, mid + 1, hi);
		else return mid;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int key = 5;
		System.out.println(rank(key, a));

	}

}
