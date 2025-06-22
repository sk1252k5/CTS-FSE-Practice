public class FinancialForecast {

    // Recursive method to forecast future value
    public static double forecastValue(double currentValue, double growthRate, int years) {
        if (years == 0)
            return currentValue;
        return forecastValue(currentValue * (1 + growthRate / 100), growthRate, years - 1);
    }

    // Optional: Iterative version
    public static double forecastValueIterative(double currentValue, double growthRate, int years) {
        for (int i = 0; i < years; i++) {
            currentValue *= (1 + growthRate / 100);
        }
        return currentValue;
    }
}
