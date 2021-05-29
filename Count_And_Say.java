class Solution {
    public String countAndSay(int n) {
        String result= "1";
        for(int i=1; i<n; i++){
            result= helper(result);
        }
        return result;
    }
    
    public String helper(String str){
        char[] arr= str.toCharArray();
        char prev= arr[0];
        int count=0;
        StringBuilder b= new StringBuilder();
        
        for(char c : arr){
            if(c==prev){
                count++;
            }
            else{
                b.append(count).append(prev);
                count=1;
                prev=c;
            }
            
        }
        b.append(count).append(prev);
        return b.toString();
    }
}
