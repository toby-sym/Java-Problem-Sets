package ProblemSet_9c;

public interface IGuest {
    void addCharge(Service service, double chargeAmount);
    double calculateTotalChargeWithoutVAT();
    double calculateVATChargeAtRate(VATRate rate);
    double calculateTotalChargeIncVat();
    String toString();
}
