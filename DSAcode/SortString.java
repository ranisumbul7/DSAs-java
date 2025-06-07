import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "java";

        // Step 1: Convert string to char array
        char[] chars = str.toCharArray();

        // Step 2: Sort the char array
        Arrays.sort(chars);

        // Step 3: Convert back to string
        String sortedStr = new String(chars);

        // Output
        System.out.println("Sorted string: " + sortedStr);
    }
}
