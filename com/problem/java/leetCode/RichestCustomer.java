class RichestCustomer {
  public int maximumWealth(int[][] accounts)
  {
    int maxWealth = 0;
    for (int[] account : accounts)
    {
      int currentSum = 0;
      for (int x : account)
      {
        currentSum += x;
      }
      if (currentSum > maxWealth) 
      {
        maxWealth = currentSum;
      }
    }
    return maxWealth;
  }
}
