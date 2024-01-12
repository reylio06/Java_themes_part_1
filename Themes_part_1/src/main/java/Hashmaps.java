/*
The first line will have an integer n denoting the number of entries in the phone book. Each entry consists of two
lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in
the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.
1 <= n <= 100 000
1 <= Query <= 100 000
For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and
 phone number. See sample output for the exact format.

To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or
write completely on your own.
 */

package main.java;
import java.util.*;
import java.io.*;

public class Hashmaps {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        // Solution
        // Create Hashmap
        Map<String, Integer> phoneBook = new HashMap<>();
        // End of solution

        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            // Solution
            phoneBook.put(name, phone);
            // End of solution
        }

        // Process queries
        while (in.hasNext()) {
            String query = in.nextLine();

            // Solution
            // Check if the person is in the phone book
            if (phoneBook.containsKey(query)) {
                // Print name and phone number
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                // Print "Not found" if the person is not in the phone book
                System.out.println("Not found");
            }
        }

        in.close();
    }
}

