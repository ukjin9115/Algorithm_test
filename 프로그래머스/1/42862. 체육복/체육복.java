import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        //전체인원수 - 못입는 인원수 리턴
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        ArrayList<Integer> noHave = new ArrayList<>();
        ArrayList<Integer> Have = new ArrayList<>();
        ArrayList<Integer> both = new ArrayList<>();
        
        for(int l : lost) noHave.add(l);
        for(int r : reserve) Have.add(r);
        
        //중복검사
        for(int k : Have){
            if(noHave.contains(k)){
                both.add(k);
            }
        }
        //중복제거
        for(int s : both){
            noHave.remove(Integer.valueOf(s));
            Have.remove(Integer.valueOf(s));
        }
        //앞,뒤제거
        for(int k : Have){
            if(noHave.contains(k-1)){
                noHave.remove(Integer.valueOf(k-1));
            }else if(noHave.contains(k+1)){
                noHave.remove(Integer.valueOf(k+1));
            }
        }
        return n - noHave.size();
        
    }
}