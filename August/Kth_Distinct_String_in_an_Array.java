/**
 * Kth_Distinct_String_in_an_Array
 */
public class Kth_Distinct_String_in_an_Array {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> countMap = new HashMap<>();
        
        // Count occurrences of each element
        for (int i = 0; i < arr.length; i++) {
            countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
        }
        
        List<String> distinctList = new ArrayList<>();
        
        // Collect distinct elements (occurrence == 1)
        for (int i = 0; i < arr.length; i++) {
            if (countMap.get(arr[i]) == 1) {
                distinctList.add(arr[i]);
            }
        }
        
        // Check if k-th distinct element exists
        if (k > distinctList.size()) {
            return ""; // Handle out of bounds case
        }
        
        return distinctList.get(k - 1);
    }
}
