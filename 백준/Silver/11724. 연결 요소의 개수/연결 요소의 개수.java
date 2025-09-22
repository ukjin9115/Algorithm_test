import java.util.*;
import java.io.*;

class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int N,M;
    static int answer;

    static void dfs(int idx){
        visited[idx] = true; //방문처리
        for(int i = 1; i <= N; i ++){
            if(!visited[i] && graph[idx][i]) dfs(i);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];
        graph = new boolean[N+1][N+1];

        int u , v;
        for(int i = 0; i < M; i ++){
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            graph[u][v] = true;
            graph[v][u] = true;
        }

        // dfs(1);
        for(int i = 1; i <= N; i ++){
            if(!visited[i]){
                dfs(i);
                answer++;
            }
        }


        bw.write(String.valueOf(answer));
        br.close(); 
        bw.close();
    }
}
