package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    @Test
    void testNumberFormat() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        String format = numberFormat.format(10000000.255);
        System.out.println(format);
    }

    @Test
    void testNumberFormatInggris() {
        Locale inggris = new Locale("en", "US");
        NumberFormat numberFormat = NumberFormat.getInstance(inggris);
        String format = numberFormat.format(10000000.255);
        System.out.println(format);
    }

    @Test
    void testNumberFormatParseInggris() {
        Locale inggris = new Locale("en", "US");
        NumberFormat numberFormat = NumberFormat.getInstance(inggris);

        try {
            Number result = numberFormat.parse("10,000,000.255").doubleValue();
            System.out.println(result);
        } catch (ParseException exception) {
            System.out.println("Error parse : " + exception.getMessage());
        }
    }
}
