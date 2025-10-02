package es.uniovi.ds.lab.files;

import java.io.*;

public interface Output {
    void send(char c) throws IOException;

    void close() throws IOException;
}
