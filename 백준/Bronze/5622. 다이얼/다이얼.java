
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int len = str.length();
        int total = 0;
        for(int i=0; i<len; i++){
            switch (str.charAt(i)){
                case 'A': case'B': case'C':
                    total +=3;
                    break;
                case 'D': case'E': case'F':
                    total +=4;
                    break;
                case 'G': case'H': case'I':
                    total +=5;
                    break;
                case 'J': case'K': case'L':
                    total +=6;
                    break;
                case 'M': case'N': case'O':
                    total +=7;
                    break;
                case 'P': case'Q': case'R': case'S':
                    total +=8;
                    break;
                case 'T': case'U': case'V':
                    total +=9;
                    break;
                case 'W': case'X': case'Y': case'Z':
                    total +=10;
                    break;
            }
//
        }
        System.out.println(total);
    }
}
