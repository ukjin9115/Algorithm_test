import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        double[][] list = new double[N][2];
        for(int i = 0; i < stages.length; i ++){
            map.put(stages[i] , map.getOrDefault(stages[i], 0)+1);
                          
        }
        
        int people = stages.length;
        for(int i = 1; i <= N; i++){
            int failCount = map.getOrDefault(i, 0);
            double 실패율 = (people == 0) ? 0 : (double) failCount / people;
            list[i-1][0] = i; // 스테이지번호
            list[i-1][1] = 실패율;
            people -= failCount;
            //[2, 50%]형식
        }
        
        Arrays.sort(list, (a,b)->{
           if (a[1] == b[1]) return Double.compare(a[0], b[0]); 
            return Double.compare(b[1], a[1]);
        });
        int[] result = new int[list.length];
        for(int i = 0; i < list.length; i ++){
            answer[i] = (int) (list[i][0]);
        }
        
//         해시맵에 다 넣고나서, 1부터 N까지 반복하면서 스테이지별 실패율 구하는데
//         스테이지번호를 키로 넣어 나오는 value를 그때마다 전체 인원수에서 뺴주면됨
        
        return answer;
    }
}