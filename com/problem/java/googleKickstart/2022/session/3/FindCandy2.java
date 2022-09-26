import java.util.Scanner;

public class Solution
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int T;
        T = sc.nextInt();
        
        for (int t = 1; t <= T; t++)
        {
            int N, M;
            N = sc.nextInt();
            M = sc.nextInt();
            
            int[] C = new int[N];
            
            for (int i = 0; i < N; i++)
            {
                C[i] = sc.nextInt();
            }
            
            int totalCandies = 0;
            for (int i = 0; i < N; i++)
            {
                totalCandies += C[i];
            }
            
            int leftOutCandies = totalCandies % M;
            
            System.out.println("Case #"+t+": "+leftOutCandies);
        }
        
    }
}
