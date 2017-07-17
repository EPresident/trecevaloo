/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniud.trecevaloo.metrics.results;

import uniud.trecevaloo.metrics.definitions.Metric;

/**
 * ResultSet with RUN type (holds results for a single run).
 *
 * @author Elia
 */
public class RunResultSet extends ResultSet {

    private final String runName;
    
    public RunResultSet(String runName, Metric metric) {     
        super(metric);
        this.runName = runName;
    }
    
    /**
     * Returns the run name.
     * @return the run name.
     */
    public String getRunName() {
        return runName;
    }
}
