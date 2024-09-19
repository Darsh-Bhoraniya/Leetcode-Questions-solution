public class Different_Ways_to_Add_Parentheses{
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
       
       // Loop through the expression
       for (int i = 0; i < expression.length(); i++) {
           char c = expression.charAt(i);
           
           // Check if the character is an operator
           if (c == '+' || c == '-' || c == '*') {
               // Split the expression into two parts
               String leftPart = expression.substring(0, i);
               String rightPart = expression.substring(i + 1);
               
               // Recursively solve both parts
               List<Integer> leftResults = diffWaysToCompute(leftPart);
               List<Integer> rightResults = diffWaysToCompute(rightPart);
               
               // Combine results from left and right parts using the operator
               for (int left : leftResults) {
                   for (int right : rightResults) {
                       if (c == '+') {
                           result.add(left + right);
                       } else if (c == '-') {
                           result.add(left - right);
                       } else if (c == '*') {
                           result.add(left * right);
                       }
                   }
               }
           }
       }
       
       // If no operators were found, it means it's a number, so add it to the result
       if (result.isEmpty()) {
           result.add(Integer.parseInt(expression));
       }
       
       return result;
   }
}