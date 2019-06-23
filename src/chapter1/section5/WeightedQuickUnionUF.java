package chapter1.section5;

/**
 * @author eddy
 * @date 2019-06-04 23:17
 */
public class WeightedQuickUnionUF {
//    private int[] id;
//    private int[] sz;
//    private int count;
//    public WeightedQuickUnionUF(int N) {
//        count = N;
//        id = new int[N];
//        for (int i = 0; i < N; i++) {
//            id[i] = i;
//        }
//        sz = new int[N];
//        for (int i = 0; i < N; i++) {
//            sz[i] = 1;
//        }
//    }
//
//    public int count() {
//        return count;
//    }
//
//
//    public boolean connected(int p, int q) {
//        return find(p) == find(q);
//    }
//
//    public int find(int p) {
//        while (p != id[p]) {
//            p = id[p];
//        }
//        return p;
//    }
//
//    public void union(int p, int q) {
//        int i = find(p);
//        int j = find(q);
//        if(i == j) {
//            return;
//        }
//        if(sz[i] < sz[j]) {
//            id[i] = j;
//            sz[j] += sz[i];
//        } else {
//            id[j] = i;
//            sz[i] += sz[i];
//        }
//        count--;
//    }
//
//    public static void main(String[] args) {
//        int N = StdIn.readInt();
//        WeightedQuickUnionUF wqu = new WeightedQuickUnionUF(N);
//        while (!StdIn.isEmpty()) {
//            int p = StdIn.readInt();
//            int q = StdIn.readInt();
//            if (wqu.connected(p, q)) {
//                continue;
//            }
//            wqu.union(p, q);
//            StdOut.println(p + " " + q);
//        }
//        StdOut.println(wqu.count() + "componnents");
//    }

    private int[] id;
    private int[] sz;
    int count;

    public WeightedQuickUnionUF(int N) {
        id = new int[N];
        sz = new int[N];
        count =N;
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int count() {
        return count;
    }

    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    public boolean conected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (conected(p, q)) {
            return;
        }
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }
}
