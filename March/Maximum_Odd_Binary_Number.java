import java.util.Scanner;

public class Maximum_Odd_Binary_Number {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int count = 0;

        for(char c : s.toCharArray()) {
            if(c == '1'){
                count++;
            }
        }

        StringBuilder res = new StringBuilder();

        if(count >= 1){
            count--;
            for(int i = 0; i < len - 1; i++) {
                if(i < count){
                    res.append('1');
                }
                else{
                    res.append('0');
                }
            }
            res.append('1');
        }

        return res.toString();

    }
}