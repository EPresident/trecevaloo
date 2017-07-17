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

    public RunResultSet(String runName, Metric metric) {
        super(runName, metric);
    }

    /**
     * Iterate the result set creating the string of all results contained in
     * this result set.
     *
     * @return the results in string format.
     */
    @Override
    public String toString() {

        String resultStr = "";

        for (ResultComponent result : results) {

            if (result == null) {
                continue;
            }

            resultStr += "\nResults for run: " + result.getRunName() + "\n";

            resultStr += result.toString();
        }

        return resultStr;
    }
}
