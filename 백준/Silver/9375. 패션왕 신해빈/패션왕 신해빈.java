import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashMap<String, Integer> map;
        StringBuilder sb = new StringBuilder();
        for(int t=0; t<T; t++){
            int n = Integer.parseInt(br.readLine());
            map = new HashMap<>();
            int cnt =1;
            for(int i=0;i <n; i++){
                st = new StringTokenizer(br.readLine()," ");
                st.nextToken();
                String s = st.nextToken();
                map.put(s,map.getOrDefault(s,1)+1);

            }
            for(int val : map.values()){
                cnt *= (val);
            }
            sb.append(cnt-1).append("\n");
        }
        System.out.println(sb);
    }
}
