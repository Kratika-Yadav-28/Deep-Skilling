
public class FinancialForecast {

    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        // Base case: if 0 years left, return current value
        if (years == 0) {
            return currentValue;
        }
        // Recursion
        return predictFutureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double currentValue = 10000;    // ₹10,000
        double annualGrowthRate = 0.08; // 8% annual growth
        int years = 5;

        double futureValue = predictFutureValue(currentValue, annualGrowthRate, years);
        System.out.printf("Predicted future value after %d years: ₹%.2f%n", years, futureValue);

        System.out.println("\n=== Analysis ===");
        System.out.println("Time Complexity: O(n) — one recursive call per year.");
        System.out.println("Optimization Tip: Use memoization or iterative approach to avoid deep recursion if 'years' is large.");
    }
}
