/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniud.trecevaloo.control;

/**
 * Class representing a time unit (seconds, milliseconds, ...)
 * @author Elia
 */
public class TimeUnit {
    
    private final TimeUnit BASE_UNIT;
    private final String ACRONYM, NAME;
    /**
     * The number you have to multiply the unit to obtain it from the base one.
     * For example: milliseconds have a 1000 multiplier, because 1 second = 1000 ms.
     */
    private final double MULTIPLIER_TO_BASE;
    
    public final static TimeUnit SEC = new TimeUnit("second", "s", 1);
    public final static TimeUnit MILLISEC = new TimeUnit("millisecond", "ms", 1000);
    public final static TimeUnit MICROSEC = new TimeUnit("microsecond", "μs", 1000000);
    public final static TimeUnit NANOSEC = new TimeUnit("nanosecond", "ns", 1000000000);
    
    protected TimeUnit(String name, String acron, double mult){
        BASE_UNIT = SEC;
        ACRONYM = acron;
        NAME = name;
        MULTIPLIER_TO_BASE = mult;
    }
    
    @Override
    public String toString(){
        return ACRONYM;
    }

    public TimeUnit getBaseUnit() {
        return BASE_UNIT;
    }

    public String getAcronym() {
        return ACRONYM;
    }

    public String getName() {
        return NAME;
    }

    public double getMultiplierToBase() {
        return MULTIPLIER_TO_BASE;
    }
    
    
}
