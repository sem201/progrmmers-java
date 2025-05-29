
import java.io.*;

public class Main {
    static int[][] map;
    static int N;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i=0; i<N; i++){
            String st = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] = st.charAt(j)-'0';
            }
        }
        partition(0,0,N-1,N-1);
        System.out.println(sb);

    }
    public static int isSame(int x, int y,int endx,int endy){
        int point=map[x][y];
        for(int i=x; i<=endx; i++){
            for(int j=y; j<=endy; j++){
                if(map[i][j]!= point){
                    return -1;
                }
            }
        }
        return point;
    }
    public static void partition(int startx, int starty, int endx,int endy){
        int check=isSame(startx,starty,endx,endy);
        if(check!=-1){
            sb.append(check);
            return;
        }else{
            int midx = startx + ((endx-startx)/2);
            int midy = starty + ((endy-starty)/2);
            sb.append("(");
            partition(startx,starty,midx,midy);
            partition(startx,midy+1,midx,endy);
            partition(midx+1,starty,endx,midy);
            partition(midx+1,midy+1,endx,endy);
            sb.append(")");
        }
    }
}
