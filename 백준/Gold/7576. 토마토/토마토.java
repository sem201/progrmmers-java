
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int[][] arr;
    static boolean[][] visit;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static Queue<Point> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        M = Integer.parseInt(st.nextToken()); // 가로
        N = Integer.parseInt(st.nextToken()); // 세로

        arr = new int[N][M];
        visit = new boolean[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<M; j++){
                int x = Integer.parseInt(st.nextToken());
                if(x == 1){
                    q.add(new Point(i,j));
                }
                arr[i][j] = x;
            }
        }
        bfs();
        check();
    }

    public static void bfs(){
        while(!q.isEmpty()){
            Point current = q.poll();
            for(int i=0; i<4; i++){
                int nx = dx[i] + current.x;
                int ny = dy[i] + current.y;
                if(nx >=0 && ny>=0 && nx<N && ny <M )
                    if(!visit[nx][ny] && arr[nx][ny] == 0){
                        arr[nx][ny] = arr[current.x][current.y]+1;
                        visit[nx][ny] =true;
                        q.add(new Point(nx,ny));
                    }
            }
        }
    }

    public static void check(){
        int day=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]==0){
                    System.out.println(-1);
                    return;
                }
                day = Math.max(day,arr[i][j]);
            }
        }
        System.out.println(day-1);
    }
}

class Point{
    int x, y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}
