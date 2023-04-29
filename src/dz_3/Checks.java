package dz_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Checks {
    public static boolean isDate(String s) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = format.parse(s);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isSymbol(String s) {
        try {
            if (s.length() == 1) {
                return s.equals("f") || s.equals("m");
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public static boolean isChar(String s) {
        try {
            if (s.length() == 1) {
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
