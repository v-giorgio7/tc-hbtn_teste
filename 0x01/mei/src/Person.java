


import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private String name;
    private String surname;
    private int birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    private final float MAX_SALARY_VALUE = 13_000;

    public Person(String name,
                  String surname,
                  int birthDate,
                  boolean anotherCompanyOwner,
                  boolean pensioner,
                  boolean publicServer) {
        this.setName(name);
        this.setSurname(surname);
        this.setBirthDate(birthDate);
        this.setAnotherCompanyOwner(anotherCompanyOwner);
        this.setPensioner(pensioner);
        this.setPublicServer(publicServer);
        this.salary = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }
    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }
    public boolean isPensioner() {
        return pensioner;
    }
    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }
    public boolean isPublicServer() {
        return publicServer;
    }
    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String fullName() {
        return this.name + " " + this.surname;
    }

    public float calculateYearlySalary() {
        return this.salary * 12;
    }

    public boolean isMEI() {
        return this.isSalaryLowerThanMax(this.calculateYearlySalary()) &&
                this.isOlderThan18(this.birthDate) &&
                !anotherCompanyOwner &&
                !pensioner &&
                !publicServer;
    }

    public boolean isSalaryLowerThanMax(float salary) {
        return salary < this.MAX_SALARY_VALUE;
    }

    @Deprecated
    public boolean isOlderThan18(int birthDate) {
        return LocalDate.now().getYear() - birthDate >= 18;
    }

}
