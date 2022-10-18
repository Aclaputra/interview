package com.problem.java.hackerrank;

public class ConstantTimeFizzBuzz {
  public static void main(String[] args) {
    String s = "";
    int case3 = 0, case5 = 0;

    for (int i = 1; i <= 100; i++) {
      case3++;
      case5++;
      if (case3 == 3) {
        s += "fizz";
        case3 = 0;
      } else if (case5 == 5) {
        s+= "buzz";
        case5 = 0;
      }
      if (s.length() == 0)
        System.out.println(i);
      else
        System.out.println(s);
      s = "";
    }

  }
}
