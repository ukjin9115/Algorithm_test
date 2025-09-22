

import java.io.*;
import java.util.*;

public class Main {
    static  int N,M,R;
    static  boolean[] visited;
    static ArrayList<Integer>[] map;
    static  int[] answer;
    static  int count = 1;

    static void dfs(int idx){
        visited[idx] = true;
        answer[idx] = count++;

        for(int i = 0; i < map[idx].size(); i ++){
            int next = map[idx].get(i);
            if(!visited[next]) dfs(next);
        }

    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //정점수
        M = Integer.parseInt(st.nextToken());   //간선수
        R = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        answer = new int[N+1];
        map = new ArrayList[N+1];
        //맵내부
        for(int i = 1; i <= N; i ++){
            map[i] = new ArrayList<>();
        }
        //그래프채우기
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            map[u].add(v);
            map[v].add(u);
        }
        //그래프 내림차순 정렬
        for(int i = 1; i <= N; i ++){
            Collections.sort(map[i] , Collections.reverseOrder());
        }
        //dfs
        dfs(R);
        //쓰기
        for(int i = 1; i < answer.length; i ++){
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
