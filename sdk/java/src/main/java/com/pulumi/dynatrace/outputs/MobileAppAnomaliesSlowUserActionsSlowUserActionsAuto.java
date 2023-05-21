// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationAvoidOveralerting;
import com.pulumi.dynatrace.outputs.MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAll;
import com.pulumi.dynatrace.outputs.MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdSlowest;
import java.util.Objects;

@CustomType
public final class MobileAppAnomaliesSlowUserActionsSlowUserActionsAuto {
    private MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationAvoidOveralerting durationAvoidOveralerting;
    private MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAll durationThresholdAll;
    private MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdSlowest durationThresholdSlowest;

    private MobileAppAnomaliesSlowUserActionsSlowUserActionsAuto() {}
    public MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationAvoidOveralerting durationAvoidOveralerting() {
        return this.durationAvoidOveralerting;
    }
    public MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAll durationThresholdAll() {
        return this.durationThresholdAll;
    }
    public MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdSlowest durationThresholdSlowest() {
        return this.durationThresholdSlowest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MobileAppAnomaliesSlowUserActionsSlowUserActionsAuto defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationAvoidOveralerting durationAvoidOveralerting;
        private MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAll durationThresholdAll;
        private MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdSlowest durationThresholdSlowest;
        public Builder() {}
        public Builder(MobileAppAnomaliesSlowUserActionsSlowUserActionsAuto defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationAvoidOveralerting = defaults.durationAvoidOveralerting;
    	      this.durationThresholdAll = defaults.durationThresholdAll;
    	      this.durationThresholdSlowest = defaults.durationThresholdSlowest;
        }

        @CustomType.Setter
        public Builder durationAvoidOveralerting(MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationAvoidOveralerting durationAvoidOveralerting) {
            this.durationAvoidOveralerting = Objects.requireNonNull(durationAvoidOveralerting);
            return this;
        }
        @CustomType.Setter
        public Builder durationThresholdAll(MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAll durationThresholdAll) {
            this.durationThresholdAll = Objects.requireNonNull(durationThresholdAll);
            return this;
        }
        @CustomType.Setter
        public Builder durationThresholdSlowest(MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdSlowest durationThresholdSlowest) {
            this.durationThresholdSlowest = Objects.requireNonNull(durationThresholdSlowest);
            return this;
        }
        public MobileAppAnomaliesSlowUserActionsSlowUserActionsAuto build() {
            final var o = new MobileAppAnomaliesSlowUserActionsSlowUserActionsAuto();
            o.durationAvoidOveralerting = durationAvoidOveralerting;
            o.durationThresholdAll = durationThresholdAll;
            o.durationThresholdSlowest = durationThresholdSlowest;
            return o;
        }
    }
}