public class Array{
    public static void main(String[] args) {
        int[] arr ={10, 20, 40, 60, 30};
        
         int sum = 0;
        //print array element using loop
       for(int i=0; i<arr.length; i++){
         sum += arr[i];
      }
      System.out.println("sum of array elements is: " + sum);
    }
}
