import java.util.Scanner;
public class currencyconverter {


    // Exchange rates as per 1 USD (for demo purposes)
    static double USD_to_EUR = 0.93;
    static double USD_to_INR = 83.14;
    static double USD_to_GBP = 0.80;
    static double USD_to_JPY = 153.11;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Currency Converter ======");

        String[] currencies = {"USD", "EUR", "INR", "GBP", "JPY"};

        // Show options
        System.out.println("Available Currencies:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencies[i]);
        }

        // Get source currency
        System.out.print("Enter the number from which the currency is converted: ");
        int fromChoice = sc.nextInt();
        System.out.print("Enter the number to which the currency is converted: ");
        int toChoice = sc.nextInt();

        if (fromChoice < 1 || fromChoice > 5 || toChoice < 1 || toChoice > 5) {
            System.out.println("Invalid currency choice.");
            return;
        }

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        String fromCurrency = currencies[fromChoice - 1];
        String toCurrency = currencies[toChoice - 1];

        double convertedAmount = convert(fromCurrency, toCurrency, amount);
        System.out.printf("%.2f %s = %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);
    }

    static double convert(String from, String to, double amount) {
        double usdAmount;

        // Convert from source to USD
        switch (from) {
            case "USD": usdAmount = amount; break;
            case "EUR": usdAmount = amount / USD_to_EUR; break;
            case "INR": usdAmount = amount / USD_to_INR; break;
            case "GBP": usdAmount = amount / USD_to_GBP; break;
            case "JPY": usdAmount = amount / USD_to_JPY; break;
            default: return 0;
        }

        // Convert from USD to target
        switch (to) {
            case "USD": return usdAmount;
            case "EUR": return usdAmount * USD_to_EUR;
            case "INR": return usdAmount * USD_to_INR;
            case "GBP": return usdAmount * USD_to_GBP;
            case "JPY": return usdAmount * USD_to_JPY;
            default: return 0;
        }
    }
}


