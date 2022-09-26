import java.util.Scanner;

class Solution 
{
  public static int numberOfRecordBreakingDays(int numberOfDays, int[] visitors)
  {
    int recordBreakingDays = 0;
    int previousRecord = 0;

    for (int j = 0; j < visitors.length; ++j)
    {
      Boolean greaterThanPreviousDays = j == 0 || visitors[j] > previousRecord;
      Boolean greaterThanNextDays = j == visitors.length-1 || visitors[j] > visitors[j+1];
      
      if (greaterThanPreviousDays && greaterThanNextDays)
      {
        recordBreakingDays++;
      }
        previousRecord = Math.max(previousRecord, visitors[j]);
    }
    
    return recordBreakingDays;
  }

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    // Get number of test cases in input
    int testCaseCount = scanner.nextInt();
    // Iterate through test cases
    for (int tc = 1; tc <= testCaseCount; ++tc)
    {
      // Get number of days for this test case
      int numberOfDays = scanner.nextInt();
      // Get attendance for each day
      int[] visitorsPerDay = new int[numberOfDays];
      for(int d = 0; d < numberOfDays; ++d)
      {
        visitorsPerDay[d] = scanner.nextInt();
      }
      // Print results
      int answer = numberOfRecordBreakingDays(numberOfDays, visitorsPerDay);
      System.out.println("Case #"+tc+": "+answer);
    }
  }
}
