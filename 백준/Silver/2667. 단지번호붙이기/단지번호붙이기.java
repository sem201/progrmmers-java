
import java.io.*;
import java.util.*;
public class Main {
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int N;
    static int count=0;
    static int cnt;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visit = new boolean[N][N];

        ArrayList<Integer> cntArr = new ArrayList<>();

        for(int i=0; i<N; i++){
            String[] arr = br.readLine().split("");
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visit[i][j] && map[i][j] != 0){
                    count++;
                    cnt=0;
                    dfs(i,j);
                    cntArr.add(cnt);
                }
            }
        }
        Collections.sort(cntArr);

        System.out.println(count);
        for(int i=0; i<cntArr.size();i++){
            System.out.println(cntArr.get(i));
        }

    }
    public static void dfs(int a, int b){
        visit[a][b] =true;
        cnt++;
        for(int i=0; i<4; i++){
            int nx = dx[i] + a;
            int ny = dy[i] + b;

            if(nx >= 0 && ny >= 0 && nx <N && ny<N){
                if(!visit[nx][ny] && map[nx][ny]==1){
                    dfs(nx,ny);
                }
            }
        }
    }
}
