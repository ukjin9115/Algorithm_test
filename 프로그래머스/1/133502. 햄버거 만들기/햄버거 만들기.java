import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int count = 0;
        
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i ++){
            st.push(arr[i]);
            int n = st.size();
            if(n>=4){
                if (st.get(n-4) == 1 &&
                    st.get(n-3) == 2 &&
                    st.get(n-2) == 3 &&
                    st.get(n-1) == 1) {
                    
                    // 햄버거 완성 → pop 4번
                    st.pop(); st.pop(); st.pop(); st.pop();
                    count++;
                }
                
                
            }
            
        }
        return count;
    }
}
//스택 문제이고, 빵-야채-고기-빵 이여야 햄버거 만들어짐(1-2-3-1)
// 만들때마다 count++;