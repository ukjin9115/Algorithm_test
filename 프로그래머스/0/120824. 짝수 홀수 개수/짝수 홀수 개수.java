class Solution {
    public int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for(int k : num_list){
            if(k % 2 == 1) odd++;
            else even++;
        }
        return new int[]{even,odd};
    }
}