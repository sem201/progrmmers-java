
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int len = num.length();
        char[] numArr = new char[len];

        for(int i=0; i<len;i++){
            numArr[i] = num.charAt(i);
        }
        for(int i=0; i<len; i++){
            for(int j=0; j<len-1; j++){
                if(numArr[j] <numArr[j+1]){
                    char tmp;
                    tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;
                }
            }
        }
        for(int i=0; i<len; i++){
            System.out.print(numArr[i]);
        }
    }
}
