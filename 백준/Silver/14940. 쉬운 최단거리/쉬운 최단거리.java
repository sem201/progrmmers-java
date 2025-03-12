import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int targetX = 0;
        int targetY = 0;
        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<M; j++){
                int x = Integer.parseInt(st.nextToken());
                if(x ==2){
                    targetX = i;
                    targetY = j;
                }
                map[i][j] = x;
            }
        }
        map[targetX][targetY]=0;
        bfs(targetX,targetY,N,M);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    map[i][j] = -1;
                }
                sb.append(map[i][j]);
                if(j < M - 1) sb.append(" ");
            }
            if(i < N - 1) sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    public static void bfs(int a, int b, int N, int M){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(a,b));
        visited[a][b] = true;
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        while(!q.isEmpty()){
            Point p = q.poll();
            for(int i=0; i<4; i++){
                int nx = p.x +dx[i];
                int ny = p.y + dy[i];
                if(nx >= 0 && nx<N && ny >=0 && ny <M ){
                    if(map[nx][ny]!=0 && !visited[nx][ny]){
                        map[nx][ny] = map[p.x][p.y]+1;
                        q.add(new Point(nx, ny));
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }
}

class Point{
    public int x,y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}