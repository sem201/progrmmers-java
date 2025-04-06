import java.util.*;
import java.io.*;
public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new int[n+1];
        dp[1] = 1;
        if(n==1){
            System.out.println(1);
            return;
        }

        dp[2] = 3;
        for(int i=3; i<=n; i++){
            dp[i] = (dp[i-2] * 2 + dp[i-1]) %10007;
        }
        System.out.println(dp[n]);
    }
}
