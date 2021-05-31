/*Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"

*/

class Solution {
    public String multiply(String num1, String num2) {
      if(num1.equals("0")|| num2.equals("0")) return "0";
        
        
    int[] ans = new int[num1.length()+num2.length()];
    
    for(int i= num1.length()-1; i>=0; i--){
        for(int j = num2.length()-1; j>=0; j--){
            int valueIndex= i+j+1;
            int remainderIndex=i+j;
            
            int product= (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            product+= ans[valueIndex];
            ans[valueIndex]= product%10;
            ans[remainderIndex]+= product/10;
        }
    }
        
        StringBuilder build = new StringBuilder();
        boolean p = true;
        
        for(int i =0 ; i<ans.length; i++){
            int value = ans[i];
            if(value!= 0 ) p= false;
            if(!p) build.append(value);
        }
        return build.toString();
        }
}




/*

Runtime: 3 ms, faster than 89.04% of Java online submissions for Multiply Strings.
Memory Usage: 39.2 MB, less than 36.76% of Java online submissions for Multiply Strings.

*/
