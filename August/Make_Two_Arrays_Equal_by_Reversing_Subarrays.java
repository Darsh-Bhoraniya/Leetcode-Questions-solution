public class Make_Two_Arrays_Equal_by_Reversing_Subarrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        //    for (int i = 0; i < arr.length - 1; i++) {
        //         for (int j = 0; j < arr.length - i - 1; j++) {
        //             if (arr[j] < arr[j + 1]) { // Change the comparison for descending order
        //                 int temp = arr[j];
        //                 arr[j] = arr[j + 1];
        //                 arr[j + 1] = temp;
        //             }
        //         }
        //     }
        Arrays.sort(arr);
            Arrays.sort(target);
            for(int i =0;i<target.length;i++){
                if(arr[i]!=target[i]){
                    return false;
    
                }
            }
            return true;
        }
}
