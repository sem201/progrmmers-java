import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int[] parents;
    static int N;
    static List<List<Integer>> adjList;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        adjList = new ArrayList<>();
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];
        parents = new int[N+1];
        StringTokenizer st;
        for(int i=0; i<=N;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<N-1;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }
        dfs(1);
        for(int i=2; i<=N; i++){
            System.out.println(parents[i]);
        }

    }
    public static void dfs(int x){
        visited[x] = true;

        for(int adj : adjList.get(x)){
            if(!visited[adj]){
                parents[adj] = x;
                dfs(adj);
            }
        }
    }
}
