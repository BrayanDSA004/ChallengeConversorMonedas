import java.util.Map;

public class Converter {

    public static double convert(String fromCurrency, String toCurrency, double amount, Map<String, Double> rates) {
        double rateFrom = rates.get(fromCurrency);
        double rateTo = rates.get(toCurrency);
        return amount * (rateTo / rateFrom);
    }
}
