public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // sample array

        int sum = 0;

        for (int num : arr) {
            sum += num;  // add all elements
        }

        double average = (double) sum / arr.length;

        System.out.println("Average of array elements: " + average);
    }
}
