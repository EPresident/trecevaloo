/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniud.trecevaloo.metrics.results;

import uniud.trecevaloo.metrics.definitions.Metric;

/**
 * ResultComponent with METRIC type (holds results for metrics).
 *
 * @author Elia
 */
public class MetricResultSet extends ResultSet {

    public MetricResultSet(Metric metric) {
        super(metric);
    }

}
