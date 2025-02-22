
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] att = new int[31];
        for(int i=0;i<28; i++){
            att[Integer.parseInt(bf.readLine())]=1;
        }
        for(int i=1;i<31;i++){
            if(att[i]!=1){
                System.out.println(i);
            }
        }
    }
}
