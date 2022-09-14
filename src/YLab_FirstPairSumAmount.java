import java.util.Arrays;

public class YLab_FirstPairSumAmount {
    public static void main(String[] args) throws InterruptedException {

    /*
        Task2
        ������ �2 - �� ���� �������� ������ � �����. ����� ������� ������ ���� �����, ������� ���� � ����� �����.
            [3, 4, 2, 7], 10 -> [3, 7] - ������� ���� ����� � �������, ������� ���� ����� - 10
         */
        int[] array = {0, 0, 0, 0, 3, 2, 7, 8, 0, 14, -4, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3};
        int amount = 10;

//        long start = System.nanoTime();
//        nameLoop:
//        for (int digitOne : array) {
//            for (int digitTwo : array) {
//                if (amount - digitOne == digitTwo) {
//                    System.out.println(Arrays.toString(new int[]{digitOne, digitTwo}));
//                    break nameLoop;
//                }
//            }
//        }

//        long finish = System.nanoTime();
//        System.out.println(finish - start);

         // ������� ��-�������, �� ����� ����������
        Arrays.sort(array);
//        long start2 = System.nanoTime();
        int left = 0;
        int right = array.length - 1;
//        boolean found = false;

        while (left < right) {
            int sum = array[left] + array[right];

            if (sum == amount) {
//                found = true;
                System.out.println(Arrays.toString(new int[]{array[left], array[right]}));
                break;
            } else if (sum > amount) right--;
            else if (sum < amount) left++;
        }
//        if (found) System.out.println(Arrays.toString(new int[]{array[left], array[right]}));
//        else System.out.println("���� �� �������");

//        long finish2 = System.nanoTime();
//        System.out.println(finish2 - start2);
    }
}