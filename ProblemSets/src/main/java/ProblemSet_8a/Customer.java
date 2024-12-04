package ProblemSet_8a;

public class Customer {
    private String name;
    private String surname;

    public Customer(String name, String surname) {
        if (name.matches("^[A-Z][a-z]*$") && surname.matches("^[A-Z][a-z]*$")) {
            this.name = name;
            this.surname = surname;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public char getName() {
        return name.charAt(0);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public boolean validateInfo(String string) {
        if (string.matches("^[A-Z][a-z]*$")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getName() + ". " + this.getSurname();
    }
}
