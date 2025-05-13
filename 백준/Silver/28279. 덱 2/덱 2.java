import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            switch (Integer.parseInt(st.nextToken())){
                case 1:
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(dq.pollFirst()).append("\n");
                    }
                    break;
                case 4:
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(dq.pollLast()).append("\n");
                    }
                    break;
                case 5:
                    sb.append(dq.size()).append("\n");
                    break;
                case 6:
                    if(dq.isEmpty()){
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                    break;
                case 7:
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(dq.peekFirst()).append('\n');
                    }
                    break;
                case 8:
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");
                    }else{
                        sb.append(dq.peekLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }

}
