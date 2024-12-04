package ProblemSet_9b;

import java.util.ArrayList;

public class Guest {

    private String forename;
    private String surname;
    private String address;
    private String telephone;
    private ArrayList<Charge> charges;

    public Guest(String forename, String surname, String address, 
                 String telephone) {
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.telephone = telephone;
        charges = new ArrayList<>();
    }

    public void addCharge(Service service, double chargeAmount) {
        Charge charge = new Charge(service, chargeAmount);
        charges.add(charge);
    }

    public double calculateTotalChargeWithoutVAT() {
        double sum = 0.0;

        for (Charge charge : charges) {
            sum += charge.getCharge();
        }

        return sum;
    }

    public double calculateVATChargeAtRate(VATRate rate) {
        double sum = 0.0;

        for (Charge charge : charges) {
            sum += charge.calculateVAT();
        }

        return sum;
    }

    public ArrayList<Charge> getCharges() {
        return charges;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }
}
