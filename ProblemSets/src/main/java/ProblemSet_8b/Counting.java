package ProblemSet_8b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Counting {

    public Counting() {
    }

    public String readTextFile(String filePath) {
        int linesRead = 0;
        StringBuilder result = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                linesRead++;
                result.append(displayLine(line, linesRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    public String displayLine(String line, int lineNumber) {
        return line + " : " + lineNumber + "\n";
    }
}
