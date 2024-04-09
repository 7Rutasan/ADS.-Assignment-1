import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the problem to solve:");
        System.out.println("1. Minimum element in array");
        System.out.println("2. Average of elements in array");


        System.out.print("Enter the number of the problem to solve: ");
        int problemNumber = scanner.nextInt();

        switch (problemNumber) {
            case 1:
                System.out.print("Enter the size of the array: ");
                int size1 = scanner.nextInt();
                int[] array1 = new int[size1];
                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < size1; i++) {
                    array1[i] = scanner.nextInt();
                }
                int min = findMin(array1, size1);
                System.out.println("Minimum element in the array: " + min);
                break;
            case 2:
                // Problem 2: Average of elements in array
                System.out.print("Enter the size of the array: ");
                int size2 = scanner.nextInt();
                int[] array2 = new int[size2];
                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < size2; i++) {
                    array2[i] = scanner.nextInt();
                }
                double average = findAverage(array2, size2);
                System.out.println("Average of elements in the array: " + average);
                break;
        }
    }

    // Problem 1: Minimum element in array
    /**
     * This method finds the minimum element in an array recursively.
     * Time complexity: O(n), where n is the size of the array.
     *
     * @param array The array of integers.
     * @param n     The size of the array.
     * @return      The minimum element in the array.
     */
    public static int findMin(int[] array, int n) {
        if (n == 1)
            return array[0];
        return Math.min(array[n - 1], findMin(array, n - 1));
    }

    // Problem 2: Average of elements in array
    /**
     * This method calculates the average of elements in an array recursively.
     * Time complexity: O(n), where n is the size of the array.
     * The function recursively traverses the array to calculate the sum of elements.
     *
     * @param array The array of integers.
     * @param n     The size of the array.
     * @return      The average of elements in the array.
     */
    public static double findAverage(int[] array, int n) {
        return findSum(array, n) / (double) n;
    }

    /**
     * This method calculates the sum of elements in an array recursively.
     *
     * @param array The array of integers.
     * @param n     The size of the array.
     * @return      The sum of elements in the array.
     */
    public static int findSum(int[] array, int n) {
        if (n == 1)
            return array[0];
        return array[n - 1] + findSum(array, n - 1);
    }


}
