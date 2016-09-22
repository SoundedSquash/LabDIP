package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator extends ServiceTipManager{
    private final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + this.getMinBill();

    private double bill;
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setMinBill(billAmt);
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * this.getGoodRate();
                break;
            case FAIR:
                tip = bill * this.getFairRate();
                break;
            case POOR:
                tip = bill * this.getPoorRate();
                break;
        }

        return tip;
    }

    @Override
    public final void setMinBill(double billAmt) {
        if(billAmt < 0) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }
}
