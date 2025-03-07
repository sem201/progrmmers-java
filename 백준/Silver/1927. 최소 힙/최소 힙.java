
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        StringBuilder sb= new StringBuilder();

        for(int i=0; i<N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x !=0){
                minheap.add(x);
            }else{
                if(minheap.isEmpty()){
                    sb.append(0);
                    sb.append("\n");
                }else{
                    sb.append(minheap.poll());
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
