package uniud.trecevaloo.metrics.results;

import uniud.trecevaloo.metrics.definitions.Metric;

import java.util.List;

/**
 * This class implements the methods needed for the composition of metric result items (Result Set and Result).
 * It is necessary to realize the Composite design pattern to compose result sets.
 */
public abstract class ResultComponent {

    private Metric metric;    

    public static final String ALL  = "ALL";

    /**
     * The ResultComponent constructor.
     * @param idTopic the topic id.
     * @param metric the metric name.
     * @param runName the run name.
     * @param type the type (used internally)
     */
    ResultComponent(Metric metric){
        this.metric = metric;
    }

    /**
     * See ResultSet.
     * @param component
     */
    public abstract void add(ResultComponent component);
    /**
     * See ResultSet.
     * @param component
     */
    public abstract void remove(ResultComponent component);

    /**
     * This method should create correctly a string containing the result(s).
     * @return results in string format.
     */
    public abstract String toString();

    /**
     * This method should return result(s) list.
     * @return result list
     */
    public abstract List<ResultComponent> getResults();

    /**
     * This method should return the list of results of a specific metric.
     * @param metricName metric name.
     * @return result list.
     */
    public abstract List<Result> getResultsByMetric(String metricName);

    /**
     * This method should return the list of results of a specific topic.
     * @param idTopic topic id.
     * @return result list.
     */
    public abstract List<Result> getResultsByIdTopic(String idTopic);

    /**
     * This method should return the result of a specific metric in a specific topic.
     * @param metricName metric name.
     * @param idTopic topic id.
     * @return metric result.
     */
    public abstract Result getResult(String metricName, String idTopic);

    /**
     * Returns the metric acronym.
     * @return metric acronym.
     */
    public String getMetricAcronym() {
        return metric.getMetricAcronym();
    }

    /**
     * Tells if is a result to show only in overall results.
     * @return true if is a overall result, or false otherwise.
     */
    public boolean isOverallMetric(){
        return metric.isOverallMetric();
    }

}
