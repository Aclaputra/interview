import java.util.Scanner;
import java.io.PrintStream;

class Codechef {
    static Scanner sc = new Scanner(System.in);
    static PrintStream out = System.out;
    static void solve() {
        int n= sc.nextInt();
        int s1 = 0; int s2 = 0;
        String cc[] = new String[n];
        for (int i=0; i<n; i++) cc[i] = sc.next();
        for (int i=0; i<n; i++) {
            if (cc[i].equals("START38")) s1++;
            else s2++;
        } out.println(s1 + " " + s2);
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0) solve();
        sc.close();
    }
}