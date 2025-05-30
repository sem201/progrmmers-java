
import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[] Node;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        Node = new int[N];
        visit = new boolean[N];
        arr = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            Node[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(Node);
        dfs(0);
        System.out.println(sb);
    }
    public static void dfs(int depth){
        if(depth == M){
            for(int val : arr){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        int check = 0;
        for(int i=0; i<N; i++){
            if(!visit[i] && check != Node[i]){
                visit[i] = true;
                arr[depth] = Node[i];
                check = Node[i];
                dfs(depth+1);
                visit[i] = false;
            }
        }
    }
}
