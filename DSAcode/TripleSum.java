import java.util.Arrays;

public class TripletSum {

    static boolean findTriplet(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr); // Step 1: Sort the array

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println("Triplet: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 22;

        boolean result = findTriplet(arr, target);
        System.out.println("Triplet Exists? " + result);
    }
}
