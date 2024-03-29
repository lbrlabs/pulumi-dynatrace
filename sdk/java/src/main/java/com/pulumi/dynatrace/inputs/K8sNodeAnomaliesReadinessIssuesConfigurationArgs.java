// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class K8sNodeAnomaliesReadinessIssuesConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final K8sNodeAnomaliesReadinessIssuesConfigurationArgs Empty = new K8sNodeAnomaliesReadinessIssuesConfigurationArgs();

    @Import(name="observationPeriodInMinutes", required=true)
    private Output<Integer> observationPeriodInMinutes;

    public Output<Integer> observationPeriodInMinutes() {
        return this.observationPeriodInMinutes;
    }

    @Import(name="samplePeriodInMinutes", required=true)
    private Output<Integer> samplePeriodInMinutes;

    public Output<Integer> samplePeriodInMinutes() {
        return this.samplePeriodInMinutes;
    }

    private K8sNodeAnomaliesReadinessIssuesConfigurationArgs() {}

    private K8sNodeAnomaliesReadinessIssuesConfigurationArgs(K8sNodeAnomaliesReadinessIssuesConfigurationArgs $) {
        this.observationPeriodInMinutes = $.observationPeriodInMinutes;
        this.samplePeriodInMinutes = $.samplePeriodInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(K8sNodeAnomaliesReadinessIssuesConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private K8sNodeAnomaliesReadinessIssuesConfigurationArgs $;

        public Builder() {
            $ = new K8sNodeAnomaliesReadinessIssuesConfigurationArgs();
        }

        public Builder(K8sNodeAnomaliesReadinessIssuesConfigurationArgs defaults) {
            $ = new K8sNodeAnomaliesReadinessIssuesConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder observationPeriodInMinutes(Output<Integer> observationPeriodInMinutes) {
            $.observationPeriodInMinutes = observationPeriodInMinutes;
            return this;
        }

        public Builder observationPeriodInMinutes(Integer observationPeriodInMinutes) {
            return observationPeriodInMinutes(Output.of(observationPeriodInMinutes));
        }

        public Builder samplePeriodInMinutes(Output<Integer> samplePeriodInMinutes) {
            $.samplePeriodInMinutes = samplePeriodInMinutes;
            return this;
        }

        public Builder samplePeriodInMinutes(Integer samplePeriodInMinutes) {
            return samplePeriodInMinutes(Output.of(samplePeriodInMinutes));
        }

        public K8sNodeAnomaliesReadinessIssuesConfigurationArgs build() {
            $.observationPeriodInMinutes = Objects.requireNonNull($.observationPeriodInMinutes, "expected parameter 'observationPeriodInMinutes' to be non-null");
            $.samplePeriodInMinutes = Objects.requireNonNull($.samplePeriodInMinutes, "expected parameter 'samplePeriodInMinutes' to be non-null");
            return $;
        }
    }

}
