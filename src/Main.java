import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String jsonResponse = ApiClient.getExchangeRates();
        Map<String, Double> rates = JsonParserUtil.parseRates(jsonResponse);

        while (true) {
            System.out.println("==== Bienvenido/a al Conversor de Monedas ====");
            System.out.println("1. ARS (Peso argentino)");
            System.out.println("2. BRL (Real brasileño)");
            System.out.println("3. CLP (Peso chileno)");
            System.out.println("4. COP (Peso colombiano)");
            System.out.println("5. USD (Dólar estadounidense)");
            System.out.println("6. Salir");
            System.out.print("Seleccione moneda origen (1-5): ");
            int origen = scanner.nextInt();
            if (origen == 6) break;

            System.out.print("Seleccione moneda destino (1-5): ");
            int destino = scanner.nextInt();
            System.out.print("Ingrese cantidad: ");
            double cantidad = scanner.nextDouble();

            String[] opciones = {"ARS", "BRL", "CLP", "COP", "USD"};
            double resultado = Converter.convert(opciones[origen - 1], opciones[destino - 1], cantidad, rates);

            System.out.println("Resultado: " + resultado + " " + opciones[destino - 1]);
        }

        scanner.close();
    }
}