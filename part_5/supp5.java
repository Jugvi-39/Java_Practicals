import java.util.Scanner;

class DuplicateNumberException extends Exception {
    DuplicateNumberException(String message) {
        super(message);
    }
}

public class supp5 {
    public static void checkForDuplicates(int[] numbers) throws DuplicateNumberException {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    throw new DuplicateNumberException("Duplicate number found: " + numbers[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.println("Enter the integers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        try {
            checkForDuplicates(numbers);
            System.out.println("All numbers are unique.");
        } catch (DuplicateNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
