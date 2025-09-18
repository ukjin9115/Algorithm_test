
import java.util.*;
import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static LinkedList<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("1")) {
                q.offerFirst(Integer.parseInt(st.nextToken()));
            }
            else if(cmd.equals("2")){
                q.offerLast(Integer.parseInt(st.nextToken()));
            }
            else if(cmd.equals("3")){
                if(!q.isEmpty()) {
                    bw.write(String.valueOf(q.poll()));
                    bw.newLine();
                }
                else bw.write("-1\n");
            }
            else if(cmd.equals("4")){
                if(!q.isEmpty()) {
                    bw.write(String.valueOf(q.pollLast()));
                    bw.newLine();
                }
                else bw.write("-1\n");
            }
            else if(cmd.equals("5")){
                bw.write(String.valueOf(q.size()));
                bw.newLine();
            }
            else if(cmd.equals("6")){
                if(!q.isEmpty()) bw.write("0\n");
                else bw.write("1\n");
            }
            else if(cmd.equals("7")){
                if(!q.isEmpty()) {
                    bw.write(String.valueOf(q.peekFirst()));
                    bw.newLine();
                }
                else bw.write("-1\n");
            }
            else if(cmd.equals("8")){
                if(!q.isEmpty()) {
                    bw.write(String.valueOf(q.peekLast()));
                    bw.newLine();
                }
                else bw.write("-1\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}