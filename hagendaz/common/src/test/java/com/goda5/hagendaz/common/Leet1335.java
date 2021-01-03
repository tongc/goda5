public class Leet1335 {
    int minDifficulty(int[] jobDifficulty, int d, int res) {
        if (d == 0) {
            int a = max(jobDifficulty) + res;
            System.out.println("calc" + a);
            return a;
        }
        for (int i = 0; i <= jobDifficulty.length - d; i++) {
            minDifficulty(rest(jobDifficulty, i), d - 1, res + max(sub(jobDifficulty, i)));
        }
        return 0;
    }

    public static int[] rest(int[] in, int idx) {
        int[] out = new int[in.length - idx - 1];
        for (int i = idx + 1, j = 0; i < in.length; i++, j++) {
            out[j] = in[i];
        }
        return out;
    }

    public static int[] sub(int[] in, int idx) {
        int[] out = new int[idx + 1];
        for (int i = 0; i < idx + 1; i++) {
            out[i] = in[i];
        }
        return out;
    }

    public static int max(int[] a) {
        if (a.length == 0) return 0;
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int min(int a, int b) {
        return a > b ? b : a;
    }

    public static void main(String[] args) {
        System.out.println(new Leet1335().minDifficulty(new int[]{6, 5, 4, 3, 2, 1}, 3, 0));
        System.out.println(new Leet1335().minDifficulty(new int[]{7, 1, 7, 1, 7, 1}, 3, 0));
        System.out.println(new Leet1335().minDifficulty(new int[]{11,111,22,222,33,333,44,444}, 6, 0));
    }
}