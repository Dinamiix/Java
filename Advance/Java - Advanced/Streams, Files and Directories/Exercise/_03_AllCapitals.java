package Exercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class _03_AllCapitals {

    public static void main(String[] args) throws IOException {

        String content = Files.readString(Path.of("C:\\Users\\chame\\IdeaProjects\\Java - Advanced\\streams-files-and-directories\\Exercise\\input.txt"));

        content = content.toUpperCase();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\chame\\IdeaProjects\\Java - Advanced\\streams-files-and-directories\\Exercise\\input.txt"));
        bufferedWriter.write(content);
        bufferedWriter.close();
    }
}