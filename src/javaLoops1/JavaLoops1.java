package javaLoops1;

import java.util.*;

public class JavaLoops1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        int x;
        for (int i = 1; i <= 10; i++) {
            x = N * i;
            System.out.println(N + " x " + i + " = " + x);
        }

    }

}
