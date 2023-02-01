import java.io.PrintStream;
import java.util.Scanner;
class Codechef {
    static Scanner sc = new Scanner(System.in);
    static PrintStream out = System.out;
    static int solve() {
        int l = sc.nextInt();
        int r = sc.nextInt();
        int count = 0;
        for (int i=l; i<=r; i++) {
            int a = 0;
            if (i > 10) {
                a = i % 10;
                if (a - 2 == 0 || a - 3 == 0 || a - 9 == 0) count++;
            }
            if (i - 2 == 0 || i - 3 == 0 || i - 9 == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0) out.println(solve());
        sc.close();
    }
}
