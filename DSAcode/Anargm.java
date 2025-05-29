import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }
    }

    static boolean isAnagram(String str1, String str2) {
       
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }
      
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

       
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
