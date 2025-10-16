import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {
    static char [][] arr;
    static boolean[][] visit;
    static int N,M,V;
    static StringBuilder sb;
    static int W;
    static int B;
    static int cnt=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new char[M][N];
        visit = new boolean[M][N];

        for(int i=0;i<M;i++){
            String str = br.readLine();
            for(int j=0;j<N;j++){
                arr[i][j] = str.charAt(j);
            }
        }

        for(int i=0; i<M; i++){
            for(int j=0; j<N;j++){
                if(!visit[i][j]){
                    char color = arr[i][j];
                    cnt =0;
                    int count = dfs(i,j,color);
                    if(color == 'W') W +=count *count;
                    else B+=count * count;
                }
            }
        }
        System.out.print(W+" "+B);
    }
    public static int dfs(int a,int b,char c){

        visit[a][b] = true;
        cnt++;
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        for(int i=0; i<4;i++){
            int newA = a+dy[i];
            int newB = b+dx[i];
            if(newA >= 0 && newB >=0 && newA<M &&newB<N){
                if(!visit[newA][newB] && arr[newA][newB]==c){
                    dfs(newA,newB,c);
                }
            }
        }
        return cnt;
    }
    

}
