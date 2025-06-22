public class Main {
    public static void main(String[] args) {
        double currentValue = 10000; // Initial amount
        double growthRate = 8;       // Annual growth rate in percentage
        int years = 5;               // Number of years to forecast

        double forecast = FinancialForecast.forecastValue(currentValue, growthRate, years);
        System.out.printf("Future Value after %d years (Recursive): $%.2f%n", years, forecast);

        double forecastIter = FinancialForecast.forecastValueIterative(currentValue, growthRate, years);
        System.out.printf("Future Value after %d years (Iterative): $%.2f%n", years, forecastIter);
    }
}
