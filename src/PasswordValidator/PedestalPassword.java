package PasswordValidator;

import java.util.Scanner;

import static PasswordValidator.PasswordValidator.*;

public class PedestalPassword {
    public static void main(String[] args) {
        String password;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter password for validation:");
            password = scanner.nextLine();
            PasswordValidator validate = checkPassword(password);
            System.out.println(validate);
        }
    }
}
