package Day2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
  public static void main(String[] args) {
    int num = 12345;
    ArrayList<Integer> digits = new ArrayList<>();
    String numStr = String.valueOf(num);
    for (char c : numStr.toCharArray()) {
      digits.add(c - '0');
    }
    System.out.println("Original digits: " + digits);

    // Reverse the list using ListIterator
    ListIterator<Integer> iterator = digits.listIterator(digits.size());
    ArrayList<Integer> reversedDigits = new ArrayList<>();
    while (iterator.hasPrevious()) {
      reversedDigits.add(iterator.previous());
    }
    System.out.println("Reversed digits: " + reversedDigits);
  }
}