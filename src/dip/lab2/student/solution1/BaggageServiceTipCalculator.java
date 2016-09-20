package dip.lab2.student.solution1;

import java.util.Optional;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator {
    private static double MIN_BILL = 0.00;
    private static double MAX_BILL = 100.00;
    private static String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private static double GOOD_RATE = 0.20;
    private static double FAIR_RATE = 0.15;
    private static double POOR_RATE = 0.10;

    private double baseTipPerBag;
    private int bagCount;
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }

        return tip;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
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

    public static double getMIN_BILL() {
        return MIN_BILL;
    }

    public final static void setMIN_BILL(double MIN_BILL) {
        //Has to be between 0 and MAX_BILL.
        if(MIN_BILL >= 0 && MIN_BILL <= MAX_BILL){
            BaggageServiceTipCalculator.MIN_BILL = MIN_BILL;
        }
    }

    public final static double getMAX_BILL() {
        return MAX_BILL;
    }

    public final static void setMAX_BILL(double MAX_BILL) {
        //Has to be above MIN_BILL which means it is also above or equal to 0.
        if(MAX_BILL >= MIN_BILL){
            BaggageServiceTipCalculator.MAX_BILL = MAX_BILL;
        }
    }

    public final static String getBILL_ENTRY_ERR() {
        return BILL_ENTRY_ERR;
    }

    public final static void setBILL_ENTRY_ERR(String BILL_ENTRY_ERR) {
        if(BILL_ENTRY_ERR != null && BILL_ENTRY_ERR.length() > 0){
            BaggageServiceTipCalculator.BILL_ENTRY_ERR = BILL_ENTRY_ERR;
        }
    }

    public final static double getGOOD_RATE() {
        return GOOD_RATE;
    }

    public final static void setRATES(Optional<double> GOOD_RATE, double FAIR_RATE, double POOR_RATE) {
        GOOD_RATE = GOOD_RATE != null ? GOOD_RATE : this.GOOD_RATE;
        
        BaggageServiceTipCalculator.GOOD_RATE = GOOD_RATE;
    }

    public final static double getFAIR_RATE() {
        return FAIR_RATE;
    }

    public final static double getPOOR_RATE() {
        return POOR_RATE;
    }
}
