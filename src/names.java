import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class names {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int years = Integer.parseInt(reader.readLine());
        ArrayList<String[]> list = new ArrayList();
        int count = 0;
        int max = 1;
        for (int i = 0; i < years; i++) {
            String[] str = reader.readLine().split(" ");
            Arrays.sort(str);
            if (list.size() == 0) list.add(str);
            else {
                for (int j = 0; j < list.get(i).length; j++) {
                    if (Arrays.asList(list.get(j)).contains(str[j])) count++;
                }
                if (count == 3) {
                    max++;
                    count = 0;
                }


            }
        }
        System.out.println(max);
    }
}



