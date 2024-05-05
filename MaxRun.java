import java.util.Scanner;

/**
 * This program prints the max run of any string.
 *
 * @author Emmanuel.FN
 * @version 1.0
 * @since 2024-05-05
*/

public class MaxRun {
    /**
     * Function to find the longest consecutive run of 
     * identical characters in a given string.
     *
     * @param userWord The string to examine.
     * @return The length of the longest run.
     */
    public static int maxRunFunction(String userWord) {
        int maxRun = 1; // Initialize maximum run
        int currentRun = 1; // Initialize current run count

        // Loop through the string to find consecutive runs
        for (int counter = 0; counter < userWord.length() - 1; counter++) {
            if (userWord.charAt(counter) == userWord.charAt(counter + 1)) {
                currentRun++; // Increment the current run if the characters are the same
            } else {
                if (currentRun > maxRun) {
                    maxRun = currentRun; // Update the maximum run if the current run is longer
                }
                currentRun = 1; // Reset the current run count
            }
        }

        // Check the final run to ensure it is included in the maximum
        if (currentRun > maxRun) {
            maxRun = currentRun;
        }

        return maxRun;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String userString = scanner.nextLine();

        // Calculate the maximum run of identical characters
        int maxRunValue = maxRunFunction(userString);

        // Output the result
        System.out.println("The max run is " + maxRunValue);

        System.out.println("\nDone.");
    }
}
