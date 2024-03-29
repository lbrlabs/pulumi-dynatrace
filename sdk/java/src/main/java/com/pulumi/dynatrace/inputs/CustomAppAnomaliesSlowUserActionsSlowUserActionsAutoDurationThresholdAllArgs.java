// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs Empty = new CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs();

    @Import(name="durationThreshold", required=true)
    private Output<Double> durationThreshold;

    public Output<Double> durationThreshold() {
        return this.durationThreshold;
    }

    @Import(name="slowdownPercentage", required=true)
    private Output<Double> slowdownPercentage;

    public Output<Double> slowdownPercentage() {
        return this.slowdownPercentage;
    }

    private CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs() {}

    private CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs(CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs $) {
        this.durationThreshold = $.durationThreshold;
        this.slowdownPercentage = $.slowdownPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs $;

        public Builder() {
            $ = new CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs();
        }

        public Builder(CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs defaults) {
            $ = new CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs(Objects.requireNonNull(defaults));
        }

        public Builder durationThreshold(Output<Double> durationThreshold) {
            $.durationThreshold = durationThreshold;
            return this;
        }

        public Builder durationThreshold(Double durationThreshold) {
            return durationThreshold(Output.of(durationThreshold));
        }

        public Builder slowdownPercentage(Output<Double> slowdownPercentage) {
            $.slowdownPercentage = slowdownPercentage;
            return this;
        }

        public Builder slowdownPercentage(Double slowdownPercentage) {
            return slowdownPercentage(Output.of(slowdownPercentage));
        }

        public CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs build() {
            $.durationThreshold = Objects.requireNonNull($.durationThreshold, "expected parameter 'durationThreshold' to be non-null");
            $.slowdownPercentage = Objects.requireNonNull($.slowdownPercentage, "expected parameter 'slowdownPercentage' to be non-null");
            return $;
        }
    }

}
