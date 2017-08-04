/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniud.trecevaloo.control;

/**
 * This is the TimeUnit representing a minute. It stands as an example of how
 * new TimeUnits not predefined in the TimeUnit class can be added.
 * @author Elia
 */
public class Minute extends TimeUnit {

    private static final Minute INSTANCE = new Minute();

    private Minute() {
        super("minute", "m", 1.0 / 60.0);
    }

    public static Minute getInstance() {
        return INSTANCE;
    }
}
