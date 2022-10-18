import java.util.Stack;
import java.util.List;

class FizzbuzzStack {

  public static List<String> fizzBuzz(int n)
  {
    Stack<String> res = new Stack<String>();
    for (int i = 1; i <= n; i++) {
      if (i % 15 == 0) res.push("FizzBuzz");
      else if (i % 5 == 0) res.push("Buzz");
      else if (i % 3 == 0) res.push("Fizz");
      else res.push(Integer.toString(i));
    }
    return res;
  }

  public static void main(String[] agrs)
  {
    System.out.println(fizzBuzz(15));
  }
}
