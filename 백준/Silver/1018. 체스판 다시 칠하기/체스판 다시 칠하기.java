import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static boolean[][] map;
    static int min = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new boolean[N][M];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                if(str.charAt(j)=='W'){
                    map[i][j] = true;
                }
                else{
                    map[i][j] = false;
                }
            }
        }

        for(int i=0; i<N-7; i++){
            for(int j=0; j<M-7; j++){
                findCnt(i,j);
            }
        }
        System.out.println(min);

    }
    public static void findCnt(int a, int b){
        int cnt =0;
        boolean start = map[a][b];
        for(int i=a; i<a+8; i++){
            for(int j=b; j<b+8 ;j++){
                if (map[i][j] != start){
                    cnt++;
                }
                start = !start;
            }
            start = !start;
        }
        cnt = Math.min(cnt,64-cnt);
        min = Math.min(min,cnt);
    }
}
