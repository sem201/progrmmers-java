import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    static int[][] arr;
    static boolean[] visited;
    static int node,line;
    static int count=0;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());
        
        arr = new int[node+1][node+1];
        visited = new boolean[node+1];
        
        for(int i=0; i<line; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            arr[a][b] = arr[b][a] = 1;
        }
        dfs(1);
        
        System.out.println(count-1);
    }
    public static void dfs(int start){
        visited[start] = true;
        count ++;
        for(int i=0; i<=node;i++){
            if(arr[start][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }
}