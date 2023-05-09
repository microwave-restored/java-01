package main;

import main.domain.IDevice;

import java.util.ArrayList;
import java.util.List;
import main.domain.Monitor;
import main.domain.Tv;

import main.utilities.CsvReader;
import main.utilities.Journal;
import main.utilities.Serializer;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Укажите файл данных и сериализованный файл.");
            return;
        }

        String sourceFile = args[0];
        String binFile = args[1];

        List<String[]> strings = CsvReader.readCsvFile(sourceFile, ";");
        List<IDevice> devices = new ArrayList<>();
        for (String[] line: strings) {
            if (line[0].equals("0")) {
                devices.add(new Tv(line));
            } else {
                devices.add(new Monitor(line));
            }
        }

        devices.forEach(System.out::println);
        Journal.log("journal.txt", strings, ";");
        Serializer.serialize(devices, binFile);
        List<IDevice> newDevices = (List<IDevice>) Serializer.deserialize(binFile);
        System.out.println("После десериализации:");
        newDevices.forEach(System.out::println);
    }
}
