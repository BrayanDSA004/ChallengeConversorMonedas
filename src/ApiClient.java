import java.net.http.*;
import java.net.URI;
import java.io.IOException;

public class ApiClient {

    private static final String API_KEY = "7902d1e46bc24e94536f8aab";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";

    public static String getExchangeRates() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}