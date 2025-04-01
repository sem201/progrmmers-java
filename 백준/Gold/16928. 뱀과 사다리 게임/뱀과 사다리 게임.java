import java.util.*;
import java.io.*;

public class Main {
    static HashMap<Integer,Integer> snake = new HashMap<>();
    static HashMap<Integer, Integer> ladder= new HashMap<>();
    static boolean[] visit = new boolean[101];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<M+N; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a>b){
                snake.put(a,b);
            }else{
                ladder.put(a,b);
            }
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visit[1] = true;
        int cnt =0;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int now = q.poll();
                if(now ==100){
                    System.out.println(cnt);
                    return;
                }
                for(int dice =1; dice<=6; dice++){
                    int next = now + dice;
                    if(next > 100 ) continue;
                    if(ladder.containsKey(next)) next = ladder.get(next);
                    if(snake.containsKey(next)) next = snake.get(next);

                    if(!visit[next]){
                        visit[next] = true;
                        q.add(next);
                    }
                }
            }
            cnt++;
        }

        System.out.println();

    }
}
