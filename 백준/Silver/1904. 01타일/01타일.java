
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int size= Math.max(4,N+1);
        int[] dp = new int[size];

        dp[1] = 1;
        dp[2] = 2;
        if(N>=3){
            for(int i=3; i<=N; i++){
                dp[i] =  (dp[i-1] + dp[i-2]) % 15746;
            }
        }
        System.out.println(dp[N]);
    }
}