// arr = [0,1,3,5,6,] arr[2] = 3 arr길이 = 5
            // 배열길이 - 인덱스 = 배열[인덱스]성립하면 리턴
import java.util.*;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int k = arr.length;
        int max = 0;
        for(int i = 0; i < k; i ++){
            int n = k  - i;
            if(arr[i] >= n){
                max = Math.max(max, n);
            }
        }
        return max;
    }
}