/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author L115student
 */
public abstract class ServiceTipManager implements TipCalculator {
    private double minBill = 0;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    
    private ServiceQuality serviceQuality;
    
    @Override
    public abstract double getTip();
    
    @Override
    public final double getMinBill(){
        return minBill;
    }
    
    @Override
    public abstract void setMinBill(double billAmt);

    public final double getGoodRate() {
        return goodRate;
    }

    public final double getFairRate() {
        return fairRate;
    }

    public final double getPoorRate() {
        return poorRate;
    }
    
    
    public final void setRates(double goodRate, double fairRate, double poorRate) {
        if(poorRate >= 0 && poorRate <= 1){
            this.poorRate = poorRate; 
        }
        if(fairRate >= poorRate && fairRate <= goodRate){
            this.fairRate = fairRate; 
        }
        if(goodRate >= fairRate){
            this.goodRate = goodRate;
        }
    }
    
    @Override
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
}
