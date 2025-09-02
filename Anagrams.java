import java.util.*;

public class Main {
    // Function to group anagrams
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert word into character array
            char[] chars = word.toCharArray();

            // Sort the characters (e.g., eat -> aet)
            Arrays.sort(chars);

            // Make a key from sorted word
            String key = new String(chars);

            // If key not in map, put empty list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add the word into its group
            map.get(key).add(word);
        }

        // Return grouped anagrams
        return new ArrayList<>(map.values());
    }

    // Main method
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = groupAnagrams(words);

        // Print the grouped anagrams
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
