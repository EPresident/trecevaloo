package uniud.trecevaloo.metrics.results;

import uniud.trecevaloo.exceptions.TrecEvalOOException;

import java.util.List;

/**
 * This viewer shows specific run results (also for each topic) for a given metric.
 */
public class MetricRunResultViewer implements ResultViewer {

    private String metricName;
    private String runName;

    /**
     * MetricRunResultViewer constructor.
     * @param metricName metric name.
     * @param runName run name.
     */
    public MetricRunResultViewer(String metricName, String runName){
        this.metricName = metricName;
        this.runName = runName;
    }

    /**
     * This method shows specific run results (also for each topic) for a given metric.
     */
    @Override
    public void show(ResultComponent results) throws TrecEvalOOException {

        System.out.println("************************************************");
        System.out.println("*************** " + metricName + " output ****************");
        System.out.println("************************************************");

        if (results instanceof GeneralResultSet) {

            for (ResultComponent runResult : results.getResults()) {

                if(runResult instanceof RunResultSet){
                    RunResultSet rrs = (RunResultSet) runResult;
                    if (rrs.getRunName().equals(runName)) {

                    List<Result> resultList = runResult.getResultsByMetric(metricName);

                    System.out.println("\nResults for run: " + rrs.getRunName());
                    if (resultList.isEmpty()) {
                        System.out.println("No results for metric " + metricName);
                    }

                    for (Result result : resultList) {
                        System.out.print(result.toString());
                    }
                }
                }
            }
        }
    }
}
