/**
ДЗ
 Поиск количества максимальных значений
 **/
public class CountMaxValue {
    public static void main(String[] args) {

    int [] arr = {1, 8, 3, 8, 2, 6, 8, 8};

        System.out.println(arrMax(arr));
    }
    public static int arrMax(int [] arr) {
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            }
            else if (arr[i] == max) count ++;
        }
        return count;
    }
}

