import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort_Array_by_Increasing_Frequency {
    public int[] frequencySort(int[] nums) {
          // Create a frequency map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a list of the array elements
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        // Sort the list by frequency (in ascending order)
        // and by value in descending order if frequencies are the same
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int freqCompare = frequencyMap.get(a).compareTo(frequencyMap.get(b));
                if (freqCompare == 0) {
                    return b.compareTo(a); // Descending order for same frequency
                } else {
                    return freqCompare;
                }
            }
        });

        // Convert the list back to an array
        int[] result = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}