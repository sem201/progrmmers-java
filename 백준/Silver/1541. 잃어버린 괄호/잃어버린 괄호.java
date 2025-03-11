import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        int sum = Integer.MAX_VALUE;

        while(st.hasMoreTokens()){
            int k = 0;
            StringTokenizer add = new StringTokenizer(st.nextToken(),"+");
            while(add.hasMoreTokens()){
                k+=Integer.parseInt(add.nextToken());
            }
            if(sum==Integer.MAX_VALUE){
                sum = k;
            }
            else{
                sum -=k;
            }

        }
        System.out.println(sum);
    }
}
