import java.util.Arrays;

public class FirstPairSumAmount {
    public static void main(String[] args) {

    /*
        Task2
        ������ �2 - �� ���� �������� ������ � �����. ����� ������� ������ ���� �����, ������� ���� � ����� �����.
            [3, 4, 2, 7], 10 -> [3, 7] - ������� ���� ����� � �������, ������� ���� ����� - 10
         */
        int[] array = {3, 2, 7, 8, 0, 14, -4};
        int amount = 10;

        nameLoop:
        for (int digitOne : array) {
            for (int digitTwo : array) {
                if (amount - digitOne == digitTwo) {
                    System.out.println(Arrays.toString(new int[]{digitOne, digitTwo}));
                    break nameLoop;
                }
            }
        }
    }
}