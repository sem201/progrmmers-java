
import java.io.*;
import java.util.*;

public class Main {
    static int max = Integer.MIN_VALUE;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int N;
    static int M;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visit = new boolean[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                visit[i][j] = true;
                dfs(i,j,map[i][j],1);
                visit[i][j] = false;
            }
        }
        System.out.println(max);

    }
    public static void dfs(int a, int b, int sum,int count){
        if(count==4){
            max = Math.max(max, sum);
            return;
        }
        for(int i=0; i<4; i++){
            int na = a+dx[i];
            int nb = b+dy[i];

            if(na >=0 && nb >=0 && na < N && nb < M){
                if(!visit[na][nb]){
                    if(count==2){
                        visit[na][nb] = true;
                        dfs(a, b, sum + map[na][nb], count+1);
                        visit[na][nb] = false;
                    }
                    visit[na][nb] = true;
                    dfs(na, nb, sum+ map[na][nb], count+1);
                    visit[na][nb] = false;
                }
            }
        }
    }
}
