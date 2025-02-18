import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String answer="";
        for(int i=0;i<N/4;i++){
            answer+="long ";
        }
        answer +="int";
        
        System.out.print(answer);
    }
}