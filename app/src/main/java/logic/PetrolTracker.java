package logic;

public class PetrolTracker {
    private static PetrolTracker instance = new PetrolTracker();

    private PetrolTracker() {
    }

    public static PetrolTracker getInstance() {
        return instance;
    }

    public void submitFillUp(float price, float amount, int odometer) {
        FillUp submittedFillUp = new FillUp(price, amount, odometer);
        submittedFillUp.upload();
    }
}
