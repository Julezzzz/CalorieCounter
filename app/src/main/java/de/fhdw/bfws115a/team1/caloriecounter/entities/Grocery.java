package de.fhdw.bfws115a.team1.caloriecounter.entities;

/**
 * Created by Viktor on 15.11.2016.
 */

public class Grocery extends GroceriesEntity {
    private Unit mUnit;
    private double mAmount;
    private int mKcal;

    public Grocery(String name, Unit unit, double amount, int kcal) {
        super(name);

        mUnit = unit;
        mAmount = amount;
        mKcal = kcal;
    }

    public Grocery(Grocery grocery) {
        this(grocery.getName(), grocery.getUnit(), grocery.getAmount(), grocery.getKcal());
    }

    public Unit getUnit() {
        return mUnit;
    }

    public double getAmount() {
        return mAmount;
    }

    public int getKcal() {
        return mKcal;
    }

    public void setUnit(Unit mUnit) {
        this.mUnit = mUnit;
    }

    public void setAmount(double mAmount) {
        this.mAmount = mAmount;
    }

    public void setKcal(int mKcal) {
        this.mKcal = mKcal;
    }

    public String toString() {
        return "Grocery(Name: " + getName() + ", Unit: " + getUnit().toString() + ", Amount: " + getAmount() + ", KCal: " + getKcal() + ")";
    }
}
