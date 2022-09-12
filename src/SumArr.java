/**
 * ДЗ
 * Поиск суммы между мин и макс значениями
 */
public class SumArr {
    public static void main(String[] args) {
        System.out.println(sumMinMax(new int[]{-10022, 1, 5, 1, 17, -100, 2, 100, 200, 10, -1000})); //
                                                 // 0  1  2  3  4     5   6   7    8   9    10
    }

    public static int sumMinMax(int[] Arr) {
        int sum = 0;
        int max = Arr[0];
        int min = Arr[0];
        int maxInd = 0;
        int minInd = 0;

        for (int i = 0; i < Arr.length; i++) {
            if (max < Arr[i]) {
                max = Arr[i];
                maxInd = i;
            }
            if (min > Arr[i]) {
                min = Arr[i];
                minInd = i;
            }
        }

        System.out.println(minInd);
        System.out.println(maxInd);

        if (minInd < maxInd) {
            for (int i = minInd + 1; i < maxInd; i++) {
                sum += Arr[i];
            }
        }
        else {
            for (int i = maxInd + 1; i < minInd; i++) {
                sum += Arr[i];
            }
        }

        return sum;
    }


}
