import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class podp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int days = Integer.parseInt(reader.readLine());
        String[] volue = reader.readLine().split(" ");
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < volue.length; i++) {
            if (i % 2 == 0) {
            sum+= Integer.parseInt(volue[i]);
            }
            else sum-= Integer.parseInt(volue[i]);
        }

        for (int i = 0; i < volue.length; i++) {
            if (i % 2 == 0) {
                sum2-= Integer.parseInt(volue[i]);
            }
            else sum2+= Integer.parseInt(volue[i]);
        }

        System.out.println(Math.max(sum,sum2));
    }
}
