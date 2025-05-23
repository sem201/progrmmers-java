
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static int[] useNum;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        useNum = new int[N];
        visit = new boolean[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            useNum[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(useNum);
        dfs(0);
        System.out.println(sb);

    }
    public static void dfs(int depth){
        if(depth==M){
            for(int val:arr){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }
        else{
            for(int i=0; i<N;i++){
                if(!visit[i]){
                    visit[i] = true;
                    arr[depth] = useNum[i];
                    dfs(depth+1);
                    visit[i] = false;
                }
            }
        }
    }
}
