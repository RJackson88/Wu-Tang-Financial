/*package jackson.rick.WuTangFinancial;

import java.util.HashMap;

/**
 * Created by rickjackson on 1/11/17.
 */

/*
public class WuTangFinancial {

    public Double currencyExchange(Double crazyLoot, String from, String to) {
        Double fromRate = exchangeRate(from);
        Double toRate = exchangeRate(to);

        crazyLoot = convertExchangeRate(crazyLoot, fromRate);

        if(fromRate < toRate) {
            crazyLoot *= toRate;
        } else {
            crazyLoot /= toRate;
        }

        return (convertToCurrency(crazyLoot));
    }

    public Double exchangeRate(String code) {
        HashMap exchangeRates = new HashMap();
        exchangeRates.put("USD", new Double(1.00));
        exchangeRates.put("EUR", new Double(0.94));
        exchangeRates.put("GBP", new Double(0.82));
        exchangeRates.put("INR", new Double(68.32));
        exchangeRates.put("AUD", new Double(1.35));
        exchangeRates.put("CAD", new Double(1.32));
        exchangeRates.put("SGD", new Double(1.43));
        exchangeRates.put("CHF", new Double(1.01));
        exchangeRates.put("MYR", new Double(4.47));
        exchangeRates.put("JPY", new Double(115.84));
        exchangeRates.put("CNY", new Double(6.92));

        return (Double) exchangeRates.get(code);
    }

    public Double convertExchangeRate(Double currency, Double rate) {
        if(rate < 1.00) {
            currency *= rate;
        } else {
            currency /= rate;
        }
        return currency;
    }

    public Double convertToCurrency(Double currency) {
        Double total = currency * 100;
        Double remainder = total % 1;
        total = total - remainder;

        if(remainder >= .50) {
            total += 1;
        }

        total /= 100;

        return total;

    }

    public static void main(String[] args) {
        WuTangFinancial wtf = new WuTangFinancial();
        // Dollar to Euro
        System.out.println(wtf.currencyExchange(1.00, "USD", "EUR"));
        // Euro to Dollar
        System.out.println(wtf.currencyExchange(1.00, "EUR", "USD"));
        // Euro to British Pound
        System.out.println(wtf.currencyExchange(1.00, "EUR", "GBP"));
        // British Pound to Indian Rupee
        System.out.println(wtf.currencyExchange(1.00, "GBP", "INR"));
        // Rupee to Canadian Dollar
        System.out.println(wtf.currencyExchange(1.00, "INR", "CAD"));
        // Canadian Dollar to Singapore Dollar
        System.out.println(wtf.currencyExchange(1.00, "CAD", "SGD"));
        // Singapore Dollar to Swiss Franc
        System.out.println(wtf.currencyExchange(1.00, "SGD", "CHF"));
        // Swiss Franc to Malaysian Ringgit
        System.out.println(wtf.currencyExchange(1.00, "CHF", "MYR"));
        // Malaysian Ringgit to Japanese Yen
        System.out.println(wtf.currencyExchange(1.00, "MYR", "JPY"));
        // Japanese Yen to Chinese Yuan Renminbi
        System.out.println(wtf.currencyExchange(1.00, "JPY", "CNY"));
    }
}

    /*

    // Original code

    public HashMap exchangeRates = new HashMap();

    public void setExchangeRates() {
        exchangeRates.put("USD", new Double(1.00));
        exchangeRates.put("EUR", new Double(0.94));
        exchangeRates.put("GBP", new Double(0.82));
        exchangeRates.put("INR", new Double(68.32));
        exchangeRates.put("AUD", new Double(1.35));
        exchangeRates.put("CAD", new Double(1.32));
        exchangeRates.put("SGD", new Double(1.43));
        exchangeRates.put("CHF", new Double(1.01));
        exchangeRates.put("MYR", new Double(4.47));
        exchangeRates.put("JPY", new Double(115.84));
        exchangeRates.put("CNY", new Double(6.92));
    }
    */

    //public Double getExchangeRate(String s) {
    //    return (Double)exchangeRates.get(s);
    //}

    /*
    public Double currencyExchange(Double money, String from, String to) {
        Double fromRate = exchangeRate(from);
        Double toRate = exchangeRate(to);
        return (money * fromRate * toRate);
    }

    public static void main(String[] args) {
        WuTangFinancial wtf = new WuTangFinancial();
    }
}


/* My original code
package jackson.rick.WuTangFinancial;

import java.util.HashMap;
import java.util.Scanner;

public class WuTangFinancial {
    Scanner in = new Scanner(System.in);
    Double crazyLoot = in.nextDouble();
    String from = in.nextLine();
    String to = in.nextLine();
    HashMap exchangeRates = new HashMap();

    public static void setExchangeRates() {
        exchangeRates.put("USD", new Double(1.00));
        exchangeRates.put("EUR", new Double(0.94));
        exchangeRates.put("GBP", new Double(0.82));
        exchangeRates.put("INR", new Double(68.32));
        exchangeRates.put("AUD", new Double(1.35));
        exchangeRates.put("CAD", new Double(1.32));
        exchangeRates.put("SGD", new Double(1.43));
        exchangeRates.put("CHF", new Double(1.01));
        exchangeRates.put("MYR", new Double(4.47));
        exchangeRates.put("JPY", new Double(115.84));
        exchangeRates.put("CNY", new Double(6.92));
    }

    public static Double currencyExchange(Double d, String fromCurrency, String
            toCurrency) {
        return d * (Double)exchangeRates.get(fromCurrency) *
                (Double)exchangeRates.get(toCurrency);
    }

    public static void main(String[] args) {
        Double currency = (Double)currencyExchange(crazyLoot, from, to);
    }
}
*/