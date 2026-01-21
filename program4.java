package Day2;
import java.util.Scanner;
import java.util.TreeSet;

public class program4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            TreeSet<Integer> uniqueNumbers = new TreeSet<>();
            
            System.out.println("Enter the numbers:");
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                uniqueNumbers.add(num);
            }
            
            System.out.println("Unique elements in ascending order: " + uniqueNumbers);
        }
    }
}