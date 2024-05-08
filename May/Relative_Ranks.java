public class Relative_Ranks{
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int c = 0;
        int a[] = new int[n];
        String arr[] = new String[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(score[i]>score[j]){
                    c++;
                }
            }
            a[i] = c;
            c=0;
        }
        for(int i=0;i<n;i++){
        if(a[i]==n-1){
            arr[i] = "Gold Medal";
        } 
        else if(a[i]==n-2){
            arr[i] = "Silver Medal";
        } 
        else if(a[i]==n-3){
            arr[i] = "Bronze Medal";
        }
        else{
        arr[i] = String.valueOf(n-a[i]);
        } 
        }
        return arr;
    }
}