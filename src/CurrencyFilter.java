import java.util.Map;

public class CurrencyFilter {

    public static void printSelectedRates(Map<String, Double> rates) {
        String[] selected = {"ARS", "BRL", "CLP", "COP", "USD"};
        for (String currency : selected) {
            System.out.println(currency + ": " + rates.get(currency));
        }
    }
}