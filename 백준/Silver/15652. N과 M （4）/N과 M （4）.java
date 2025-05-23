
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        sb=new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        dfs(1,0);
        System.out.println(sb);

    }
    public static void dfs(int start, int depth){
        if(depth==M){
            for(int val:arr){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }
        else{
            for(int i=1; i<=N; i++){
                if(depth==0){
                    arr[depth] = i;
                    dfs(i,depth+1);
                }
                else if(arr[depth-1] <= i ){
                    arr[depth] = i;
                    dfs(i,depth+1);
                }
            }
        }
    }
}
