

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person;

    @BeforeEach
    public void setup() {
        String name = "Paul";
        String surname = "McCartney";
        Date birthDate = new Date(2000);
        boolean anotherCompanyOwner = true;
        boolean pensioner = true;
        boolean publicServer = true;

        this.person = new Person(name, surname, birthDate,
                anotherCompanyOwner, pensioner, publicServer);
    }

    @Test
    @DisplayName("Deve retornar o nome completo")
    public void show_full_name() {
        assertEquals(person.fullName(), "Paul McCartney");
    }

    @Test
    @DisplayName("Deve retornar o salario anual com base no salario mensal")
    public void test_calculateYearlySalary() {
        person.setSalary(1200);
        assertEquals(person.calculateYearlySalary(), 14400);
    }

    @Test
    @DisplayName("Deve retornar true caso as regras de negocio estejam corretas")
    public void person_is_MEI() {
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);
        assertTrue(person.isMEI());
    }

    @Test
    @DisplayName("Deve retornar false caso pelo menos uma regra de negocio nao passar")
    public void person_is_not_MEI() {
        person.setAnotherCompanyOwner(true);
        assertFalse(person.isMEI());
    }
}
