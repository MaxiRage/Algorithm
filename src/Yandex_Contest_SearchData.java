import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 */
public class Yandex_Contest_SearchData {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int orders = Integer.parseInt(reader.readLine());
        String[][] listOrders = new String[orders][3];
        for (int i = 0; i < orders; i++) {
            listOrders[i] = reader.readLine().split(" ");
        }
        int request = Integer.parseInt(reader.readLine());
        for (int i = 0; i < request; i++) {
            int sout = 0;
            String[] tmp = reader.readLine().split(" ");
            int[] infoReq = Arrays.stream(tmp)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (infoReq[2] == 1) {
                for (String[] ords : listOrders) {
                    int[] ord = Arrays.stream(ords)
                            .mapToInt(Integer::parseInt)
                            .toArray();
                    if (infoReq[0] <= ord[0] && ord[0] <= infoReq[1])
                        sout += ord[2];
                }
                System.out.print(sout + " ");
            } else {
                for (String[] ords : listOrders) {
                    int[] ord = Arrays.stream(ords)
                            .mapToInt(Integer::parseInt)
                            .toArray();
                    if (infoReq[0] <= ord[1] && ord[1] <= infoReq[1])
                        sout += ord[1] - ord[0];
                }
                System.out.print(sout + " ");
            }
        }
    }
}