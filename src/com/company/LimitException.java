package com.company;

public class LimitException extends Exception {
    private double reaminingAmount;

    public double getReaminingAmount() {
        return reaminingAmount;
    }

    public LimitException(String message, double reaminingAmount) {
        super(message);
        this.reaminingAmount = reaminingAmount;
    }
}
