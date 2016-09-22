package dip.lab2.student.solution1;


/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator extends ServiceTipManager {
    private double minBill = 0.00;
    private double maxBill = 100.00;
    private final String BILL_ENTRY_ERR =
            "Error: bill must be between " + minBill + " and "
            + maxBill;

    private double baseTipPerBag;
    private int bagCount;
    
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + super.getGoodRate());
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + super.getFairRate());
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + super.getPoorRate());
                break;
        }

        return tip;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    @Override
    public final void setMinBill(double minBill) {
        //Has to be between 0 and MAX_BILL.
        if(minBill >= 0 && minBill <= maxBill){
            this.minBill = minBill;
        }
    }

    public double getMaxBill() {
        return maxBill;
    }

    public void setMaxBill(double maxBill) {
        //Has to be above MIN_BILL which means it is also above or equal to 0.
        if(maxBill >= minBill){
            this.maxBill = maxBill;
        }
    }

    public final String getBILL_ENTRY_ERR() {
        return BILL_ENTRY_ERR;
    }
}
