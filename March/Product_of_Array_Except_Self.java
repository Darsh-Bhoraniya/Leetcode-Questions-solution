public class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
         int leftpos=1;
         int rightpos=1;
         int[] product= new int[n];
         for(int i=0;i<nums.length;i++){
             product[i]=leftpos;
             leftpos*=nums[i];
         }
         for(int i=nums.length-1;i>=0;i--){
             product[i]=product[i]*rightpos;
             rightpos*=nums[i];
         }
         return product;
     }
}   
