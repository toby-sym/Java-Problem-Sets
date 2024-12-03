package ProblemSet_6a;

public class Supplier {
    private String name;
    private String phone;

    public Supplier(String name, String phone) {
        phone = phone.replaceAll("[^\\d]", "");

        if (!phone.matches("^0\\d{10}$")) {
            throw new IllegalArgumentException(
                "Phone number must start with '0' and be 11 digits long."
            );
        }

        this.name = name;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
