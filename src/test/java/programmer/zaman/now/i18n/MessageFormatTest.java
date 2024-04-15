package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

    @Test
    void testMessageFormat() {

        String pattern = "Hi {0}, Anda bisa mencari data anda dengan mengetikkan \"{0}\" di pencarian.";
        MessageFormat messageFormat = new MessageFormat(pattern);

        String format = messageFormat.format(new Object[]{
                "Alvenio"
        });
        System.out.println(format);
    }

    @Test
    void testMEssageFormatResourceBundle() {
        Locale locale = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

        String pattern = resourceBundle.getString("welcome.message");

        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{
                "Alvenio", "Semarang"
        });
        System.out.println(format);
    }

    @Test
    void testMEssageFormatResourceBundleInggris() {
        Locale locale = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

        String pattern = resourceBundle.getString("welcome.message");

        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{
                "Alvenio", "Semarang"
        });
        System.out.println(format);
    }
}
