package Assignments2;

import java.util.Scanner;

public class Code {
    public static void main(String[] args){
        String message;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter message:");
        message = scanner.nextLine().toLowerCase();

        for(Character ch : message.toCharArray()){
            int code = ch.hashCode();
            if (code >= 97 && code < 123) {
                if (code >= 120) {
                    code = code - 23;
                } else {
                    code = code + 3;
                }
                ch = (char) code;
            }
            System.out.print(ch);
        }
    }
}