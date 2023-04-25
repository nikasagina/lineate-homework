import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your principal amount (1k - 1M): ");
        double p = sc.nextDouble();

        while(p < 1000 || p > 1_000_000){
            System.out.print("Please enter valid number: ");
            p = sc.nextDouble();
        }

        System.out.print("Enter the yearly rate (0 - 100): ");
        double R = sc.nextDouble();

        while(R < 0 || R > 100){
            System.out.print("Please enter valid number: ");
            R = sc.nextDouble();
        }

        System.out.print("Enter number of years (0 - 100): ");
        int N = sc.nextInt();

        while(N < 0 || N > 100){
            System.out.print("Please enter valid number: ");
            N = sc.nextInt();
        }

        double r = R / 1200;
        double n = 12 * N;

        double monthlyPayment = calculateMonthlyPayment(p, r, n);

        System.out.println("Monthly payment: " + monthlyPayment);

    }

    private static double calculateMonthlyPayment(double p, double r, double n) {
        double numerator = p * r * Math.pow(1 + r, n);
        double denominator = Math.pow(1 + r, n) - 1;
        return numerator / denominator;
    }
}