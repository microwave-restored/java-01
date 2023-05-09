package main.utilities;

import java.io.*;

public class Serializer {

    public static void serialize(Object obj, String file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter("journal.txt", true));
            writer.newLine();
            writer.write("Serialization complete");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object deserialize(String file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            BufferedWriter writer = new BufferedWriter(new FileWriter("journal.txt", true));
            writer.newLine();
            writer.write("Deserialization complete");
            writer.close();
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
