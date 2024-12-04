package ProblemSet_9c;

public class Charge {
    private Service service;
    private double charge;

    public Charge(Service service, double charge) {
        if (charge <= 0) {
            throw new IllegalArgumentException("Invalid Charge");
        }
        this.service = service;
        this.charge = charge;
    }

    public Service getService() {
        return service;
    }

    public double getCharge() {
        return charge;
    }

    public double calculateVAT() {
        switch (service.getRate()) {
            case STANDARD:
                return charge * 0.2;
            case LOW:
                return charge * 0.05;
            case ZERO:
                return charge;
            default:
                return charge;
        }
    }
}
