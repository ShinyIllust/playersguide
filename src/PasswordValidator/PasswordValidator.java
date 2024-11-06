package PasswordValidator;

public class PasswordValidator {
    String password;
    static boolean valid = false;
    static boolean hasUpperCase = false;
    static boolean hasLowerCase = false;
    static boolean hasNumber = false;
    static boolean hasInvalid = false;
    static boolean hasLength = false;
    static String isT;

    PasswordValidator(String password, boolean valid){
        this.password = password;
        PasswordValidator.valid = valid;
    }

    public static PasswordValidator checkPassword(String password){
        hasLength = password.length() >= 6 && password.length() <= 13;
        for (char ch: password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                isT = String.valueOf(ch);
                if (isT.equals("T")) {
                    hasInvalid = true;
                }
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if (String.valueOf(ch).equals("&")) {
                hasInvalid = true;
            }
        }

        if (hasLength && hasUpperCase && hasLowerCase && hasNumber && !hasInvalid){
            valid = true;
        }
        PasswordValidator newValidation;
        newValidation = new PasswordValidator(password, valid);
        return newValidation;
    }

    public String toString() {
        String passwordFlavor;

        if(valid){
            passwordFlavor = "VALID!";
        } else {
            passwordFlavor = "INVALID";
            if(!hasLength){
                passwordFlavor = passwordFlavor + ", INVALID LENGTH (" + password.length() + ")";
            }
            if(!hasUpperCase){
                passwordFlavor = passwordFlavor + ", NO UPPERCASE";
            }
            if(!hasLowerCase){
                passwordFlavor = passwordFlavor + ", NO LOWERCASE";
            }
            if(!hasNumber){
                passwordFlavor = passwordFlavor + ", NO NUMBER";
            }
            if(hasInvalid){
                passwordFlavor = passwordFlavor + ", CONTAINS INVALID CHARACTER";
            }
            passwordFlavor = passwordFlavor + "!";
        }
        return "Password " + password + " is : " + passwordFlavor;
    }
}
