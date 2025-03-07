
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int T = Integer.parseInt(br.readLine());
            int[] k =fibo(T);
            sb.append(k[0]);
            sb.append(" ");
            sb.append(k[1]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static int[] fibo(int v){
        int[][] dp = new int[v+1][2];
        if(v==0){
            dp[0][0] =1;
            dp[0][1] =0;
            return dp[0];
        }
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        for(int i=2; i<=v ; i++){
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }
        return dp[v];
    }
}
