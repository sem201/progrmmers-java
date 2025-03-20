import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] node;
    static int[][] map;
    static int[][] newMap;
    static boolean[] visit;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        node = new int[N];
        map = new int[N][N];
        newMap = new int[N][N];
        for(int i=0; i<N; i++){
            node[i]=i;
        }
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                bfs(i,j);
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sb.append(newMap[i][j] +" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
    public static void bfs(int a, int b){
        visit = new boolean[N];
        Queue<Integer> q = new LinkedList<>();
        q.add(a);
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int i=0; i<N; i++){
                if(!visit[i] && map[cur][i]==1){
                    q.add(i);
                    visit[i] = true;
                    if(i==b){
                        newMap[a][b] = 1;
                        return;
                    }
                }
            }
        }

    }
}
