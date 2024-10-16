import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class prc27 {
    public static void main(String[] args) {
        // Check if there are any file arguments
        if (args.length == 0) {
            System.out.println("Please specify at least one file.");
            return;
        }

        // Process each file specified in the command line arguments
        for (String fileName : args) {
            int lineCount = countLinesInFile(fileName);
            if (lineCount >= 0) {
                System.out.println(fileName + ": " + lineCount + " lines");
            }
        }
    }

    private static int countLinesInFile(String fileName) {
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file " + fileName + ": " + e.getMessage());
            return -1; // Indicate an error occurred
        }

        return lineCount;
    }
}
