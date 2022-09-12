import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
В команде Тинькофф произошла реорганизация - объединились два отдела. Новые коллеги хотят
сидеть рядом, поэтому офису требуется ремонт.
Прежние места каждого отдела имели форму прямоугольника. Новая площадка должна быть
квадратной, а также содержать предыдущие места, т.к. некоторые разработчики очень привязаны к
ним. К сожалению, размеры офиса ограничены, поэтому зона должна иметь минимальную площадь.
Строители пытаются посчитать, сколько материала им понадобится для ремонта. Для этого им
нужно знать итоговую площадь обновленной площадки. Пожалуйста, помогите им.
Формат входных данных
В первой строке заданы четыре целых числа: x1,y1, х2, y2, где (x1, y1) и (x2,y2) - координаты
левого нижнего и правого верхнего углов прежнего места первого отдела. Известно, что 0 <= x1 < x2 <= 10
и 0 <= y1 < y2 <= 10.
Во второй строке заданы координаты места второго отдела в том же формате, что и первый.
Гарантируется, что исходные площадки двух отделов не пересекаются, а так же не касаются друг
друга.
Формат выходных данных
В единственной строке выведите одно число - площадь новой объединенной зоны.
Пример ввода:
6 6 8 8
1 8 4 9

Вывод:
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
