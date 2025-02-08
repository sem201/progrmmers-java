import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int stepNum = Integer.parseInt(bf.readLine());

        int[] dp = new int[stepNum +1];
        int[] steps = new int[stepNum+1];

        for(int i =1;i<=stepNum;i++){
            steps[i] = Integer.parseInt(bf.readLine());
        }
        dp[1] = steps[1];
        
        if(stepNum==1){
            System.out.println(steps[1]);
            return;
        }
        dp[1] = steps[1];
        dp[2] = steps[1] + steps[2];


        for (int i=3; i<=stepNum; i++){
            dp[i] = Math.max(dp[i - 2] + steps[i], dp[i - 3] + steps[i - 1] + steps[i]);
        }
        System.out.println(dp[stepNum]);
        bf.close();
    }
}
