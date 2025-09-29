class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int count = 0;
        int zero = 0;
        for(int i = 0; i < lottos.length; i ++){
            if(lottos[i] == 0) zero++;
            else{
                for(int j = 0; j < win_nums.length; j ++){
                    if(lottos[i] == win_nums[j]) count++;
                }
            }
        }
        int min = count; //2개 , 5등
        int max = count + zero; // 4개, 3등
        int[] answer = new int[2];
        int[] rank = new int[]{6,6,5,4,3,2,1};
        
        for(int i  = 0; i < rank.length; i ++){
            if(min == i) answer[1] = rank[i];
            if(max == i) answer[0] = rank[i];
        }
        return answer;
    }
    
    
}