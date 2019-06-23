package chapter1.section5;

/**
 * @author eddy
 * @date 2019-06-03 23:09
 *
 * quick-find算法
 * 时间复杂度N^2
 */


public class UF {
//    private int[] id;
//    private int count;
//
//    public UF(int N) {
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
//        return id[p];
//    }
//
//    public boolean connected(int p, int q) {
//        return find(p) == find(q);
//    }
//
//
//
//    public void union(int p, int q) {
//        int pID = find(p);
//        int qID = find(q);
//        if (pID == qID) {
//            return;
//        }
//        for (int i = 0; i < id.length; i++) {
//            if (id[i] == pID) {
//                id[i] = qID;
//            }
//        }
//        count--;
//    }
//
//
//    public static void main(String[] args) {
//        int N = StdIn.readInt();
//        UF uf = new UF(N);
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

    public UF (int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
        count = N;
    }

    public int count() {
        return count;
    }

    public int find(int p) {
        return id[p];
    }

    public boolean conected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);
        if (conected(p, q)) {
            return;
        }
        for (int i = 0; i < id.length; i++) {
            if(id[i] == pID) {
                id[i] = qID;
            }
        }
        count--;
    }
}
