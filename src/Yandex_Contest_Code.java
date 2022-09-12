import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 *
 *
 */
public class Yandex_Contest_Code {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countCand = Integer.parseInt(reader.readLine());

        while (countCand > 0) {
            char numLet = '\\';
            Set<String> set = new HashSet<>();
            String[] str = reader.readLine().split(",");
            for (int i = 0; i < str.length - 3; i++) {
                char[] c = str[i].toCharArray();
                for (Character ch : c) {
                    set.add(String.valueOf(ch));
                }
            }
            int sumDM = 0;
            for (int i = 3; i < str.length - 1; i++) {
                char[] c = str[i].toCharArray();
                for (Character ch : c) {
                    sumDM += ch - 48;
                }
            }

            int sum = set.size() + (sumDM*64) + ((str[0].charAt(0)-64) * 256);
            String ing = String.valueOf(Integer.toHexString(sum)).substring(String.valueOf(Integer.toHexString(sum)).length()-3);

            if(ing.length() < 3) {
                System.out.print(String.format("%0" + (3 - ing.length()) + "d%s" + " ", 0, ing.toUpperCase()));
            }else System.out.print(ing.toUpperCase() + " ");

            countCand--;

        }
    }
}
