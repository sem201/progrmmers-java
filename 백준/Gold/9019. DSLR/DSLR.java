import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine()," ");
            int pre = Integer.parseInt(st.nextToken());
            int post = Integer.parseInt(st.nextToken());
            boolean[] visit = new boolean[10000];
            String[] command = new String[10000];
            Queue<Integer> q = new LinkedList<>();

            q.add(pre);
            visit[pre] = true;
            Arrays.fill(command,"");

            while(!q.isEmpty()){
                int now = q.poll();
                int D = (now*2) %10000;
                int S = now == 0 ? 9999: now -1;
                int L = (now%1000)*10 + now/1000;
                int R = (now%10)*1000 +(now/10);

                if(!visit[D]){
                    q.add(D);
                    visit[D] = true;
                    command[D] = command[now] +"D";
                }
                if(!visit[S]){
                    q.add(S);
                    visit[S] = true;
                    command[S] = command[now] +"S";
                }
                if(!visit[L]){
                    q.add(L);
                    visit[L] = true;
                    command[L] = command[now] + "L";
                }
                if(!visit[R]){
                    q.add(R);
                    visit[R] = true;
                    command[R] = command[now] +"R";
                }
            }
            System.out.println(command[post]);
        }
    }
}
