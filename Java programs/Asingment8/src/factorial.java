public class factorial {
    public static long calfact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calfact(n - 1);
        }
    }
}
}
