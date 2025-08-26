import java.util.HashSet;

public class IterateHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Using for-each loop
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
