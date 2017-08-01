/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniud.trecevaloo.control;

/**
 * Class that encapsulates time values (seconds, milliseconds, ...)
 *
 * @author Elia
 */
public class Time implements Comparable<Time> {

    private double value;
    private TimeUnit unit;

    public Time(double value) {
        this.value = value;
        this.unit = TimeUnit.SEC;
    }

    public Time(double value, TimeUnit tu) {
        this.value = value;
        this.unit = tu;
    }

    public Time(Time t) {
        this.value = t.getValue();
        this.unit = t.getUnit();
    }

    public String toString() {
        return value + " " + unit.toString();
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public TimeUnit getUnit() {
        return unit;
    }

    public void setUnit(TimeUnit tu) {
        if (unit != tu) {
            value *= getConversionMultiplier(unit,tu);
            unit = tu;
        }
    }

    /**
     * Compare this Time to another one.
     *
     * @param t The Time to compare this one to
     * @return -1 if this is less than t, 0 if this==t, 1 if this is greater
     * than t
     */
    @Override
    public int compareTo(final Time t) {
        Time time = new Time(t);
        if (unit != time.getUnit()) {
            time.convertTo(unit);
        }

        if (value < time.getValue()) {
            return -1;
        }
        if (value > time.getValue()) {
            return 1;
        }
        return 0;
    }

    /**
     * Convert a Time to another TimeUnit, generating a new instance
     *
     * @param tu The TimeUnit to convert to
     * @return a new instance of Time with the specified TimeUnit and the
     * converted value.
     */
    public Time convertTo(TimeUnit tu) {
        if (unit != tu) {
            return new Time(value * getConversionMultiplier(unit,tu), tu);
        }
        return new Time(this);
    }

    private static double getConversionMultiplier(TimeUnit from, TimeUnit to){
        return (double) (to.getMultiplierToBase())
                    / (double) (from.getMultiplierToBase());
    }
    
    /**
     * Add the specified Time to this one.
     * @param t The Time to add
     */
    public void sum(Time t){
        Time time = t;
        if (unit != t.getUnit()) {
            time = t.convertTo(unit);
        }
        value = value + time.getValue();
    }
}
