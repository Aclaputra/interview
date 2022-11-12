import java.util.*;

/**
 * Write a method to replace  all spaces in a string with %20. 
 * Input : "Mr John Smith     ", 13
 * Output : "Mr%20John%20Smith"
 **/

public class URLify {

  static void replaceSpaces(char[] str, int trueLength) {
    int spaceCount = 0, index, i = 0;
    for (i = trueLength - 1; i >= 0; --i) {
      if (str[i] == ' ') {
        spaceCount++;
      }
    }

    index = trueLength + spaceCount * 2;
    if (trueLength < str.length) str[trueLength] = '\0'; // End array
    for (i = trueLength - 1; i >= 0; --i) {
      if (str[i] == ' ') {
        str[index - 1] = '0';
        str[index - 2] = '2';
        str[index - 3] = '%';
        index = index - 3;
      } else {
        str[index - 1] = str[i];
        index--;
      }
    }
  }

  public static void main(String[] args) {
    String john = "Mr John Smith    ";
    char[] johnChar = john.toCharArray();
    replaceSpaces(johnChar, 17);
  }
}
