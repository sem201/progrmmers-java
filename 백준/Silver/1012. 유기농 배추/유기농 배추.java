
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visited;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            arr = new int[M][N];
            visited = new boolean[M][N];
            for(int i=0;i<K;i++){
                st = new StringTokenizer(br.readLine()," ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a][b] = 1;
            }
            int count =0;
            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    if(dfs(i,j)){
                        count++;
                    }
                }
            }
            sb.append(count);
            sb.append("\n");


        }
        System.out.println(sb);
    }
    public static boolean dfs(int a,int b){
        if(!visited[a][b] && arr[a][b] ==1){

        visited[a][b] = true;
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        for(int i=0; i<4;i++){
            if(a+dx[i] <0 || a+dx[i] >=visited.length || b+dy[i] <0 || b+dy[i] >= visited[0].length){
                continue;
            }
            if(arr[a+dx[i]][b+dy[i]]==1){
                dfs(a+dx[i],b+dy[i]);
            }
        }
        return true;
        }else{
            return false;
        }
    }
}
