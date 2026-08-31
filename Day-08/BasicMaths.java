public class BasicMaths {

    // Print Digits Of A Number
    static void printDigitOfNumber(int num) {
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }

    // Count The Number Of Digits
    static int countDigitOfNumber(int num) {
        int count = 0;

        while (num != 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    // Sum Of Digits Of A Number
    static int sumOfDigitOfNumber(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }

        return sum;
    }

    // Reverse Of A Number
    static int reverseOfNumber(int num) {
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return reverse;
    }

    // Check Palindrome Number
    static boolean palindrome(int num) {
        int originalNum = num;
        int reverseNum = reverseOfNumber(num);

        return originalNum == reverseNum;
    }

    // Check Prime Number
    static boolean primeNumber(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // GCD Of Two Numbers
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // LCM Of Two Numbers
    static int lcmOfNumber(int a, int b) {
        int gcd = gcd(a, b);

        int lcm = (a * b) / gcd;

        return lcm;
    }

    // Armstrong Number
    // Sum Of The Cube Of All The Digits
    static boolean armstrong(int a) {
        int original = a;
        int armstrong = 0;

        while (a != 0) {
            int digit = a % 10;
            armstrong += digit * digit * digit;
            a = a / 10;
        }

        if (armstrong == original) {
            return true;
        }

        return false;
    }

    // Perfect Number
    static boolean perfectNumber(int a) {
        int sum = 1;

        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                int firstFactor = i;
                int secondFactor = a / i;

                sum = sum + firstFactor + secondFactor;
            }
        }

        if (sum == a) {
            return true;
        }

        return false;
    }

    // Print All Prime Numbers
    static void printPrimeNumber(int n) {

        // Print all prime numbers from 1 to n
        for (int i = 2; i <= n; i++) {
            boolean isPrime = primeNumber(i);

            if (isPrime == true) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        // Print Digits Of A Number
        int num = 6778;
        printDigitOfNumber(num);

        // Count Digits
        System.out.println("Number of digits: " + countDigitOfNumber(num));

        // Sum Of Digits
        System.out.println("Sum of digits: " + sumOfDigitOfNumber(num));

        // Reverse Number
        System.out.println("Reverse: " + reverseOfNumber(num));

        // Palindrome
        System.out.println("Palindrome: " + palindrome(num));

        // Prime Number
        System.out.println("Prime: " + primeNumber(num));

        // GCD
        System.out.println("GCD: " + gcd(12, 18));

        // LCM
        System.out.println("LCM: " + lcmOfNumber(12, 18));

        // Armstrong
        System.out.println("Armstrong: " + armstrong(378));

        // Perfect Number
        System.out.println("Perfect Number: " + perfectNumber(6));

        // Print Prime Numbers
        printPrimeNumber(100);
    }
}
