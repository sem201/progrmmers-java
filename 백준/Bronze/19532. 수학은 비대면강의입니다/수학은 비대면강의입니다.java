import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int k = b*d-e*a;
        int l = c*d - f*a;
        int y;
        for(y = -999; y<=999; y++){

            if(k*y==l){
                break;
            }
        }
        int x=0;
        if(a==0 && d==0){
            System.out.println(x+" "+y);
        }
        else if(a==0){
            x = (f-e*y)/d;
        }else{

        x = (c-b*y)/a;
        }
        System.out.println(x+" "+y);
    }

}
