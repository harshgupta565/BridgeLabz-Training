package RuntimeAnalysis;

import java.io.*;

public class FileReadingComparison {

    public static void main(String[] args) throws Exception {

        File file = new File("largefile.txt");

        // FileReader
        FileReader fr = new FileReader(file);
        long startFR = System.nanoTime();

        while (fr.read() != -1) {
            // reading character by character
        }

        long endFR = System.nanoTime();
        fr.close();

        System.out.println("FileReader Time: " +
                (endFR - startFR) / 1_000_000.0 + " ms");


        // InputStreamReader
        InputStreamReader isr =
                new InputStreamReader(new FileInputStream(file));

        long startISR = System.nanoTime();

        while (isr.read() != -1) {
            // reading bytes and converting to characters
        }

        long endISR = System.nanoTime();
        isr.close();

        System.out.println("InputStreamReader Time: " +
                (endISR - startISR) / 1_000_000.0 + " ms");
    }
}

