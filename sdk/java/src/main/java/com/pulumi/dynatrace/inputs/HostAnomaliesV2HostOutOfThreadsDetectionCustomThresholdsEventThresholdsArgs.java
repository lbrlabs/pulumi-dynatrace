// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class HostAnomaliesV2HostOutOfThreadsDetectionCustomThresholdsEventThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostAnomaliesV2HostOutOfThreadsDetectionCustomThresholdsEventThresholdsArgs Empty = new HostAnomaliesV2HostOutOfThreadsDetectionCustomThresholdsEventThresholdsArgs();

    @Import(name="dealertingEvaluationWindow", required=true)
    private Output<Integer> dealertingEvaluationWindow;

    public Output<Integer> dealertingEvaluationWindow() {
        return this.dealertingEvaluationWindow;
    }

    @Import(name="dealertingSamples", required=true)
    private Output<Integer> dealertingSamples;

    public Output<Integer> dealertingSamples() {
        return this.dealertingSamples;
    }

    @Import(name="violatingEvaluationWindow", required=true)
    private Output<Integer> violatingEvaluationWindow;

    public Output<Integer> violatingEvaluationWindow() {
        return this.violatingEvaluationWindow;
    }

    @Import(name="violatingSamples", required=true)
    private Output<Integer> violatingSamples;

    public Output<Integer> violatingSamples() {
        return this.violatingSamples;
    }

    private HostAnomaliesV2HostOutOfThreadsDetectionCustomThresholdsEventThresholdsArgs() {}

    private HostAnomaliesV2HostOutOfThreadsDetectionCustomThresholdsEventThresholdsArgs(HostAnomaliesV2HostOutOfThreadsDetectionCustomThresholdsEventThresholdsArgs $) {
        this.dealertingEvaluationWindow = $.dealertingEvaluationWindow;
        this.dealertingSamples = $.dealertingSamples;
        this.violatingEvaluationWindow = $.violatingEvaluationWindow;
        this.violatingSamples = $.violatingSamples;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostAnomaliesV2HostOutOfThreadsDetectionCustomThresholdsEventThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostAnomaliesV2HostOutOfThreadsDetectionCustomThresholdsEventThresholdsArgs $;

        public Builder() {
            $ = new HostAnomaliesV2HostOutOfThreadsDetectionCustomThresholdsEventThresholdsArgs();
        }

        public Builder(HostAnomaliesV2HostOutOfThreadsDetectionCustomThresholdsEventThresholdsArgs defaults) {
            $ = new HostAnomaliesV2HostOutOfThreadsDetectionCustomThresholdsEventThresholdsArgs(Objects.requireNonNull(defaults));
        }

        public Builder dealertingEvaluationWindow(Output<Integer> dealertingEvaluationWindow) {
            $.dealertingEvaluationWindow = dealertingEvaluationWindow;
            return this;
        }

        public Builder dealertingEvaluationWindow(Integer dealertingEvaluationWindow) {
            return dealertingEvaluationWindow(Output.of(dealertingEvaluationWindow));
        }

        public Builder dealertingSamples(Output<Integer> dealertingSamples) {
            $.dealertingSamples = dealertingSamples;
            return this;
        }

        public Builder dealertingSamples(Integer dealertingSamples) {
            return dealertingSamples(Output.of(dealertingSamples));
        }

        public Builder violatingEvaluationWindow(Output<Integer> violatingEvaluationWindow) {
            $.violatingEvaluationWindow = violatingEvaluationWindow;
            return this;
        }

        public Builder violatingEvaluationWindow(Integer violatingEvaluationWindow) {
            return violatingEvaluationWindow(Output.of(violatingEvaluationWindow));
        }

        public Builder violatingSamples(Output<Integer> violatingSamples) {
            $.violatingSamples = violatingSamples;
            return this;
        }

        public Builder violatingSamples(Integer violatingSamples) {
            return violatingSamples(Output.of(violatingSamples));
        }

        public HostAnomaliesV2HostOutOfThreadsDetectionCustomThresholdsEventThresholdsArgs build() {
            $.dealertingEvaluationWindow = Objects.requireNonNull($.dealertingEvaluationWindow, "expected parameter 'dealertingEvaluationWindow' to be non-null");
            $.dealertingSamples = Objects.requireNonNull($.dealertingSamples, "expected parameter 'dealertingSamples' to be non-null");
            $.violatingEvaluationWindow = Objects.requireNonNull($.violatingEvaluationWindow, "expected parameter 'violatingEvaluationWindow' to be non-null");
            $.violatingSamples = Objects.requireNonNull($.violatingSamples, "expected parameter 'violatingSamples' to be non-null");
            return $;
        }
    }

}
