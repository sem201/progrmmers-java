
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int i =Integer.parseInt(bf.readLine());
        for(int k=0; k<i; k++){
            String s = bf.readLine();
            System.out.println(s.charAt(0)+""+s.charAt(s.length()-1));

        }


    }
}
