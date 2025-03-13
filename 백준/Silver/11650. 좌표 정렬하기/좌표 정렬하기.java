
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[][] x = new int[N][2];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            x[i][0] = Integer.parseInt(st.nextToken());
            x[i][1] =  Integer.parseInt(st.nextToken());
            
        }
        Arrays.sort(x,(e1,e2)->{
            if(e1[0] == e2[0]){
                    return e1[1] -e2[1];
            }else{
                return e1[0] - e2[0];
            }

        });
        for(int i=0; i<N; i++){
            sb.append(x[i][0] + " "+ x[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
