package main.utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Journal {
    private String fileName;

    public Journal(String fileName) {
        this.fileName = fileName;
    }
    public static void log(String fileName, List<String[]> data, String delimiter) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String[] line : data) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < line.length; i++) {
                    sb.append(line[i]);
                    if (i < line.length - 1) {
                        sb.append(delimiter);
                    }
                }
                writer.write("String added: ");
                writer.write(sb.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



