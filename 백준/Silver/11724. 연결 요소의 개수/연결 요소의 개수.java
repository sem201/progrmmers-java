import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int cnt = 0;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr=new int[N+1][N+1];
        visited= new boolean[N+1];
        for(int i=0; i<M;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            arr[u][v] = arr[v][u] = 1;
        }
        for(int i=1; i<=N; i++){
            if(dfs(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean dfs(int v){
        if(!visited[v]){
            visited[v] = true;
            for(int i=1; i<arr.length;i++){
                if(!visited[i] && arr[v][i] == 1){
                    dfs(i);
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
