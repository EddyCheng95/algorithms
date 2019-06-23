package chapter1.section5;

/**
 * @author eddy
 * @date 2019-06-04 22:38
 */
public class QuickUnionUF {
//    private int[] id;
//    private int count;
//
//    public QuickUnionUF(int N) {
//        count = N;
//        id = new int[N];
//        for (int i = 0; i < N; i++) {
//            id[i] = i;
//        }
//    }
//
//    public int count() {
//        return count;
//    }
//
//    public int find(int p) {
//        while (p != id[p]) {
//            p = id[p];
//        }
//        return p;
//    }
//
//    public boolean connected(int p, int q) {
//        return find(p) == find(q);
//    }
//
//
//
//    public void union(int p, int q) {
//        int pRoot = find(p);
//        int qRoot = find(q);
//        if (pRoot == qRoot) {
//            return;
//        }
//        id[pRoot] = qRoot;
//        count--;
//    }
//
//
//    public static void main(String[] args) {
//        int N = StdIn.readInt();
//        QuickUnionUF uf = new QuickUnionUF(N);
//        while (!StdIn.isEmpty()) {
//            int p = StdIn.readInt();
//            int q = StdIn.readInt();
//            if (uf.connected(p, q)) {
//                continue;
//            }
//            uf.union(p, q);
//            StdOut.println(p + " " + q);
//        }
//        StdOut.println(uf.count() + "componnents");
//    }

    private int[] id;
    private int count;

    public QuickUnionUF(int N) {
        id = new int[N];
        count = N;
        for (int i = 0; i < N; i++) {
            id[i] = i;
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
        int pRoot = find(p);
        int qRoot = find(q);
        if(conected(p, q)) {
            return;
        }
        id[pRoot] = qRoot;
        count--;
    }
}
