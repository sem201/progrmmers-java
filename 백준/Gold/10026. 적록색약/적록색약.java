
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static char[][] arr;
    static boolean[][] visit;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        visit = new boolean[N][N];
        for(int i=0; i<N;i++){
            String str = br.readLine();
            for(int j=0; j<N;j++){
                arr[i][j] = str.charAt(j);
            }
        }
        int count =0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visit[i][j]){
                    count++;
                    dfs(i,j);
                }
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0;j<N; j++){
                if(arr[i][j] == 'R'){
                    arr[i][j] = 'G';
                }
            }
        }
        visit = new boolean[N][N];
        int newCount = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visit[i][j]){
                    newCount++;
                    dfs(i,j);
                }
            }
        }

        System.out.println(count +" "+newCount);


    }
    static void dfs(int a, int b){
        char x = arr[a][b];
        for(int k=0;k<4;k++){
            int nx = a + dx[k];
            int ny = b + dy[k];
            if(nx>=0 && ny>=0 && nx<N && ny<N){
                if(!visit[nx][ny] && arr[nx][ny]==x){
                    visit[nx][ny] = true;
                    dfs(nx,ny);
                }
            }
        }
    }
}
