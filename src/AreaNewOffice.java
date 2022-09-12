import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
� ������� �������� ��������� ������������� - ������������ ��� ������. ����� ������� �����
������ �����, ������� ����� ��������� ������.
������� ����� ������� ������ ����� ����� ��������������. ����� �������� ������ ����
����������, � ����� ��������� ���������� �����, �.�. ��������� ������������ ����� ��������� �
���. � ���������, ������� ����� ����������, ������� ���� ������ ����� ����������� �������.
��������� �������� ���������, ������� ��������� �� ����������� ��� �������. ��� ����� ��
����� ����� �������� ������� ����������� ��������. ����������, �������� ��.
������ ������� ������
� ������ ������ ������ ������ ����� �����: x1,y1, �2, y2, ��� (x1, y1) � (x2,y2) - ����������
������ ������� � ������� �������� ����� �������� ����� ������� ������. ��������, ��� 0 <= x1 < x2 <= 10
� 0 <= y1 < y2 <= 10.
�� ������ ������ ������ ���������� ����� ������� ������ � ��� �� �������, ��� � ������.
�������������, ��� �������� �������� ���� ������� �� ������������, � ��� �� �� �������� ����
�����.
������ �������� ������
� ������������ ������ �������� ���� ����� - ������� ����� ������������ ����.
������ �����:
6 6 8 8
1 8 4 9

�����:
49

 */
public class AreaNewOffice {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text1 = reader.readLine().split(" ");
        String[] text2 = reader.readLine().split(" ");
        System.out.println(P(text1, text2));
    }
        public static int P (String [] str, String [] str2) {
            int[] total = new int[str.length + str2.length];
            int count = 0;
            for (int i = 0; i < str.length; i++) {
                total[i] = Integer.parseInt(str[i]);
                count++;
            }
            for (int i = 0; i < str2.length; i++) {
                total[count++] = Integer.parseInt(str2[i]);
            }
            int minX = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxY = Integer.MIN_VALUE;

            for (int i = 0; i < total.length; i++) {
                if (i%2!=0) {
                    if (total[i] < minY) minY = total[i];
                    else if (total[i] > maxY) maxY = total[i];
                }
                else {
                    if (total[i] < minX) minX = total[i];
                    else if (total[i] > maxX) maxX = total[i];
                }
            }
            return (int) Math.pow((Math.max((maxX-minX), (maxY-minY))), 2);
        }

}
