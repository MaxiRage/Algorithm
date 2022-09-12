import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Василий решил улучшить свою скорость печати.
 * Он заметил, что некоторые буквы на клавиатуре он ищет дольше, чем другие. Ему интересно, какую букву он искал дольше всего.
 * Напишите программу, которая поможет Василию узнать это.
 * Василий ввел N букв. Строка S – строка, введенная Василием, имеет длину N.
 * Mассив A содержит N целых неотрицательных чисел, каждое число Ai – время в миллисекундах от начала ввода до того как была напечатана i-тая буква.
 * Считается, что Василий начал искать следующую букву сразу после того, как напечатал предыдущую. Букву с индексом 0 он искал A0 миллисекунд.
 *
 * Формат ввода: В первой строке входных данных находится N - количество введенных букв. Во второй строке находится S – введенная строка, состоящая из N букв. В третьей строке находится A – N целых неотрицательных чисел через пробел.
 *
 * Ограничения: 0 < N < 10^6 0? A < 10^8
 *
 * Массив A отсортирован в порядке возрастания: Ai ? Aj если i<j
 *
 * Формат вывода: Выведите букву, которую Василий искал дольше всего. Если букв с одинаковым временем поиска несколько, выведите ту, что он напечатал последней.
 */
public class Yandex_Contest_letters {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String letters;
        String numbers;
        int fig = Integer.parseInt(reader.readLine());
        while (true) {
            if (fig > 0 && fig < Math.pow(10, 6)) {
                letters = reader.readLine();
                while (true) {
                    if (fig != letters.length()) {
                        letters = reader.readLine();
                    } else break;
                }
                break;
            } else fig = Integer.parseInt(reader.readLine());
        }
        numbers = reader.readLine();
        String[] str = numbers.split(" ");

        while (true) {
            if (fig != str.length) {
                numbers = reader.readLine();
                str = numbers.split(" ");
            } else break;
        }
        for (String s : str) {
            if (Integer.parseInt(s) < 0 || Integer.parseInt(s) > Math.pow(10, 8)) {
                numbers = reader.readLine();
                str = numbers.split(" ");
            }
        }
        int[] Num = new int[fig];
        for (int i = 0; i < fig; i++) {
            Num[i] = Integer.parseInt(str[i]);
        }
        int check = Num[0];
        int check2 = 0;
        for (int i = 1; i < Num.length; i++) {
            if (check <= Num[i] - Num[i - 1]) {
                check = Num[i] - Num[i - 1];
                check2 = i;
            }
        }
        System.out.println(letters.charAt(check2));
    }
}
