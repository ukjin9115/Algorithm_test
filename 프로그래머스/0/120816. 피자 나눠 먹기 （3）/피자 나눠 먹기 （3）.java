class Solution {
    public int solution(int slice, int n) {
        int count = 0;
        while(true){
            count++;
            if(slice * count >= n) break;
        }
        return count;
    }
}