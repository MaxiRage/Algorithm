import java.util.Arrays;

/**
 * Разворачиваем массив
 */
public class ReversArr {
    public static void main(String[] args) {
        Revers(new int[]{-100, 1, 5, 1, 17, -1000, 2, 100, 200, 0, -1}); // 8 эл.

    }
    public static void Revers(int[] x) {
        for (int i = 0, j = x.length - 1; i < j; i++, j--) {
                int tmp = x[i];
                x[i] = x[j];
                x[j] = tmp;
        }
        System.out.println(Arrays.toString(x));
    }
}
