
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

            if (cmd.equals("push")) {
                q.offer(Integer.parseInt(st.nextToken()));
            }
            else if (cmd.equals("front")) {
                if (q.isEmpty()) bw.write("-1\n");
                else bw.write(q.peek() + "\n");
            }
            else if (cmd.equals("pop")) {
                if (q.isEmpty()) bw.write("-1\n");
                else bw.write(q.poll() + "\n");
            }
            else if (cmd.equals("size")) {
                bw.write(q.size() + "\n");
            }
            else if (cmd.equals("empty")) {
                if (q.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            }
            else if (cmd.equals("back")) {
                if (q.isEmpty()) bw.write("-1\n");
                else bw.write(q.peekLast() + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}