// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralerting {
    private Integer minActionRate;

    private MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralerting() {}
    public Integer minActionRate() {
        return this.minActionRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralerting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer minActionRate;
        public Builder() {}
        public Builder(MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralerting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minActionRate = defaults.minActionRate;
        }

        @CustomType.Setter
        public Builder minActionRate(Integer minActionRate) {
            this.minActionRate = Objects.requireNonNull(minActionRate);
            return this;
        }
        public MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralerting build() {
            final var o = new MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralerting();
            o.minActionRate = minActionRate;
            return o;
        }
    }
}
