package ProblemSet_9a;

import ProblemSet_9b.Service;

public class Charge {
    private Service service;
    private double charge;

    public Charge(Service service, double charge) {
        if (charge < 0 || charge == 0) {
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
                return (this.charge * 0.2);
            case LOW:
                return (this.charge * 0.05);
            case ZERO:
                return this.charge;
            default:
                return this.charge;
        }
    }
}
