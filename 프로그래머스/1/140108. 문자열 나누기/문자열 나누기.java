class Solution {
    public int solution(String s) {
        int xCount = 0;
        int count = 0;
        int result = 0;
        char c = s.charAt(0);
        
        
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == c) xCount++;
            else count++;
            
            if(xCount == count){
                result++;
                if(i + 1 < s.length()){
                    c = s.charAt(i+1);
                }
                xCount = 0;
                count = 0;
            }
        }
        if(count != xCount) result++;
        
        return result;
    }
}