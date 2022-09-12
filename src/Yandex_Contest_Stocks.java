import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Яндекс контест
 *Андрей торгует акциями Яндекса на бирже. Торги длятся N дней.
 * У Андрея есть информация о стоимости акций Яндекса в каждый из дней торгов.
 * Каждый день торгов, Андрей может продать и/или купить одну акцию.
 * Но в конце каждого дня у Андрея должно остаться не более одной акции.
 * Помоги Андрею определить, сколько он может заработать, если будет продавать и покупать акции Яндекса оптимальным образом.
 *
 * Формат ввода: На первой строке входных данных находится одно число
 * N - количество дней, которое идут торги. На второй строке входных данных находится
 * N неотрицательных целых чисел Ai, где Ai - стоимость акций в i-ый день торгов.
 *
 * Ограничения: 1? N ?10^5 0? Ai ?10^4
 *
 * Формат вывода: Выведите одно число - максимальную прибыль, которую может получить Андрей, продавая и покупая акции оптимальным образом.
 */
public class Yandex_Contest_Stocks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numDay = Integer.parseInt(reader.readLine());
        while (true) {
            if (numDay >= 1 && numDay <= Math.pow(10, 5)) {
                break;
            }
            numDay = Integer.parseInt(reader.readLine());
        }
        String str = reader.readLine();
        String[] strCheck = str.split(" ");
        while (true) {
            if (numDay != strCheck.length) {
                str = reader.readLine();
                strCheck = str.split(" ");
            } else break;
        }
        for (String s : strCheck) {
            if (Integer.parseInt(s) < 0 || Integer.parseInt(s) > Math.pow(10, 4)) {
                str = reader.readLine();
                strCheck = str.split(" ");
            }
        }
        int[] price = new int[numDay];
        for (int i = 0; i < numDay; i++) {
            price[i] = Integer.parseInt(strCheck[i]);
        }

        int res = 0;
        for (int i = 0; i < price.length; ) {
            int left = price[i];
            while (++i < price.length && price[i] >= price[i - 1])
                ;
            if (price[i - 1] > left)
                res += price[i - 1] - left;
        }
        System.out.print(res);

    }
}
