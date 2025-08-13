public class SqrtBinarySearch {
    public static void main(String[] args) {
        int n = 40;
        System.out.println("Square root of " + n + " is " + sqrt(n));
    }

    static int sqrt(int n) {
        int start = 0, end = n, ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (mid * mid == n) {
                return mid; // perfect square case
            }
            else if (mid * mid < n) {
                ans = mid; // store possible floor value
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans; // floor of sqrt
    }
}
