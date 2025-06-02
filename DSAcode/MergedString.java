public class MergeStrings {
    public static void main(String[] args) {
        String str1 = "Data";
        String str2 = "Structures";

        // Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);

        String merged = sb.toString();

        System.out.println("Merged String: " + merged);
    }
}
