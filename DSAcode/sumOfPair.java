import java.util.*;

public class ZeroSumPairs {

    public static List<List<Integer>> findPairs(int[] arr) {
        Set<Integer> seen = new HashSet<>();  // To store seen numbers
        Set<String> addedPairs = new HashSet<>(); // To avoid duplicate pairs
        List<List<Integer>> result = new ArrayList<>(); // Final answer

        for (int num : arr) {
            int opposite = -num;

            // Check if opposite number already exists in HashSet
            if (seen.contains(opposite)) {
                int small = Math.min(num, opposite);
                int large = Math.max(num, opposite);

                // Create a unique string key to avoid duplicates like "-2,2"
                String pairKey = small + "," + large;

                if (!addedPairs.contains(pairKey)) {
                    result.add(Arrays.asList(small, large));
                    addedPairs.add(pairKey);
                }
            }

            seen.add(num); // Add current number to seen
        }

        // Sort the final list of pairs
        result.sort((a, b) -> {
            if (!a.get(0).equals(b.get(0)))
                return a.get(0) - b.get(0);
            else
                return a.get(1) - b.get(1);
        });

        return result;
    }

    
    public static void main(String[] args) {
        int[] arr = {2, -2, 1, -1, 3, -3, 2};
        List<List<Integer>> pairs = findPairs(arr);
        System.out.println(pairs);
    }
}
