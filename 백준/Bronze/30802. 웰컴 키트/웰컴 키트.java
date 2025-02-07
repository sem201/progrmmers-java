import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int par = Integer.parseInt(bf.readLine());
        int[] arr = new int[6];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<6; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(bf.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());


        int answer1=0;
        for(int num : arr){
            int temp;
            temp = num % t==0 ? num/t:num/t+1;
            answer1+=temp;
        }

        bw.write(answer1 +"\n");
        bw.write(par/p+ " "+par%p);

        bw.flush(); 
        bw.close();
        bf.close();
    }
}
