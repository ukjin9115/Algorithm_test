
import java.util.*;
import java.io.*;
public class Main {
    static Stack<Integer> st = new Stack<>();
    static int N;
    public static void main(String[] args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         N = Integer.parseInt(br.readLine());

         for(int i = 0; i < N; i ++){
             int k = Integer.parseInt(br.readLine());
             if(k != 0){
                 st.push(k);
             }if(!st.isEmpty() && k == 0){
                 st.pop();
             }
         }

         ArrayList<Integer> list = new ArrayList<>();
         while(!st.isEmpty()){
             list.add(st.pop());
         }
         int sum = 0 ;
         for(int n : list){
             sum += n;
         }
        bw.write(String.valueOf(sum));
         bw.close();
         br.close();
    }
}
