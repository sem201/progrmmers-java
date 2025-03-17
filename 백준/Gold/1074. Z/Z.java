
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int ans=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int size = (int)Math.pow(2,N);
        find(r,c,size);
    }
    public static void find(int r, int c, int size){

        if(size == 1){
            System.out.println(ans);
            return ;
        }
        int half = size /2;
        if(r < half && c < half) { // 1사분면
            find(r,c, half);
        }
        else if (r < half && c >= half){
            ans +=half*half;
            find(r,c-half, half);
        }
        else if(r >= half && c < half){
            ans += 2* half*half;
            find(r-half,c, half);
        }

        else{
            ans += half*half *3;
            find(r-half,c-half, half);
        }
    }
}
