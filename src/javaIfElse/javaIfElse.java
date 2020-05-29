package javaIfElse;

import java.util.*;

public class javaIfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 == 1 && 1 <= N && N <= 100) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && 2 <= N && N <= 5) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && 6 <= N && N <= 20) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && 20 <= N && N <= 100) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }

}
