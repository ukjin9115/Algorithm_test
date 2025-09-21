class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int sum = 0;
        sum += Integer.parseInt(arr[0]);
        for(int i = 1; i < arr.length; i ++){
            if(i % 2 == 1){
                if(arr[i].equals("+")){
                    sum += Integer.parseInt(arr[i+1]);
                }else if(arr[i].equals("-")){
                    sum -= Integer.parseInt(arr[i+1]);
                }
            }
        }
        return sum;
    }
}