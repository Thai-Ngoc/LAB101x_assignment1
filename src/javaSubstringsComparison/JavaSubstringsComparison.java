package javaSubstringsComparison;

import java.util.Scanner;

public class JavaSubstringsComparison {

    public static void getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        String substring = "";
        for (int i = 0; i < s.length() - k + 1; i++) {
            substring = s.substring(i, i + k);

            if (smallest.compareTo(substring) >= 0) {
                smallest = substring;
            }

            if (largest.compareTo(substring) < 0) {
                largest = substring;
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        getSmallestAndLargest(s, k);
    }

}
