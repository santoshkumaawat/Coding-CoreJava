package StringTask;

import java.util.Scanner;

public class StringTask {

    public static String trimString(String s) {
        char ch1[] = s.toCharArray();
        for (char ch2 : ch1) {
           

        }

        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Filename with file extension.");
        String s1 = sc.nextLine();
        trimString(s1);

    }
}
