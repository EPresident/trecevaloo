package uniud.trecevaloo.metrics.results;

import uniud.trecevaloo.exceptions.TrecEvalOOException;

/**
 * This viewer shows the result of a given metric in a given topic.
 */
public class SingleResultViewer implements ResultViewer {

    private String metricName;
    private String topicId;

    /**
     * SingleResultViewer constructor.
     *
     * @param topicId topic id.
     * @param metricName the metric name.
     */
    public SingleResultViewer(String topicId, String metricName) {
        this.topicId = topicId;
        this.metricName = metricName;
    }

    /**
     * This method shows the result of a given metric in a given topic.
     */
    @Override
    public void show(ResultComponent results) throws TrecEvalOOException {
        System.out.println("************************************************");
        System.out.println("*************** Single output ******************");
        System.out.println("************************************************");

        if (results instanceof GeneralResultSet) {

            for (ResultComponent runResult : results.getResults()) {
                if (runResult instanceof RunResultSet) {
                    RunResultSet rrs = (RunResultSet) runResult;
                    System.out.println("\nResults for run: " + rrs.getRunName());

                    Result result = runResult.getResult(metricName, topicId);
                    if (result != null) {
                        System.out.print(result.toString());
                    } else {
                        System.out.println("Metric " + metricName + " is not computed in topic " + topicId);
                    }
                }
            }
        }
    }
}
