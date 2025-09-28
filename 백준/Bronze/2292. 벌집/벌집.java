

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int layer = 1;
        int count = 1;

        while(count < N){
            count += 6 * layer;
            layer++;
        }
        System.out.println(String.valueOf(layer));
    }
}
