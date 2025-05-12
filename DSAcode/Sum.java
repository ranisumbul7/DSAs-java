public class SumUsingMethod {

    // Method to calculate sum
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Declare and initialize array
        int[] numbers = {10, 20, 30, 40, 50};

        // Call the method and print result
        int total = calculateSum(numbers);
        System.out.println("Sum of array elements = " + total);
    }
}
