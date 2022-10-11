import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Ex3 {
    public static void read() throws IOException {
        System.out.println("First word is: ");
        Scanner sc = new Scanner(System.in);
        String nextLine = sc.nextLine();

        String shortestWord = nextLine;
        String longestWord = nextLine;
        String firstLetter = nextLine;
        String lastLetter = nextLine;
        int counter = 1;
        while (!nextLine.equals("exit")) {
            System.out.println("Next word is: ");
            nextLine = sc.nextLine();
            counter++;
            if (shortestWord.length() > nextLine.length()) {
                shortestWord = nextLine;
            }
            if (longestWord.length() < nextLine.length()) {
                longestWord = nextLine;
            }
            if (firstLetter.compareTo(nextLine) > 0 && !nextLine.equals("exit")) {
                firstLetter = nextLine;
            }
            if (lastLetter.compareTo(nextLine) < 0 && !nextLine.equals("exit")) {
                lastLetter = nextLine;
            }
        }
        sc.close();

        try (FileWriter outputFile = new FileWriter("Result.txt")) {
            outputFile.write("The shortest word is: " + shortestWord + "\n");
            outputFile.write("The longest word is: " + longestWord + "\n");
            outputFile.write("The first word in alphabetical order is: " + firstLetter + "\n");
            outputFile.write("The last word in alphabetical order is: " + lastLetter + "\n");
            outputFile.write("Total numbers of words is: " + (counter -1));
        }
    }

    public static void main(String[] args) throws IOException{
        Ex3.read();
    }
}
