import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int[] numbers=new int [10];
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt()%42;
            set.add(num);
        }

        System.out.println(set.size());
    }
}