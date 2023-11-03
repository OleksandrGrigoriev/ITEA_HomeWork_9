package org.hw9task1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathToSourceFile = "src/main/java/org/hw9task1/input.txt";
        String pathToDestinationFile = "src/main/java/org/hw9task1/output.txt";

        String[] pattern = {"on", "at", "in", "to", "with", "from", "by", "under"};

        File sourceFile = new File(pathToSourceFile);
        File destinationFile = new File(pathToDestinationFile);

        StringBuilder stringBuilder = new StringBuilder();

        try(FileInputStream fileInputStream = new FileInputStream(sourceFile)) {
            int i = fileInputStream.read();
            while (i != -1) {
                stringBuilder.append((char) i);
                i = fileInputStream.read();
            }
        } catch (FileNotFoundException exception) {
            throw new FileNotFoundException("Source file not found!");
        }

        String string = stringBuilder.toString().toLowerCase();

        for (int indexOfPattern = 0; indexOfPattern < pattern.length; indexOfPattern++) {
            String newString = string.replaceAll(pattern[indexOfPattern], "java");
            string = newString;
        }

        try (FileWriter fileWriter = new FileWriter(pathToDestinationFile)) {
            fileWriter.write(string);
        } catch (FileNotFoundException exception) {
            throw new FileNotFoundException("Source file not found!");
        }

    }
}
