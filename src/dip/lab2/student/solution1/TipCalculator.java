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
public interface TipCalculator {
    public abstract double getMinBill();
    public abstract void setMinBill(double minBill);
    
    public abstract double getTip();
    
    public abstract void setServiceRating(ServiceQuality q);
}
