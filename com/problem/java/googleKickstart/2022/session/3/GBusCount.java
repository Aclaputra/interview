
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Hashtable;

class GBus {
  public static void main(String[] args) {
      gBus();
  }

  public static int gBus() {
      Scanner in = new Scanner(System.in);
          int numTests = in.nextInt();
          if (numTests > 10 || numTests < 1) {
              return -1;
          }

          int numGBuses;
          
      // For each test, calculate, for each of i cities, the num of GBuses that serve city C_i,
      // based on the range of cities the buses serve–in the form A_1 B_1 A_2 B_2 A_3 B_3 ... A_N B_N.
          for (int caseNum = 1; caseNum <= numTests; caseNum++) {
              HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
              numGBuses = in.nextInt();

              //System.out.println(numGBuses);
              
          //** Add the origin and destination A_i, B_i of a GBus to a list, put each list in map(i) **//
              for (int i = 1; i <= numGBuses; i++) {
                  ArrayList<Integer> pair = new ArrayList<>();
                  pair.add(in.nextInt()); // insert A_i
                  pair.add(in.nextInt()); // insert B_i
                  map.put(i, pair);       // insert [A_i, B_i] to map(i)
              }
          //System.out.println(map);

              int numCities = in.nextInt();
          //System.out.println(numCities);
              int cityCount = 0;  // to count up to numCities
              int city;           // city C_i in the case
              System.out.print("Case #" + caseNum + ":");

              while (cityCount != numCities) {    // for each city C_i we're interested in...
                  ArrayList<Integer> y = new ArrayList<>(); // to store num GBuses that serve city C_i for i cities.
                  int serveCount = 0; // num GBuses that serve C_i

                  city = in.nextInt();
          //System.out.println(city);
                  for (int k : map.keySet()) {
                      if (city>=map.get(k).get(0) && (city<=map.get(k).get(1))) {
                          serveCount++;
                      }
                  }
                  y.add(serveCount);
                  for (int i : y) {
                      System.out.print(" " + i);
                  }
                  cityCount++;

              }
              System.out.println();
          //System.out.println(y);
              String s = in.nextLine();

          }
      return 0;
  }
}
