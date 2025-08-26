import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        // Creating HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate, will not be added

        // Printing HashSet
        System.out.println("HashSet elements: " + set);

        // Checking element
        System.out.println("Contains Mango? " + set.contains("Mango"));

        // Removing element
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // Size of HashSet
        System.out.println("Size of HashSet: " + set.size());
    }
}
