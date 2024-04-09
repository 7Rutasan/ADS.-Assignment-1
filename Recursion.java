import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the problem to solve:");
        System.out.println("1. Minimum element in array");
        System.out.println("2. Average of elements in array");
        System.out.println("3. Check if a number is prime");
        System.out.println("4. Factorial of a number");
        System.out.println("5. Nth Fibonacci number");
        System.out.println("6. Power of a number");
        System.out.println("7. Reverse an array");
        System.out.println("8. Check if a string consists of digits only");
        System.out.println("9. Binomial coefficient");
        System.out.println("10. Greatest Common Divisor (GCD)");


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
            case 3:
                // Problem 3: Check if a number is prime
                System.out.print("Enter a number to check if it's prime: ");
                int number3 = scanner.nextInt();
                String result3 = isPrime(number3);
                System.out.println("The number is: " + result3);
                break;
            case 4:
                // Problem 4: Factorial of a number
                System.out.print("Enter a number to find its factorial: ");
                int number4 = scanner.nextInt();
                int factorial = factorial(number4);
                System.out.println("Factorial of " + number4 + " is: " + factorial);
                break;
            case 5:
                // Problem 5: Nth Fibonacci number
                System.out.print("Enter the value of n to find the nth Fibonacci number: ");
                int n = scanner.nextInt();
                int fibonacciNumber = fibonacci(n);
                System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
                break;
            case 6:
                // Problem 6: Power of a number
                System.out.print("Enter the base number: ");
                int base = scanner.nextInt();
                System.out.print("Enter the exponent: ");
                int exponent = scanner.nextInt();
                int result = power(base, exponent);
                System.out.println(base + " raised to the power of " + exponent + " is: " + result);
                break;
            case 7:
                // Problem 7: Reverse an array
                System.out.print("Enter the size of the array: ");
                int size7 = scanner.nextInt();
                int[] array7 = new int[size7];
                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < size7; i++) {
                    array7[i] = scanner.nextInt();
                }
                reverseArray(array7, 0, size7 - 1);
                System.out.println("Reversed array:");
                for (int num : array7) {
                    System.out.print(num + " ");
                }
                System.out.println();
                break;
            case 8:
                // Problem 8: Check if a string consists of digits only
                System.out.print("Enter a string to check if it consists of digits only: ");
                String input8 = scanner.next();
                boolean result8 = isAllDigits(input8);
                if (result8) {
                    System.out.println("The string consists of digits only.");
                } else {
                    System.out.println("The string does not consist of digits only.");
                }
                break;
            case 9:
                // Problem 9: Binomial coefficient
                System.out.print("Enter the value of n: ");
                int n9 = scanner.nextInt();
                System.out.print("Enter the value of k: ");
                int k9 = scanner.nextInt();
                int coefficient = binomialCoefficient(n9, k9);
                System.out.println("Binomial coefficient C(" + n9 + ", " + k9 + ") is: " + coefficient);
                break;
            case 10:
                // Problem 10: Greatest Common Divisor (GCD)
                System.out.print("Enter the first number: ");
                int a10 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int b10 = scanner.nextInt();
                int gcd = gcd(a10, b10);
                System.out.println("Greatest Common Divisor (GCD) of " + a10 + " and " + b10 + " is: " + gcd);
                break;
            default:
                System.out.println("Invalid problem number! Please try again.");
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

    // Problem 3: Checking if a number is prime
    /**
     * This method checks whether a given number is prime recursively.
     * Time complexity: O(sqrt(n)), where n is the given number.
     * The function recursively checks divisibility up to the square root of the number.
     *
     * @param n The number to be checked for primality.
     * @return  "Prime" if the number is prime, "Composite" otherwise.
     */
    public static String isPrime(int n) {
        return isPrimeRecursive(n, 2) ? "Prime" : "Composite";
    }

    /**
     * This method checks whether a given number is prime recursively.
     *
     * @param n     The number to be checked for primality.
     * @param i     The current divisor being checked.
     * @return      True if the number is prime, false otherwise.
     */
    public static boolean isPrimeRecursive(int n, int i) {
        if (n <= 2)
            return (n == 2);
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrimeRecursive(n, i + 1);
    }

    // Problem 4: Finding the factorial of a number
    /**
     * This method calculates the factorial of a given number recursively.
     * Time complexity: O(n), where n is the input number.
     * The function recursively multiplies numbers from 1 to n.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return  The factorial of the given number.
     */
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    // Problem 5: Finding the nth Fibonacci number
    /**
     * This method calculates the nth Fibonacci number recursively.
     * Time complexity: O(2^n), where n is the input number.
     * The function makes two recursive calls for each recursive call until it reaches the base case.
     *
     * @param n The index of the Fibonacci number to be calculated.
     * @return  The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Problem 6: Finding the power of a number
    /**
     * This method calculates the power of a number recursively.
     * Time complexity: O(log n), where n is the exponent.
     * The function recursively divides the exponent by 2 in each step.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return  The result of a raised to the power of n.
     */
    public static int power(int a, int n) {
        if (n == 0)
            return 1;
        if (n % 2 == 0)
            return power(a, n / 2) * power(a, n / 2);
        else
            return a * power(a, n / 2) * power(a, n / 2);
    }

    // Problem 7: Reversing an array
    /**
     * This method reverses an array recursively.
     * Time complexity: O(n), where n is the size of the array.
     * The function recursively swaps elements until the entire array is reversed.
     *
     * @param array The array of integers to be reversed.
     * @param start The starting index of the array.
     * @param end   The ending index of the array.
     */
    public static void reverseArray(int[] array, int start, int end) {
        if (start >= end)
            return;
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverseArray(array, start + 1, end - 1);
    }

    // Problem 8: Checking if a string consists of digits only
    /**
     * This method checks whether a given string consists of digits only recursively.
     * Time complexity: O(n), where n is the length of the string.
     * The function recursively checks each character of the string.
     *
     * @param s The string to be checked.
     * @return  True if the string consists of digits only, false otherwise.
     */
    public static boolean isAllDigits(String s) {
        if (s.isEmpty())
            return false;
        if (!Character.isDigit(s.charAt(0)))
            return false;
        if (s.length() == 1)
            return true;
        return isAllDigits(s.substring(1));
    }

    // Problem 9: Finding the binomial coefficient
    /**
     * This method calculates the binomial coefficient recursively.
     * Time complexity: O(n * k), where n and k are the input numbers.
     * The function recursively calculates each coefficient based on the previous coefficients.
     *
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return  The binomial coefficient C(n, k).
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n)
            return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    // Problem 10: Greatest Common Divisor (GCD) using Euclidean Algorithm
    /**
     * This method calculates the greatest common divisor (GCD) of two numbers
     * using the Euclidean Algorithm recursively.
     * Time complexity: O(log min(a, b)), where a and b are the input numbers.
     * The Euclidean Algorithm reduces the problem size by at least half in each step.
     *
     * @param a The first number.
     * @param b The second number.
     * @return  The greatest common divisor of the two numbers.
     */
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }


}
