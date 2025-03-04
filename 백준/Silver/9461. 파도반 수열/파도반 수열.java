
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    static long[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            long answer = p(n);
            sb.append(answer);
            if(i!=T-1){
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
    public static long p(int v){
        dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        if(v>5){
            for(int i=6; i<v+1; i++){
                dp[i] = dp[i-5] + dp[i-1];
            }
        }
        return dp[v];
    }
}
