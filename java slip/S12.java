import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class S12 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java WordLineCounter <file_name>");
            return;
        }

        String fileName = args[0];

        try {
            FileReader file = new FileReader(fileName);
            BufferedReader br = new BufferedReader(file);

            int wordCount = 0;
            int lineCount = 0;

            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            br.close();

            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
