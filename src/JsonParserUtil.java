import com.google.gson.*;

import java.util.Map;

public class JsonParserUtil {

    public static Map<String, Double> parseRates(String jsonResponse) {
        JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
        JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");

        // Map de tasas de conversión
        return new Gson().fromJson(rates, Map.class);
    }
}