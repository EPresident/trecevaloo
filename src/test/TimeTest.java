/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import uniud.trecevaloo.control.Time;
import uniud.trecevaloo.control.TimeUnit;

/**
 * Test for the Time+TimeUnit classes
 * @author Elia
 */
public class TimeTest {

    public static void main(String args[]) {
        Time t1s = new Time(1);
        System.out.println("One second is...");
        Time t = t1s.convertTo(TimeUnit.MILLISEC);
        System.out.println("\t... "+t.toString());
        t = t1s.convertTo(TimeUnit.MICROSEC);
        System.out.println("\t... "+t.toString());
        t = t1s.convertTo(TimeUnit.NANOSEC);
        System.out.println("\t... "+t.toString());
        
        Time t7mu = new Time(7, TimeUnit.MICROSEC);
        System.out.println(t7mu.toString()+" are...");
        t = t7mu.convertTo(TimeUnit.SEC);
        System.out.println("\t... "+t.toString());
        t = t7mu.convertTo(TimeUnit.MILLISEC);
        System.out.println("\t... "+t.toString());
        t = t7mu.convertTo(TimeUnit.NANOSEC);
        System.out.println("\t... "+t.toString());
    }

}
