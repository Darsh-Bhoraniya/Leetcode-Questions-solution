public class Minimum_Bit_Flips_to_Convert_Number {
    public int minBitFlips(int start, int goal) {
        int a=start^goal,c=0;
        while(a>0){
         if(a%2==1){
            c++;
         }
         a>>=1;
        }
        return c;
     }
}
