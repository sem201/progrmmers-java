import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bucket = new int[N];
        for(int i=0; i<N; i++){
            bucket[i] = i+1;
        }
        
        for(int i=0; i<M; i++){
            st = new StringTokenizer(bf.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int temp;
            temp = bucket[a-1];
            bucket[a-1] = bucket[b-1];
            bucket[b-1] = temp;

        }


        System.out.println(Arrays.toString(bucket).replaceAll("[\\[\\],]",""));
    }
}
