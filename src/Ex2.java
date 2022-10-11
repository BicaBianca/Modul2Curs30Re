

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws IOException {

        int read1;
        int read2;

        try (Scanner scanner1 = new Scanner(new FileReader("Numbers1.txt"));
             Scanner scanner2 = new Scanner(new FileReader("Numbers2.txt"));
             FileWriter outputFile = new FileWriter("NumbersMerge.txt")) {

            read1 = scanner1.nextInt();
            read2 = scanner2.nextInt();

            while (scanner1.hasNextInt() || scanner2.hasNextInt()) {
                if (read1 < read2) {
                    outputFile.write(read1 + " ");
                    if (scanner1.hasNextInt()) {
                        read1 = scanner1.nextInt();

                    } else {
                        outputFile.write(read2 + " ");
                        while (scanner2.hasNextInt()) {
                            read2 = scanner2.nextInt();
                            outputFile.write(read2 + " ");
                        }
                    }
                } else {
                    outputFile.write(read2 + " ");
                    if (scanner2.hasNextInt()) {
                        read2 = scanner2.nextInt();
                    } else {
                        outputFile.write(read1 + " ");
                        while (scanner1.hasNextInt()) {
                            read1 = scanner1.nextInt();
                            outputFile.write(read1 + " ");

                        }
                    }

                }
            }
            if (read1 < read2) {
                outputFile.write(read1 + " ");
                outputFile.write(read2 + " ");
            } else {
                outputFile.write(read2 + " ");
                outputFile.write(read1 + " ");
            }
        }
    }
}

