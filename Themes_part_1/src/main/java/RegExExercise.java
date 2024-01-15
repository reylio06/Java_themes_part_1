/*
Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign
it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:
IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading
zeros are allowed. The length of A, B, C, or D can't be greater than 3.
In this problem you will be provided strings containing any combination of ASCII characters. You have to write a
regular expression to find the valid IPs.
Just write the MyRegex class which contains a String pattern. The string should contain the correct regular expression.
 */

package main.java;

// Solution
class RegExExercise {

    // "\\d{1,2}" : matches one or two digits.
    // "[01]\\d{2}" : matches three digits where the first digit is 0 or 1.
    // "2[0-4]\\d" : matches three digits where the first digit is 2, and the second digit is between 0 and 4.
    // "25[0-5]" : matches three digits where the first two digits are 25, and the third digit is between 0 and 5.
    // "(\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])" : combines the above alternatives using the | (OR) operator.
    // "\\." : matches the dot (.) that separates the components
    // "{3}" : this specifies that the entire group (A.B.C.) should appear exactly three times.
    // "(\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])" : this matches the last component (D) of the IP address
    String pattern = "((\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])";
}
