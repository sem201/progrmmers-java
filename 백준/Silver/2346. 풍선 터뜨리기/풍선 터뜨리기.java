import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Deque<int[]> dq = new ArrayDeque<>();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i <N ; i++) {
            dq.add(new int[] {i+1,arr[i]});
        }
        dq.poll();
        sb.append(1).append(" ");
        int x = arr[0];
        while(!dq.isEmpty()){
            if(x>0){
                for(int i=1; i<x; i++){
                    dq.add(dq.poll());
                }
                int[] nx = dq.poll();
                x = nx[1];
                sb.append(nx[0]).append(" ");
            }
            else{
                for(int i=1; i<-x; i++){
                    dq.addFirst(dq.pollLast());
                }
                int[] nx = dq.pollLast();
                x = nx[1];
                sb.append(nx[0]).append(" ");
            }
        }
        System.out.println(sb);

    }
}
