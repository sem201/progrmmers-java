import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cnt1 =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int a = fib(N);
        int b = fibonacci(N);
        System.out.println(cnt1+" "+b);

    }
    public static int fib(int n){
        if(n==1 || n==2){
            cnt1++;
            return 1;
        }
        else{
            return fib(n-1)*fib(n-2);
        }
    }

    public static int fibonacci(int n){
        int cnt=1;
        int[] dp = new int[n];
        if(n==1 || n==2){
            return 1;
        }
        dp[1] = dp[2]= 1;
        for(int i=3; i<n; i++){
            dp[i] = dp[i-1]+dp[i-2];
            cnt++;
        }
        return cnt;
    }
}
