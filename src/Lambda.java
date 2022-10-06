import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Write your code here
    public PerformOperation isOdd() {
        PerformOperation op = i -> i % 2 == 0 ? true : false;
        return op;
    }

    public PerformOperation isPrime() {
        PerformOperation op = i -> (!(i % 2 == 0) && (i % i == 0)) ? true : false;
        return op;
    }

    public PerformOperation isPalindrome() {
        int tmp = 0;
        PerformOperation op = null;
        return op;
    }

}

public class Lambda {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben Sie ein Zahl außer 00, wenn Sie spilen möchten: ");
        int ch = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (ch != 00) {
            System.out.println("1_ Gerade oder ungerade: ");
            System.out.println("2_ Primzahl prüfen: ");
            System.out.println("3_ Wählen Sie 1 oder 2: ");
            String s = br.readLine().trim();
            ch = Integer.parseInt(s);
            int num;
            switch (ch) {
                case 1:
                    System.out.println("Geben Sie die Zahl ein? ");
                    s = br.readLine().trim();
                    num = Integer.parseInt(s);
                    op = ob.isOdd();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                    System.out.println(ans);
                    break;
                case 2:
                    System.out.println("Geben Sie die Zahl ein? ");
                    s = br.readLine().trim();
                    num = Integer.parseInt(s);
                    op = ob.isPrime();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                    System.out.println(ans);
                    break;
            }
        }
    }

}

