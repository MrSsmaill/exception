package dz_3;

import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void write(String[] arrData) throws IOException {
        try (FileWriter writer = new FileWriter(arrData[0], true)) {
            for (String arrDatum : arrData) {
                writer.append("<").append(arrDatum).append(">");
            }
            writer.append("\n");
        }
    }
}
