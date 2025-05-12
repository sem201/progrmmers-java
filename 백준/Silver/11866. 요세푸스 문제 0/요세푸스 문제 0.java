import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=N; i++){
            q.add(i);
        }

        int cnt=1;
        sb.append("<");
        while(!q.isEmpty()){
            if(cnt %K != 0){
                q.add(q.poll());
            }else{
                sb.append(q.poll());
                if(!q.isEmpty()){
                    sb.append(", ");
                }
            }

            cnt++;
        }
        sb.append(">");
        System.out.println(sb);
    }
}
