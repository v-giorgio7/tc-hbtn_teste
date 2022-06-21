

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteEmail {

    @Test
    @DisplayName("E-mail com @ e tamanho menor que 50 chars deve funcionar")
    public void testar_email_com_arroba() {
        assertTrue(Pessoa.emailValid("email_teste@dominio.com.br"));
    }

    @Test
    @DisplayName("Email sem @ nao deve funcionar")
    public void testar_email_sem_arroba() {
        assertFalse(Pessoa.emailValid("email_testedominio.com.br"));
    }

    @Test
    @DisplayName("Email com mais de 50 chars nao deve funcionar")
    public void testar_email_mais_50_caracteres() {
        assertEquals(
                Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"),
                false);
    }
}
