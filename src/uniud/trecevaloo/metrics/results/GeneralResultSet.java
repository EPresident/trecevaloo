/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniud.trecevaloo.metrics.results;

import uniud.trecevaloo.metrics.definitions.Metric;

/**
 * ResultComponent with GENERAL type (holds results for multiple runs).
 *
 * @author Elia
 */
public class GeneralResultSet extends ResultSet {

    public GeneralResultSet(String runName, Metric metric) {
        super(runName, metric);
    }

}
