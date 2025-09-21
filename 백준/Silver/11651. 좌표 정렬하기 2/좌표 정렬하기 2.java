import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Point> arr = new ArrayList<Point>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.add(new Point(a,b));
        }

        Collections.sort(arr);
        for(int i=0 ; i<N; i++){
            sb.append(arr.get(i).x).append(" ").append(arr.get(i).y).append("\n");
        }

        System.out.println(sb);
    }
}
class Point implements Comparable<Point>{
    int x,y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point point){
        if(this.y < point.y) return -1;   
        else if(this.y > point.y) return 1; 
        else{
            if(this.x < point.x) return -1; 
            else if(this.x > point.x) return 1;
            else return 0;
        }
    }
}

