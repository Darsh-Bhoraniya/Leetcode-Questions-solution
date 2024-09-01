public class 2_Keys_Keyboard{
    public int minSteps(int n) {
        int step=0;
        int listsize=1;
        int lastcopied=0;
        while(listsize<n){
            if(n%listsize==0){
                lastcopied=listsize;     //copy
                step++;
            }
            listsize+=lastcopied;      //paste
            step++;
        }
        return step;
    }
}

