package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ChoiceFormatTest {

    @Test
    void testChoiceFormat() {
        String pattern = "-1#negatif | 0#kosong | 1#satu | 1<banyak";
        ChoiceFormat choiceFormat = new ChoiceFormat(pattern);

        System.out.println(choiceFormat.format(-2));
        System.out.println(choiceFormat.format(-1));
        System.out.println(choiceFormat.format(0));
        System.out.println(choiceFormat.format(1));
        System.out.println(choiceFormat.format(2));
        System.out.println(choiceFormat.format(3));
    }

    @Test
    void testChoiceFormatInMessageFormat() {
        Locale locale = new Locale("in", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

        String pattern = resourceBundle.getString("balance");

        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        System.out.println(messageFormat.format(new Object[]{-1000000}));
        System.out.println(messageFormat.format(new Object[]{0}));
        System.out.println(messageFormat.format(new Object[]{1000000}));
    }

    @Test
    void testChoiceFormatInMessageFormatAmerica() {
        Locale locale = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

        String pattern = resourceBundle.getString("balance");

        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        System.out.println(messageFormat.format(new Object[]{-1000000}));
        System.out.println(messageFormat.format(new Object[]{0}));
        System.out.println(messageFormat.format(new Object[]{1000000}));
    }
}
