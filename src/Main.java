import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("src/story.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String content = Files.readString(Path.of("src/story.txt"), StandardCharsets.UTF_8);
        String[] parts = content.split("[<>]");
        String s = "";

        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equalsIgnoreCase("Verb")) {
                System.out.print("Verb: ");
                parts[i] = scanner.next();
            }
            else if (parts[i].equalsIgnoreCase("Adjective")) {
                System.out.print("Adjective: ");
                parts[i] = scanner.next();
            }
            else if (parts[i].equalsIgnoreCase("Noun")) {
                System.out.print("Noun: ");
                parts[i] = scanner.next();
            }
            else if (parts[i].equalsIgnoreCase("Plural Noun")) {
                System.out.print("Plural Noun: ");
                parts[i] = scanner.next();
            }
            else if (parts[i].equalsIgnoreCase("-ing verb")) {
                System.out.print("-ing Verb: ");
                parts[i] = scanner.next();
            }
        }

        StringBuilder b = new StringBuilder();
        for (String v : parts) {
            b.append(v);
        }
        System.out.println(b.toString());
    }
}