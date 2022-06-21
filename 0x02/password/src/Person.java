
public class Person {

    public boolean checkUser(String user) {
        return user.matches("^[a-zA-Z0-9]{8,}$");
    }

    public boolean checkPassword(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*\\W).{8,}$");
    }
}
