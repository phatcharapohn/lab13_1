public class main {
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number >= 10) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        sum += number; // Add the last digit
        return sum;
    }
}
