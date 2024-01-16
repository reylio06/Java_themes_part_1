/*
In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once,
but retain the first occurrence of any case-insensitive repeated word. For example, the words love and to are
repeated in the sentence "I love Love to To tO code". Can you complete the code in the editor so it will turn "I love
Love to To tO code" into "I love to code"?
To solve this challenge, complete the following three lines:

Write a RegEx that will match any repeated word.
Complete the second compile argument so that the compiled RegEx is case-insensitive.
Write the two necessary arguments for replaceAll such that each repeated word is replaced with the very first
instance the word found in the sentence. It must be the exact first occurrence of the word, as the expected output is
 case-sensitive.

The following input is handled for you the given stub code:

The first line contains an integer, n, denoting the number of sentences.
Each of the n subsequent lines contains a single sentence consisting of English alphabetic letters and whitespace
characters.

Stub code in the editor prints the sentence modified by the replaceAll line to stdout. The modified string must be a
modified version of the initial sentence where all repeat occurrences of each word are removed
 */

package main.java;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDuplicateWords {
    public static void main(String[] args) {

        // Solution
        // \b assert position at a word boundary
        // \w matches any word character (equivalent to [a-zA-Z0-9_])
        // + matches the previous token between one and unlimited times, as many times as possible, giving back as needed (greedy)
        // \b assert position at a word boundary
        // s matches any whitespace character (equivalent to [\r\n\t\f\v ])
        // + matches the previous token between one and unlimited times, as many times as possible, giving back as needed (greedy)
        // \1 matches the same text as most recently matched by the 1st capturing group
        // \b assert position at a word boundary
        String regex = "\\b(\\w+)\\b(\\s+\\1)+\\b";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        // End of solution

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            // Solution
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            // End of solution

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}