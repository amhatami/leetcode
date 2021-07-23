// time Complexity O(N)
// space Complexity O(N)
public class Main {
   public static void main(String[] args) {
      int arr[] = {10, 4, -8, 7};
      System.out.println(noOfWays(arr));
   }

    
//The Brute force way of doing this would be recursive solution by making cuts at each index and check whether the sum of left subarray is greater than right subarray so the time complexity will be exponential in this case, We can reduce this by using the concept of prefix and suffix sums.
    
   static int noOfWays(int arr[]) {
      int count = 0;
      int n = arr.length;
      int prefix[] = new int[n];
      int suffix[] = new int[n];

      prefix[0] = arr[0];
      for (int i = 1; i < n; i++) {
         prefix[i] = prefix[i - 1] + arr[i];
      }

      suffix[n - 1] = arr[n - 1];

      for (int i = n - 2; i >= 0; i--) {
         suffix[i] = suffix[i + 1] + arr[i];
      }

      for (int i = 0; i < n - 1; i++) {
         if (prefix[i] > suffix[i + 1]) {
            count++;
         }
      }

      return count;
   }


}