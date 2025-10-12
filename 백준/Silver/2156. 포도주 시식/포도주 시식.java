import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            int[] lst = new int[n+1];
            int[] dp = new int[n+1];
            for(int i=1; i<=n; i++){
                lst[i] = Integer.parseInt(br.readLine());
            }
        dp[0]=0;
        dp[1] = lst[1];
        if(n>1){
            dp[2] = lst[1]+lst[2];
        }

        for(int i=3; i<=n; i++){
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+lst[i],dp[i-3]+lst[i-1]+lst[i]));
        }

        System.out.println(dp[n]);
    }
}
