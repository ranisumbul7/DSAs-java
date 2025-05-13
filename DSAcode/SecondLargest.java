public class SecondLargest{
    public static int findSecondLargest(int[] arr){
       int largest = Integer.MIN_VALUE;
       int secondLargest = Integer.MIN_VALUE;
       
       //loop
       for(int i=0; i<arr.length; i++){
    if(arr[i] > largest){
        secondLargest = largest;
        largest = arr[i];
    }
    else if(arr[i] > secondLargest && arr[i] != largest){
        secondLargest = arr[i];
    }
       }
       return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 15};
        System.out.println("Second largest: " + findSecondLargest(arr));
          
    }
}
