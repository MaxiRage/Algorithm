public class isPalindrome {
    public static void main(String[] args) {
        int num = 12321;

        int rev = 0;
        int left = num;

        while (left > 0) {
            int r = left % 10;
            rev = rev * 10 + r;
            left = left / 10;
        }
        System.out.println(num == rev);
    }
}
