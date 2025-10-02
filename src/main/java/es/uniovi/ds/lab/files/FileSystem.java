package es.uniovi.ds.lab.files;

import java.io.*;

public class FileSystem {

    public void copyFile(String name, String newName) throws IOException {
        FileWriter writer = new FileWriter(newName);

        try {
            FileReader reader = new FileReader(name);

            int c;
            while ((c = reader.read()) != -1)
                writer.append((char) c);

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void upload(String name, String url) {
        try {
            StringWriter stringWriter = new StringWriter();
            stringWriter.append("\n--- START. Connecting to Internet[" + url + "]\n");

            FileReader reader = new FileReader(name);

            int c;
            while ((c = reader.read()) != -1)
                stringWriter.append((char) c);

            reader.close();

            System.out.print(stringWriter.toString());
            System.out.println("--- END. Closing Internet connection");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendByBluetooth(String name, String device) {
        try {
            StringWriter stringWriter = new StringWriter();
            stringWriter.append("\n--- START. Connecting with Bluetooth[" + device + "]\n");

            FileReader reader = new FileReader(name);

            int c;
            while ((c = reader.read()) != -1)
                stringWriter.append((char) c);

            reader.close();

            System.out.print(stringWriter.toString());
            System.out.println("--- END. Closing Bluetooth connection");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
