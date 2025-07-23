import java.util.Scanner;
public class CurrencyConverter1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");
        System.out.println("Available Currencies:\nUSD\nEUR\nINR\nGBP\nJPY");

        System.out.print("Enter the base currency from which the currency is converted: ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency to which the currency is converted: ");
        String toCurrency = scanner.next().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double convertedAmount = convertCurrency(fromCurrency, toCurrency, amount);

        if (convertedAmount != -1) {
            System.out.printf("Converted amount: %.2f %s\n", convertedAmount, toCurrency);
        } else {
            System.out.println("Invalid currency code entered.");
        }

        scanner.close();
    }

    public static double convertCurrency(String from, String to, double amount) {
        // Exchange rates relative to USD
        double usd, result;

        switch (from) {
            case "USD": usd = amount; break;
            case "EUR": usd = amount / 0.92; break;
            case "INR": usd = amount / 83.15; break;
            case "GBP": usd = amount / 0.80; break;
            case "JPY": usd = amount / 154.35; break;
            default: return -1;
        }

        switch (to) {
            case "USD": result = usd; break;
            case "EUR": result = usd * 0.92; break;
            case "INR": result = usd * 83.15; break;
            case "GBP": result = usd * 0.80; break;
            case "JPY": result = usd * 154.35; break;
            default: return -1;
        }

        return result;
    }
}


