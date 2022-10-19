package com.problem.java.shopee.codeleague;

import java.util.*;

public class InstallationOfAShopeeBillBoard {
  static Scanner sc = new Scanner(System.in);
  static void solve(int T) {

    // O(1)
    ArrayList<Integer> installations = new ArrayList<>();
    // O(n) / O(4)
    for (int i=0; i<T; i++) {
      int x = sc.nextInt();
      installations.add(x);
    }

    int maxi = 0;
    // O(n) / O(4)
    for (int i : installations) {
      maxi = Math.max(maxi, i);
    }

    System.out.println(maxi);
  }

  public static void main(String[] args) {
    int T = sc.nextInt();
    solve(T);
  }
  /**
   *  total time complexity = O(1 + 4 + 4) = O(9)
   */
}

