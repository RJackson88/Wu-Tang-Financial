package jackson.rick.WuTangFinancial;

import java.util.HashMap;

/**
 * Created by rickjackson on 1/14/17.
 */
public class ExchangeRate {

    public Double get(String code) {
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

        return (Double)exchangeRates.get(code);
    }
}
