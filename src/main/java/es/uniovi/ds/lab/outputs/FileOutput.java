package es.uniovi.ds.lab.outputs;

import java.io.*;

import es.uniovi.ds.lab.files.Output;

public class FileOutput implements Output {

    public FileOutput(String fileName) throws IOException {
        file = new FileWriter(fileName);
    }

    public void send(char c) throws IOException {
        file.append(c);
    }

    public void close() throws IOException {
        file.close();
    }

    private FileWriter file;
}
