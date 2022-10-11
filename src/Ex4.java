import java.io.*;
import java.util.Scanner;

public class Ex4 {

    public static void read () throws IOException {
        System.out.println("The word to be replaced is: ");
        Scanner scanner = new Scanner(System.in);
        String toBeReplaced = scanner.nextLine();
        System.out.println("The word to replace with is: ");
        String toReplaceWith = scanner.nextLine();
        scanner.close();
        String oldText = "";

        try ( Scanner sc = new Scanner(new BufferedReader(new FileReader("TextInput.txt")))) {

            while (sc.hasNextLine()) {
                String reader = sc.nextLine();
                oldText += reader + "\n";
            }
        }
        oldText = oldText.replaceAll(toBeReplaced,toReplaceWith);
        String newText = oldText;

        try (BufferedWriter outputFile = new BufferedWriter(new FileWriter("TextOutput.txt"))){
            outputFile.write(newText);
        }
    }

    public static void main(String[] args) throws IOException {
        Ex4.read();
    }
}
