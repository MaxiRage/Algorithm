public class YLab_FuzzySearch {
    public static void main(String[] args) {
        /*
        Task3
            Реализовать функцию нечеткого поиска

        fuzzySearch("car", "ca6$$#_rtwheel"); // true
        fuzzySearch("cwhl", "cartwheel"); // true
        fuzzySearch("cwhee", "cartwheel"); // true
        fuzzySearch("cartwheel", "cartwheel"); // true
        fuzzySearch("cwheeel", "cartwheel"); // false
        fuzzySearch("lw", "cartwheel"); // false
        */
        System.out.println("Fuzzy search function:");
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel")); // true
        System.out.println(fuzzySearch("cwhl", "cartwheel")); // true
        System.out.println(fuzzySearch("cwhee", "cartwheel")); // true
        System.out.println(fuzzySearch("cartwheel", "cartwheel")); // true
        System.out.println(fuzzySearch("cwheeel", "cartwheel")); // false
        System.out.println(fuzzySearch("lw", "cartwheel")); // false
    }

    static boolean fuzzySearch(String word, String line) {
        if (line.length() < word.length()) return false;
        int indexWord = 0;
        for (char check : line.toCharArray()) {
            if (check == word.charAt(indexWord)) indexWord++;
            if (indexWord == word.length()) return true;
        }
        return false;
    }
}
