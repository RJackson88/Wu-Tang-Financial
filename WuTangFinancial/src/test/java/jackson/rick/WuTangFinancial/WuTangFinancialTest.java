/*package jackson.rick.WuTangFinancial;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class WuTangFinancialTest {

    WuTangFinancial wtf;

    @Before
    public void setUp() {
        wtf = new WuTangFinancial();
    }

    // Dollar to Euro Test
    @Test
    public void dollarToEuroTest() {
        Double expected = 1.06;
        Double actual = wtf.currencyExchange(1.00,"USD","EUR");
        assertEquals("I expected the currency exchange would be 1.06",
                expected, actual);
    }

    // Convert Euro to Dollar
    @Test
    public void euroToDollarTest() {
        Double expected = 0.94;
        Double actual = wtf.currencyExchange(1.00,"EUR","USD");
        assertEquals("I expected the currency exchange would be 0.94",
                expected, actual);
    }

    // Convert Euro to British Pound
    @Test
    public void euroToBritishPoundTest() {
        Double expected = 1.15;
        Double actual = wtf.currencyExchange(1.00,"EUR","GBP");
        assertEquals("I expected the currency exchange would be 1.15",
                expected, actual);
    }

    // Convert British Pound to Indian Rupee
    @Test
    public void britishPoundToIndianRupeeTest() {
        Double expected = 56.02;
        Double actual = wtf.currencyExchange(1.00,"GBP","INR");
        assertEquals("I expected the currency exchange would be 56.02",
                expected, actual);
    }

    // Convert Rupee to Canadian Dollar
    @Test
    public void rupeeToCanadianDollarTest() {
        Double expected = 0.01;
        Double actual = wtf.currencyExchange(1.00,"INR","CAD");
        assertEquals("I expected the currency exchange would be 0.01",
                expected, actual);
    }

    // Convert Canadian Dollar to Singapore Dollar
    @Test
    public void canadianDollarToSingaporeDollarTest() {
        Double expected = 1.08;
        Double actual = wtf.currencyExchange(1.00,"CAD","SGD");
        assertEquals("I expected the currency exchange would be 1.08",
                expected, actual);
    }

    // Convert Singapore Dollar to Swiss Franc
    @Test
    public void singaporeDollarToSwissFrancTest() {
        Double expected = 0.69;
        Double actual = wtf.currencyExchange(1.00,"SGD","CHF");
        assertEquals("I expected the currency exchange would be 0.69",
                expected, actual);
    }

    // Convert Swiss Franc to Malaysian Ringgit
    @Test
    public void swissFrancToMalaysianRinggitTest() {
        Double expected = 4.43;
        Double actual = wtf.currencyExchange(1.00,"CHF","MYR");
        assertEquals("I expected the currency exchange would be 4.43",
                expected, actual);
    }

    // Convert Malaysian Ringgit to Japanese Yen
    @Test
    public void malaysianRinggitToJapaneseYenTest() {
        Double expected = 25.91;
        Double actual = wtf.currencyExchange(1.00,"MYR","JPY");
        assertEquals("I expected the currency exchange would be 25.91",
                expected, actual);
    }

    // Convert Japanese Yen to Chinese Yuan Renminbi
    @Test
    public void japaneseYenToChineseYuanRenminbiTest() {
        Double expected = 0.00;
        Double actual = wtf.currencyExchange(1.00, "JPY", "CNY");
        assertEquals("I expected the currency exchange would be 0.00",
                expected, actual);
    }
}
*/