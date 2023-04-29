package dz_3;

import java.io.IOException;
import java.text.ParseException;


public class dz_3 {
    public static void main(String[] args) throws ParseException, IOException {
        String[] arrData = InputData.input();
        arrData = Parser.parse(arrData);
        WriteData.write(arrData);
    }
}
