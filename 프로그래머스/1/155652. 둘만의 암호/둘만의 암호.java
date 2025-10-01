class Solution {
    public String solution(String s, String skip, int index) {
        char[] str = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : str){
            int count = 0;
            char cur = c;
            while(count < index){
                cur++;
                if(cur > 'z') cur = 'a';
                if(skip.contains(String.valueOf(cur))) continue;
                
                count++;
            }
            sb.append(cur);
        }
        return sb.toString();
    }
}