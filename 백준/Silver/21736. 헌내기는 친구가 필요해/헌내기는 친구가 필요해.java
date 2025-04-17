
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] map;
    static boolean[][] visit;
    static int N;
    static int M;

    static int x;
    static int y;

    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        visit = new boolean[N][M];

        for(int i=0; i<N;i++){
            String s = br.readLine();
            for(int j=0; j<M; j++){
                if(s.charAt(j) == 'I'){
                    x = i;
                    y = j;
                }
                map[i][j] = s.charAt(j);
            }
        }
        dfs(x,y);
        if(cnt>0){
            System.out.println(cnt);
        }else{
            System.out.println("TT");
        }

    }
    public static void dfs(int a, int b){
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        visit[a][b] = true;
        for(int i=0; i<4; i++){
            int nx = a+dx[i];
            int ny = b+dy[i];
            if(nx>=0 && ny >=0 && nx<N && ny<M){
                if(!visit[nx][ny] && map[nx][ny] != 'X'){
                    if(map[nx][ny] == 'P'){
                        cnt++;
                    }
                    dfs(nx,ny);
                }
            }

        }
    }
}