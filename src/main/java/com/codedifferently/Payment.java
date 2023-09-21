package com.codedifferently;

public class Payment {
    private double amount;
    private boolean purchaseSuccessful;

    public Payment(double amount) {
        this.amount = amount;
    }

    public Payment(double price, boolean b) {
    }

    public boolean processPayment(double bookPrice) {
        return amount >= bookPrice;
    }

    public boolean isPurchaseSuccessful() {
        return purchaseSuccessful;
    }

    public void setPurchaseSuccessful(boolean purchaseSuccessful) {
        this.purchaseSuccessful = purchaseSuccessful;
    }
}

