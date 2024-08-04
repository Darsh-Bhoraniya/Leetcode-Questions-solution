public class Range_Sum_of_Sorted_Subarray_Sums.javaRange_Sum_of_Sorted_Subarray_Sums {
    public int rangeSum(int[] nums, int n, int left, int right) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
       
       // Generate all subarray sums and add them to the min-heap
       for (int i = 0; i < n; i++) {
           int sum = 0;
           for (int j = i; j < n; j++) {
               sum += nums[j];
               minHeap.offer(sum);
           }
       }

       int totalSum = 0;

       // Extract the smallest sums up to 'right'
       for (int i = 1; i <= right; i++) {
           int currentSum = minHeap.poll();
           if (i >= left) {
               totalSum += currentSum;
           }
       }

       return totalSum;
   }
   //Secongd Method 
   public int rangeSum(int[] nums, int n, int left, int right) {
    List<Integer> ls = new ArrayList<Integer>();
    for(int i = 0;i<=n;i++){
        int sum = 0;
        for(int j = i;j<=n;j++){
            sum = sum+nums[j];
            ls.add(sum);
        }
    }
    Collections.Sort(ls);
    int totalsum = 0;
    for(int i=left-1;i<right;i++){
        totalsum = totalsum+ls.get(i);
    }
    return totalsum;
}
}
