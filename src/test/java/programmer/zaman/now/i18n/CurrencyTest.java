package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {

    @Test
    void testCurrencyIndonesia() {
        Locale indonesia = new Locale("id", "ID");
        Currency currency = Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(indonesia));
    }

    @Test
    void testCurrencyUSA() {
        Locale america = new Locale("en", "US");
        Currency currency = Currency.getInstance(america);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(america));
    }

    @Test
    void testNumberFormatCurrencyIndonesia() {
        Locale indonesia = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        String format = numberFormat.format(1000000.592);
        System.out.println(format);
    }

    @Test
    void testNumberFormatCurrencyParseIndonesia() {
        Locale indonesia = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        try {
            double parse = numberFormat.parse("Rp700.000,28").doubleValue();
            System.out.println(parse);
        } catch (ParseException e) {
            System.out.println("Error parse : " + e.getMessage());
        }
    }
}
