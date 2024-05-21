import java.util.ArrayList;
import java.util.List;

public class Subsets{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> response = new ArrayList();
        List<Integer> curr = new ArrayList();
        response.add(new ArrayList());
        for(int i =0 ;i<nums.length;i++){
            int num = nums[i];
            int n = response.size();
            for(int j = 0;j<n ;j++){
                List<Integer> temp = new ArrayList(response.get(j));
                temp.add(num);
                response.add(temp);
            }
        }
        return response;
    }
}