import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static int N;
    static int K;
    static int[] visited = new int [100001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int result = bfs(N);
        System.out.println(result);


    }
    public static int bfs(int node){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(node);
        int n = 0;
        visited[node] = 1;
        while(!q.isEmpty()){
            n = q.remove();
            if(n == K){
                return visited[n] - 1;
            }
            if(n-1 >= 0 && visited[n-1]==0){
                visited[n-1] = visited[n]+1;
                q.add(n-1);
            }
            if(n+1 <= 100000 && visited[n+1] ==0){
                visited[n+1] = visited[n]+1;
                q.add(n+1);
            }
            if(2*n<= 100000 && visited[2*n]==0){
                visited[2*n] = visited[n]+1;
                q.add(2*n);
            }
        }
        return -1;
    }
}
