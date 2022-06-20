

public class Pessoa {

    public static boolean emailValid(String email) {
        return checkIfContainsAtSymbol(email) && checkMaxEmailLength(email);
    }

    private static boolean checkIfContainsAtSymbol(String email) {
        return email.split("@").length == 2;
    }

    private static boolean checkMaxEmailLength(String email) {
        return email.length() <= 50;
    }
}
