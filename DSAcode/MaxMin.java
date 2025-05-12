public class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {25, 67, 12, 89, 34, 5};

        // Step 1: Assume first element is max and min
        int max = numbers[0];
        int min = numbers[0];

        // Step 2: Traverse the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];  // Update max
            }
            if (numbers[i] < min) {
                min = numbers[i];  // Update min
            }
        }

        // Step 3: Print results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
