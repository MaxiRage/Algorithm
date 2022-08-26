/*
 Найти среднее арифметическое среди всех
 элементов массива [2, 5, 13, 7, 6, 4]
 */
public class ArrAvr {
    public static void main(String[] args) {
        int[] array = {2, 5, 13, 7, 6, 4};
        System.out.println(avrArr(array));
    }

    public static double avrArr(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}