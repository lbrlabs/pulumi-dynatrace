// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsEventThresholdsArgs;
import java.lang.Double;
import java.util.Objects;


public final class HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsArgs Empty = new HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsArgs();

    @Import(name="eventThresholds", required=true)
    private Output<HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsEventThresholdsArgs> eventThresholds;

    public Output<HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsEventThresholdsArgs> eventThresholds() {
        return this.eventThresholds;
    }

    @Import(name="systemLoad", required=true)
    private Output<Double> systemLoad;

    public Output<Double> systemLoad() {
        return this.systemLoad;
    }

    private HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsArgs() {}

    private HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsArgs(HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsArgs $) {
        this.eventThresholds = $.eventThresholds;
        this.systemLoad = $.systemLoad;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsArgs $;

        public Builder() {
            $ = new HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsArgs();
        }

        public Builder(HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsArgs defaults) {
            $ = new HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsArgs(Objects.requireNonNull(defaults));
        }

        public Builder eventThresholds(Output<HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsEventThresholdsArgs> eventThresholds) {
            $.eventThresholds = eventThresholds;
            return this;
        }

        public Builder eventThresholds(HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsEventThresholdsArgs eventThresholds) {
            return eventThresholds(Output.of(eventThresholds));
        }

        public Builder systemLoad(Output<Double> systemLoad) {
            $.systemLoad = systemLoad;
            return this;
        }

        public Builder systemLoad(Double systemLoad) {
            return systemLoad(Output.of(systemLoad));
        }

        public HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholdsArgs build() {
            $.eventThresholds = Objects.requireNonNull($.eventThresholds, "expected parameter 'eventThresholds' to be non-null");
            $.systemLoad = Objects.requireNonNull($.systemLoad, "expected parameter 'systemLoad' to be non-null");
            return $;
        }
    }

}
