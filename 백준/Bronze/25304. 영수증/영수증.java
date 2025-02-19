
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(bf.readLine());
        int N = Integer.parseInt(bf.readLine());
        int total = 0;
        for(int i=0; i<N; i++){
            String str = bf.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int price=Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            total += price*count;
        }
        if(total == x){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
