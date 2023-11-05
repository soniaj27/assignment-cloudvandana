import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        // Initialize BufferedReader to read input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            // Read the Roman numeral from input
            String roman = br.readLine().trim();

            Solution ob = new Solution();

            // Call the romanNumeralToDecimal method and print the result
            System.out.println(ob.romanNumeralToDecimal(roman));
        }
    }
}

class Solution {
    // Function to convert a Roman numeral to decimal
    public int romanNumeralToDecimal(String str) {
        int res = 0;

        // Loop through each character in the Roman numeral string
        for(int i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));

            if(i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));

                // Compare the values of the current and next Roman numerals
                if(s1 >= s2)
                    res = res + s1;
                else {
                    res = res + s2 - s1;
                    i++;
                }
            }
            else
                res += s1;
        }
        return res;
    }

    public int value(char r) {
        if(r == 'I')
            return 1;
        if(r == 'V')
            return 5;
        if(r == 'X')
            return 10;
        if(r == 'L')
            return 50;
        if(r == 'C')
            return 100;
        if(r == 'D')
            return 500;
        if(r == 'M')
            return 1000;

        // Return -1 for invalid input
        return -1;
    }
}
