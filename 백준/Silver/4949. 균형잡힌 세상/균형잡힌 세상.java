
import java.util.*;
import java.io.*;
public class Main{
    static Stack<Character> st = new Stack<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            String line = br.readLine();
            if(line.equals(".")) break;

            st.clear();
            boolean valid = true;

            for(int i = 0; i < line.length(); i ++){
                char ch = line.charAt(i);
                if(ch == '(' || ch == '[') st.push(ch);

                else if(ch == ')'){
                    if(!st.isEmpty() && st.peek() == ('(')) st.pop();
                    else{valid = false; break;}
                }
                else if(ch == ']'){
                    if(!st.isEmpty() && st.peek() == ('[')) st.pop();
                    else{valid = false; break;}
                }
            }
            if(valid && st.isEmpty()) bw.write("yes\n");
            else bw.write("no\n");
        }
        bw.close();
        br.close();
    }
}
