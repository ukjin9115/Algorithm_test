
import java.util.*;
import java.io.*;
public class Main {
    static Stack<Character> st = new Stack<>();
    static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i ++){
            String str = br.readLine();
            st.clear();
            boolean valid = true;

            for(int j = 0; j < str.length(); j ++){
                char ch = str.charAt(j);
                if(ch == '(') st.push(ch);
                else if(ch == ')'){
                    if(!st.isEmpty()) st.pop();
                    else{
                        valid = false;
                        break;
                    }
                }
            }
            if(valid && st.isEmpty()) bw.write("YES\n");
            else bw.write("NO\n");
        }
        bw.close();
        br.close();
    }
}
