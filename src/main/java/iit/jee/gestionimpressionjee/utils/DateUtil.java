package iit.jee.gestionimpressionjee.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static String formaterDate(Date date) {
        return DATE_FORMAT.format(date);
    }
}
