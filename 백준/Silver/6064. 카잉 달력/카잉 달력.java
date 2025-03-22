import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int s=0; s<T; s++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            boolean check = false;
            for (int i = x; i <= (M * N); i += M) {
    int mod = i % N;
    if (mod == 0) {
        mod = N;
    }
    if (mod == y) {
        System.out.println(i);
        check = true;
        break;
    }
}
            if(!check){
                System.out.println(-1);
            }
        }
    }
}
