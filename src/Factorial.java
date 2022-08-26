public class Factorial {
    public static void main(String[] args) {
        System.out.println(factor(15));
    }

    public static long factor(int n) {
        if (n<0) return -1;

        long f = 1;
        if (n == 0) return f;
        else {
            f = f * n;
            n--;
            f = f * factor(n);
        } return f;
    }
}
