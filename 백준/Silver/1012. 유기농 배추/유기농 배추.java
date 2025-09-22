

import java.util.*;
import java.io.*;

class Main {
    static boolean[][] graph;
    static boolean[][] visited;
    static int N,M,K,T;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};



    static void dfs(int y, int x){
        visited[y][x] = true;
        for(int i = 0; i < 4; i ++){
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if(graph[newY][newX] && !visited[newY][newX]) dfs(newY,newX);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());//가로길이
            N = Integer.parseInt(st.nextToken());//세로길이, 그래프에서 정점
            K = Integer.parseInt(st.nextToken()); //배추가 심어진 위치개수

            graph = new boolean[60][60];
            visited = new boolean[60][60];

            for(int i = 0; i < K; i ++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[y+1][x+1] = true;
            }

            int answer  =0;
            //상하좌우 방향으로 dfs
            for(int i = 1; i <=N; i ++){
                for(int j = 1; j <=M; j ++){
                    if(graph[i][j] && !visited[i][j]){
                        answer++;
                        dfs(i,j);
                    }

                }
            }
            //dfs 수행 후 덩어리개수 출력
            bw.write(String.valueOf(answer));
            bw.newLine();

        }

        bw.close();
        br.close();

    }
}
