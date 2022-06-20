

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        System.out.println("Teste de email válido");
        boolean isValidEmail = TesteEmail.testar_email_com_arroba();
        System.out.println(isValidEmail);

        System.out.println("Teste de email sem arroba");
        isValidEmail = TesteEmail.testar_email_sem_arroba();
        System.out.println(isValidEmail);

        System.out.println("Teste de email com mais de 50 caracteres");
        isValidEmail = TesteEmail.testar_email_mais_50_caracteres();
        System.out.print(isValidEmail);
    }
}
