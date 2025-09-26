import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length ==1) return new int[]{-1};
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int k : arr){
            list.add(k);
        }
        list.remove(Collections.min(list));
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}