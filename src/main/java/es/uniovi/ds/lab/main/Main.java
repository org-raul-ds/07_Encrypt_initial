package es.uniovi.ds.lab.main;

/**
 * # IMPORTANT: The code provided for this exercise is the minimum necessary to understand
 * the task and should NEVER be taken as an example of proper use of exceptions,
 * assertions, and tests. All of the above, which should be done in a real program, has been
 * intentionally omitted to simplify the exercise.
 */

import java.io.IOException;

import es.uniovi.ds.lab.files.FileSystem;
import es.uniovi.ds.lab.outputs.*;

public class Main {

    public static void main(String[] args) throws IOException {

        FileSystem fileSystem = new FileSystem();

        fileSystem.copy("private.txt", new FileOutput("copy.txt"));
        fileSystem.copy("private.txt", new InternetOutput("1.1.1.1"));
        fileSystem.copy("private.txt", new BluetoothOutput("iPhone"));
    }
}
