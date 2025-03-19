
import java.io.*;
import java.util.*;

public class Main {
    static int M, N, H;
    static int[][][] tomato;
    static boolean[][][] visit;
    static int[] dh = {1, -1, 0, 0, 0, 0};
    static int[] dr = {0, 0, 1, -1, 0, 0};
    static int[] dc = {0, 0, 0, 0, 1, -1};
    static Queue<Point3D> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        tomato = new int[H][N][M];
        visit = new boolean[H][N][M];

        for (int h = 0; h < H; h++) {
            for (int r = 0; r < N; r++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int c = 0; c < M; c++) {
                    tomato[h][r][c] = Integer.parseInt(st.nextToken());
                    // 초기 익은 토마토 (값 == 1) -> 큐에 넣기
                    if (tomato[h][r][c] == 1) {
                        q.add(new Point3D(h, r, c));
                        visit[h][r][c] = true;
                    }
                }
            }
        }

        bfs();
        checkTomato();
    }

    public static void bfs() {
        while (!q.isEmpty()) {
            Point3D p = q.poll();
            for (int i = 0; i < 6; i++) {
                int nh = p.h + dh[i];
                int nr = p.r + dr[i];
                int nc = p.c + dc[i];
                if (nh >= 0 && nh < H && nr >= 0 && nr < N && nc >= 0 && nc < M) {
                    if (tomato[nh][nr][nc] == 0 && !visit[nh][nr][nc]) {
                        tomato[nh][nr][nc] = tomato[p.h][p.r][p.c] + 1;
                        visit[nh][nr][nc] = true;
                        q.add(new Point3D(nh, nr, nc));
                    }
                }
            }
        }
    }

    static void checkTomato() {
        int days = 0;
        for (int h = 0; h < H; h++) {
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    if (tomato[h][r][c] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    days = Math.max(days, tomato[h][r][c]);
                }
            }
        }
        System.out.println(days - 1);
    }
}

class Point3D {
    int h, r, c;
    public Point3D(int h, int r, int c) {
        this.h = h;
        this.r = r;
        this.c = c;
    }
}
