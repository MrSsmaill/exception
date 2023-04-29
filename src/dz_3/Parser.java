package dz_3;

import java.text.ParseException;
import java.util.Date;

public class Parser {
    public static String[] parse(String[] arrData) throws ParseException {
        String[] result = new String[6];
        for (int i = 0; i < arrData.length; i++) {
            if (Checks.isDate(arrData[i])) {
                result[3] = arrData[i];
                arrData[i] = null;
            }
            if (Checks.isDigit(arrData[i])) {
                result[4] = arrData[i];
                arrData[i] = null;
            }
            if (Checks.isSymbol(arrData[i])) {
                result[5] = arrData[i];
                arrData[i] = null;
            }
        }
        int count = 0;
        for (String arrDatum : arrData) {
            if ((arrDatum != null && count < 3) & !Checks.isChar(arrDatum)) {
                result[count] = arrDatum;
                count += 1;
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] == null) {
                result[i] = InputData.inputData(i);
            }
        }
        return result;
    }
}
