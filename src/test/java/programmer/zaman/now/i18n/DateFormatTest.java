package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    @Test
    void testDateFormat() {

        String pattern = "EEEE dd MMMM yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

        String format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatInggris() {

        String pattern = "EEEE dd MMMM yyyy";
        Locale inggris = new Locale("en", "US");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, inggris);

        String format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatJapan() {

        String pattern = "EEEE dd MMMM yyyy";
        Locale jepang = new Locale("ja", "JP");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, jepang);

        String format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatParseIndonesia() {

        String pattern = "EEEE dd MMMM yyyy";
        Locale indonesia = new Locale("id", "ID");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, indonesia);

        try {
            Date date = dateFormat.parse("Senin 15 April 2024");
            System.out.println(date);
        } catch (ParseException exception) {
            System.out.println("Error parse : " + exception.getMessage());
        }
    }

    @Test
    void testDateFormatParseJapan() {

        String pattern = "EEEE dd MMMM yyyy";
        Locale japan = new Locale("ja", "JP");
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern, japan);

        try {
            Date date = dateFormat.parse("月曜日 15 4月 2024");
            System.out.println(date);
        } catch (ParseException exception) {
            System.out.println("Error parse : " + exception.getMessage());
        }
    }
}
