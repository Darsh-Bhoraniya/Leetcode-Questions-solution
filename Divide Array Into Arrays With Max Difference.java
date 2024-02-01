class Solution {
    public int[][] divideArray(int[] nums, int k) {
        // Initialized array three size
        int ans[][]=new int[nums.length/3][3];
        Arrays.sort(nums);
        int len= nums.length;
        int ind=0;
        // increament Three for the store the three number for diffrance any two
        for(int i=0;i<len;i+=3){
            int f=nums[i];
            int s=nums[i+1];
            int t=nums[i+2];
            // Chek Condition if the given diffrance is less than K
            if(t-f<=k){
                ans[ind][0]=f;
                ans[ind][1]=s;
                ans[ind][2]=t;
                ind++; 
            }
            else{
                return new int[0][0];
            }
        }
        return ans;
    }
}