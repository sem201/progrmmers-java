import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            map.put(st.nextToken(),st.nextToken());
        }
        for(int i=0; i<M; i++){
            String s = br.readLine();
            sb.append(map.get(s));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
