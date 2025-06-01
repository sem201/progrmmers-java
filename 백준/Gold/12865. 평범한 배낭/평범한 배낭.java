import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] dp= new int[N+1][K+1];
        int[] arrW = new int[N+1];
        int[] arrV = new int[N+1];
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            arrW[i] = Integer.parseInt(st.nextToken());
            arrV[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=1; i<=N;i++){
            for(int j=1; j<=K; j++){
                if(arrW[i]>j){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-arrW[i]]+arrV[i]);
                }

            }
        }
        System.out.println(dp[N][K]);

    }
}
