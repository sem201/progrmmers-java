import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer,String> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for(int i=1; i<N+1; i++){
            String s = br.readLine();
            map.put(i,s);
            map2.put(s,i);
        }
        for(int i=0;i<M; i++){
            String str = br.readLine();
            if(isNumber(str)){
                sb.append(map.get(Integer.parseInt(str)));
                sb.append("\n");
            }else{
                sb.append(map2.get(str));
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean isNumber(String s){
        return s.matches("^\\d+$");
    }
}
