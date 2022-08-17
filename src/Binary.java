import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

// бинарный поиск индекса в массиве
// обязательно отсортированный
// O(log(n))
public class Binary {

    public static void main(String[] args) {
        int [] arr = {19, 25, 39, 38, 11, 14, 43, 23, 10, 32, 33, 26, 31, 37, 28};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(searchBi(arr, 19));
    }
    public static int searchBi (int [] arr, int el){
        int start = 0;
        int end = arr.length-1;
        int middle;
            while (start<=end){
                middle = start + (end-start)/2;
                if(arr[middle] == el) return middle;
                if (arr[middle] > el) end = middle-1;
                else start = middle+1;
            }
            return -1;
        // бинарный поиск индекса в массиве
        // бинарный поиск индекса в массиве
        // бинарный поиск индекса в массиве

    }
}
