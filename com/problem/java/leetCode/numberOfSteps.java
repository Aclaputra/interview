class Solution {
  public static int numberOfSteps(int num) {
    int c = 0;
    while (num > 0) {
      if (num % 2 ==  0) num /= 2;
      else num--;
      c++;
    }
    return c;
  }

  public static void main(String[] args) {
    System.out.println(numberOfSteps(14));
    System.out.println(numberOfSteps(100));
  }
}
