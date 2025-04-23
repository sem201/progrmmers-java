
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        String M = br.readLine();
        int len = 2*N+1;

        String P = "";
        for(int i=0; i<N; i++){
            P = P+"IO";
        }
        P = P+"I"; // Pn 생성

        int cnt=0;

        for(int i=0; i<S-len+1; i++){
            if(M.substring(i,i+len).equals(P)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
