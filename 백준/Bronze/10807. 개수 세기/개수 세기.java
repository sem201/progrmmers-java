import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int cnt = 0;
        String arr = bf.readLine();
        int v = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(arr, " ");
        while(st.hasMoreTokens()){
            if(Integer.parseInt(st.nextToken())==v){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
