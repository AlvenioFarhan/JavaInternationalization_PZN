package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {

    @Test
    void testMessageFomatType() {
        Locale locale = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

        String pattern = resourceBundle.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        String format = messageFormat.format(new Object[]{
                "Alvenio", new Date(), 1000000
        });
        System.out.println(format);
    }

    @Test
    void testMessageFomatTypeAmerica() {
        Locale locale = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

        String pattern = resourceBundle.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        String format = messageFormat.format(new Object[]{
                "Alvenio", new Date(), 1000000
        });
        System.out.println(format);
    }
}
