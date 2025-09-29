import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        char[] arr = dartResult.toCharArray();
        int idx = -1;
        
        for(int i = 0; i < arr.length; i ++){
            char c = arr[i];
            if(Character.isDigit(c)){
                idx++;
                if(c - '1' == 0 && arr[i+1] == '0' && i + 1 <arr.length){
                    score[idx] = 10;
                    i++;
                }else{
                     score[idx] = c - '0';
                }
            }
            else if(c == 'S'){
                score[idx] = score[idx];
            }
            else if(c == 'D'){
                score[idx] = score[idx] * score[idx];
            }
            else if(c == 'T'){
                score[idx] = score[idx] * score[idx] *  score[idx];
            }
            
            else if(c == '*'){
                score[idx] *= 2;
                if(idx > 0) score[idx-1] *= 2;
            }
            else if(c == '#'){
                score[idx] *= -1;
            }
        }
        
        for(int k : score){
            answer += k;
        }
        return answer;
    }
}