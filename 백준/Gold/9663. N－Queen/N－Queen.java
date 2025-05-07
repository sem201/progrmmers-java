

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] arr;
    static int cnt=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        nQueen(0);
        System.out.println(cnt);
    }

    public static void nQueen(int depth){
        if(depth == N){
            cnt ++;
            return;
        }
        for(int i=0; i<N; i++){
            arr[depth] =i;
            if(possible(depth)){
                nQueen(depth+1);
            }
        }
    }
    public static boolean possible(int col){
        for(int i=0; i<col; i++){
            if(arr[col]== arr[i]){
                return false;
            }
            else if(Math.abs(col-i)==Math.abs(arr[col]-arr[i])){
                return false;
            }
        }
        return true;
    }

}
