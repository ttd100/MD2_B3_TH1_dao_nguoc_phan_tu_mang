import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size, intArray[];
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20 || size <= 0) {
                System.out.println("Size must be between 1 and 20");
            }
        } while (size > 20 || size <= 0);

        intArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + i + ":");
            intArray[i] = scanner.nextInt();
        }

        System.out.println("Reversed array:");

        for (int i = size - 1; i >= 0; i--) {
            System.out.printf("%d\t", intArray[i]);
        }

    }
}