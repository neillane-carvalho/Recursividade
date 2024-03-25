public class MDC {
    public static void main(String[] args) {
        System.out.println(CalculaMDCRecursivo(50,5));
    }

    public static int CalculaMDCRecursivo(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return CalculaMDCRecursivo(n, m % n);
        }
    }

}
