

import java.io.*;
import java.util.*;

public class Main {
    static  int N,M ;
    static  int X,Y ;
    static  boolean[] visited;
    static ArrayList<Integer>[] graph;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static  int answer;


    public static void dfs(int idx, int count) throws IOException{
        visited[idx] = true;
        if(idx == Y){
            answer = count;
            return;
        }

        for(int i = 0; i < graph[idx].size(); i ++){
            int next = graph[idx].get(i);
            if(!visited[next]){
                dfs(next, count+1);
            }
        }
    }



    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); //사람 숫자
        StringTokenizer st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken()); //X는 부모
        Y = Integer.parseInt(st.nextToken()); // 자식
        M = Integer.parseInt(br.readLine()); //간선개수

        visited = new boolean[N+1];
        graph = new ArrayList[N+1];
        answer = -1;
        for(int i = 1; i <= N; i ++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < M; i ++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }
        dfs(X, 0);

        bw.write(String.valueOf(answer));

        bw.close();
        br.close();
    }
}
