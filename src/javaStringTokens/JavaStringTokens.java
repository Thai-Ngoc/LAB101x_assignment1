package javaStringTokens;

import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] arrOfStr = s.split("[ !,?._'@]+");
        System.out.println(arrOfStr.length);
        for (String a : arrOfStr) {

            System.out.println(a);
        }
        scan.close();

    }

}
