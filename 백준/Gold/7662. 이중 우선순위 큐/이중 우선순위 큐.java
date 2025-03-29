
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static PriorityQueue<Integer> maxq;
    static PriorityQueue<Integer> minq;
    static Map<Integer, Integer> countMap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int a = 0; a < T; a++) {
            int k = Integer.parseInt(br.readLine());
            minq = new PriorityQueue<>();
            maxq = new PriorityQueue<>(Collections.reverseOrder());
            countMap = new HashMap<>();

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                String cmd = st.nextToken();
                int x = Integer.parseInt(st.nextToken());

                if (cmd.equals("I")) {
                    maxq.add(x);
                    minq.add(x);
                    countMap.put(x, countMap.getOrDefault(x, 0) + 1);
                } else {
                    if (x == 1) {
                        removeValid(maxq);
                    } else {
                        removeValid(minq);
                    }
                }
            }

            cleanQueue(maxq);
            cleanQueue(minq);

            if (countMap.isEmpty()) {
                sb.append("EMPTY\n");
            } else {
                sb.append(maxq.peek()).append(" ").append(minq.peek()).append("\n");
            }
        }

        System.out.print(sb);
    }

    // 우선순위 큐에서 유효한 값 하나 꺼냄
    private static int removeValid(PriorityQueue<Integer> pq) {
        while (!pq.isEmpty()) {
            int val = pq.poll();
            if (countMap.containsKey(val)) {
                int cnt = countMap.get(val);
                if (cnt == 1) {
                    countMap.remove(val);
                } else {
                    countMap.put(val, cnt - 1);
                }
                return val;
            }
        }
        return 0;
    }

    // 큐 정리: countMap에 없는 값들은 제거
    private static void cleanQueue(PriorityQueue<Integer> pq) {
        while (!pq.isEmpty() && !countMap.containsKey(pq.peek())) {
            pq.poll();
        }
    }
}
