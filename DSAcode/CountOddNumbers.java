public class CountOddNumbers{
    public static void main(String[] args) {
        int[] arr ={10, 20, 40, 60, 30};
        
       int oddCount = 0;
       for(int i=0; i<arr.length; i++){
        if(arr[i] %2 != 0){
            oddCount++;
        }
       }  
        System.out.println("Total odd numbers = " + oddCount);
    }
}
