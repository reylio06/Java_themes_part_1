package main.java;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Reader {
    private static final String CSV_FILE_PATH = "src/main/resources/strings.csv";
    private static List<String> stringList;

    public static void main(String[] args) {
        try {
            loadStringList();
            displayMenu();
        } catch (IOException e) {
            System.err.println("Error loading the CSV file: " + e.getMessage());
        }
    }

    private static void loadStringList() throws IOException {
        Path path = Paths.get(CSV_FILE_PATH);
        stringList = Files.lines(path)
                .flatMap(line -> Arrays.stream(line.split(",")))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    private static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Get number of strings");
            System.out.println("2. Get all strings");
            System.out.println("3. Get the string with max length");
            System.out.println("4. Get the string with min length");
            System.out.println("5. Get the strings that are anagrams");
            System.out.println("6. Get the strings with at least 3 vowels");
            System.out.println("7. Get all strings and replace vowels with uppercase");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    getNumberOfStrings();
                    break;
                case 2:
                    getAllStrings();
                    break;
                case 3:
                    getStringWithMaxLength();
                    break;
                case 4:
                    getStringWithMinLength();
                    break;
                case 5:
                    getAnagrams();
                    break;
                case 6:
                    getStringsWithAtLeast3Vowels();
                    break;
                case 7:
                    replaceVowelsWithUppercase();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void getNumberOfStrings() {
        long count = stringList.stream().count();
        System.out.println("Number of strings: " + count);
    }

    private static void getAllStrings() {
        System.out.println("All strings: " + stringList);
    }

    private static void getStringWithMaxLength() {
        Optional<String> maxLengthString = stringList.stream()
                .max(Comparator.comparingInt(String::length));
        maxLengthString.ifPresent(s -> System.out.println("String with max length: " + s));
    }

    private static void getStringWithMinLength() {
        Optional<String> minLengthString = stringList.stream()
                .min(Comparator.comparingInt(String::length));
        minLengthString.ifPresent(s -> System.out.println("String with min length: " + s));
    }

    private static void getAnagrams() {
        Map<String, List<String>> anagramGroups = stringList.stream()
                .collect(Collectors.groupingBy(
                        str -> str.chars().sorted()
                                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                                .toString()
                ));

        List<List<String>> anagrams = anagramGroups.values().stream()
                .filter(group -> group.size() > 1)
                .collect(Collectors.toList());

        System.out.println("Anagrams: " + anagrams);
    }

    private static void getStringsWithAtLeast3Vowels() {
        List<String> result = stringList.stream()
                .filter(str -> str.replaceAll("[aeiouAEIOU]", "").length() <= str.length() - 3)
                .collect(Collectors.toList());

        System.out.println("Strings with at least 3 vowels: " + result);
    }

    private static void replaceVowelsWithUppercase() {
        List<String> modifiedStrings = stringList.stream()
                .map(str -> str.replaceAll("[aeiouAEIOU]", ""))
                .map(String::toUpperCase)
                .collect(Collectors.toList());


        System.out.println("Strings with vowels replaced with uppercase: " + modifiedStrings);
    }
}