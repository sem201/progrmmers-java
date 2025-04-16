
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int min;
    static int max;

    static int N;
    static int M;
    static int B;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        min = Integer.MAX_VALUE;
        max = 0;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<M; j++){
                int tmp = Integer.parseInt(st.nextToken());
                if(min>tmp) min = tmp;
                if(max<tmp) max = tmp;
                arr[i][j] = tmp;
            }
        }
        int time=Integer.MAX_VALUE;
        int height=0;
        for(int x=min; x<=max; x++){
            int tmp = calcTime(x);
            if(tmp < time){
                time = tmp;
                height = x;
            }
            if(tmp == time && x > height){
                height=x;
            }
        }
        System.out.println(time+" "+height);



    }

    public static int calcTime(int x){

        int minusBlock=0;
        int plusBlock=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(arr[i][j] == x) continue;
                else if(arr[i][j]>x) minusBlock += arr[i][j] -x;
                else plusBlock += x - arr[i][j];
            }
        }

        if(B+minusBlock < plusBlock){
            return Integer.MAX_VALUE;
        }
         return plusBlock + minusBlock * 2;
    }
}
