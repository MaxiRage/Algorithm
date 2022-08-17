import java.util.ArrayList;

/* Ищем сколько раз подстрока есть в строке и где начинается
O (n*m)
Можно решить за O(n) методом Кнута-Морриса-Пратта, но сложнее
 */
public class SubString {
    public static void main(String[] args) {
        String text = "AABBCBAABABCCAABBC";
        String sample = "AABB";

        System.out.println(search(text,sample));

    }

    public static ArrayList <Integer> search (String text, String sample) {
        ArrayList <Integer> position = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            int j = 0;
                while (j < sample.length() && i+j < text.length() && sample.charAt(j) == text.charAt(i+j)) {
                    j++;
                }
                if (j==sample.length()) position.add(i);
        }
        return position;
    }
}
