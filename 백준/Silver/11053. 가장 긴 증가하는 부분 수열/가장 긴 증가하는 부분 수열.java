
import java.io.*;
import java.util.*;
public class Main {
    static int[] arr;
    static int[] dp;
    static int N;
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dp = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N; i++){
            LIS(i);
        }
        int max = dp[0];
        for(int i=0; i<N; i++){
            max=Math.max(max,dp[i]);
        }

        System.out.println(max);
    }
    static int LIS(int N){
        if(dp[N] ==0){
            dp[N] = 1;
            for(int i=N-1; i>=0; i--){
                if(arr[i] < arr[N]){
                    dp[N] = Math.max(dp[N],LIS(i)+1);
                }
            }
        }
        return dp[N];
    }


}
