class Solution {
    public int solution(String[] babbling) {
        String[] dict = {"aya", "ye", "woo", "ma"};
        int count = 0;
        for(int i = 0; i < babbling.length; i ++){
            String s = babbling[i];
            if(s.contains("ayaaya")||s.contains("yeye")||s.contains("woowoo")||s.contains("mama")) continue;
            
            else babbling[i] = s.replace("aya"," ").replace("ye", " ").replace("woo", " ").replace("ma", " ");
            
            if(babbling[i].trim().isEmpty()) count ++;
        }
        return count;
    }
}