// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs Empty = new BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs();

    @Import(name="affectedLocations", required=true)
    private Output<Integer> affectedLocations;

    public Output<Integer> affectedLocations() {
        return this.affectedLocations;
    }

    @Import(name="consecutiveRuns", required=true)
    private Output<Integer> consecutiveRuns;

    public Output<Integer> consecutiveRuns() {
        return this.consecutiveRuns;
    }

    private BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs() {}

    private BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs(BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs $) {
        this.affectedLocations = $.affectedLocations;
        this.consecutiveRuns = $.consecutiveRuns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs $;

        public Builder() {
            $ = new BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs();
        }

        public Builder(BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs defaults) {
            $ = new BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder affectedLocations(Output<Integer> affectedLocations) {
            $.affectedLocations = affectedLocations;
            return this;
        }

        public Builder affectedLocations(Integer affectedLocations) {
            return affectedLocations(Output.of(affectedLocations));
        }

        public Builder consecutiveRuns(Output<Integer> consecutiveRuns) {
            $.consecutiveRuns = consecutiveRuns;
            return this;
        }

        public Builder consecutiveRuns(Integer consecutiveRuns) {
            return consecutiveRuns(Output.of(consecutiveRuns));
        }

        public BrowserMonitorAnomalyDetectionOutageHandlingLocalOutagePolicyArgs build() {
            $.affectedLocations = Objects.requireNonNull($.affectedLocations, "expected parameter 'affectedLocations' to be non-null");
            $.consecutiveRuns = Objects.requireNonNull($.consecutiveRuns, "expected parameter 'consecutiveRuns' to be non-null");
            return $;
        }
    }

}
