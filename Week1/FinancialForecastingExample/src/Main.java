public class Main {
    public static void main(String[] args) {
        double initialInvestment = 20000;  
        double growthRate = 0.08;          // 8% growth
        int years = 5;

        double futureValue = FinancialForecast.forecast(initialInvestment, growthRate, years);
        System.out.printf("Predicted value after %d years: ₹%.2f\n", years, futureValue);
    }
}
