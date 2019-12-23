package logic;

import services.NetworkAccess;

public class FillUp {
    private float price;
    private float amount;
    private int odometer;

    public FillUp(float price, float amount, int odometer) {
        this.price = price;
        this.amount = amount;
        this.odometer =odometer;
    }

    public void upload() {
        NetworkAccess.upload(this);
    }
}
