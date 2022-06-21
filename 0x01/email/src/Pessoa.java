

public class Pessoa {

    public static boolean emailValid(String email) {
        return emailContainsAtSymbol(email) && emailHasAtLeast50Chars(email);
    }

    private static boolean emailContainsAtSymbol(String email) {
        return email.split("@").length == 2;
    }

    private static boolean emailHasAtLeast50Chars(String email) {
        return email.length() <= 50;
    }
}
