import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] map;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N+1][N+1];
        StringTokenizer st;
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(1,2,0);
        System.out.println(cnt);
    }
    // direction 0 : 가로 , direction 1 : 세로 ,direction 2 : 대각선
    public static void dfs(int x, int y, int direction){
        if(x==N && y==N){
            cnt++;
            return;
        }
        switch (direction){
            case 0:
                if(y+1 <= N && map[x][y+1]==0){
                    dfs(x,y+1,0);
                }
                break;
            case 1:
                if(x+1<=N && map[x+1][y] == 0){
                    dfs(x+1, y,1);
                }
                break;
            case 2:
                if(x+1<=N && map[x+1][y]==0){
                    dfs(x+1,y,1);
                }
                if(y+1<=N && map[x][y+1]==0){
                    dfs(x,y+1,0);
                }
                break;
        }
        if(y+1<=N && x+1<=N && map[x][y+1]==0 && map[x+1][y]==0 && map[x+1][y+1]==0){
            dfs(x+1,y+1,2);
        }
    }
}
