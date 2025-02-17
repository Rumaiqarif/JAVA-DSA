import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the lower bound: ");
        int lower = scanner.nextInt();
        
        System.out.print("Enter the upper bound: ");
        int upper = scanner.nextInt();
        
        System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
    
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
