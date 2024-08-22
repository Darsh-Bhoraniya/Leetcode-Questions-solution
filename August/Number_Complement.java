public class Number_Complement {
    public int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        StringBuilder complementString = new StringBuilder();
        for (char bit : binaryString.toCharArray()) {
            if (bit == '0') {
                complementString.append('1');
            } else {
                complementString.append('0');
            }
        }
        
        return Integer.parseInt(complementString.toString(), 2);
        }
}