public class FinancialForecast {
   
    public static double forecast(double initial, double rate, int years) {
        if (years == 0) return initial; 
        return forecast(initial, rate, years - 1) * (1 + rate);
    }
}
