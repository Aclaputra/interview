package com.problem.java.dsa;

import java.util.ArrayList;
import java.util.HashSet;

public class ConstantTimeHashSet {
  public static void main(String[] args) {
    HashSet<ArrayList> scoreBoard = new HashSet<>();
    ArrayList<Integer> scores = new ArrayList<>();

    scores.add(2);
    scores.add(3);
    scoreBoard.add(scores);

    System.out.println(scoreBoard[0]);
  }
}
