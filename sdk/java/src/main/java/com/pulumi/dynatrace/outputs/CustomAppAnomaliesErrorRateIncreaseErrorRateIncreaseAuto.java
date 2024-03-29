// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class CustomAppAnomaliesErrorRateIncreaseErrorRateIncreaseAuto {
    private Double thresholdAbsolute;
    private Double thresholdRelative;

    private CustomAppAnomaliesErrorRateIncreaseErrorRateIncreaseAuto() {}
    public Double thresholdAbsolute() {
        return this.thresholdAbsolute;
    }
    public Double thresholdRelative() {
        return this.thresholdRelative;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomAppAnomaliesErrorRateIncreaseErrorRateIncreaseAuto defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double thresholdAbsolute;
        private Double thresholdRelative;
        public Builder() {}
        public Builder(CustomAppAnomaliesErrorRateIncreaseErrorRateIncreaseAuto defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.thresholdAbsolute = defaults.thresholdAbsolute;
    	      this.thresholdRelative = defaults.thresholdRelative;
        }

        @CustomType.Setter
        public Builder thresholdAbsolute(Double thresholdAbsolute) {
            this.thresholdAbsolute = Objects.requireNonNull(thresholdAbsolute);
            return this;
        }
        @CustomType.Setter
        public Builder thresholdRelative(Double thresholdRelative) {
            this.thresholdRelative = Objects.requireNonNull(thresholdRelative);
            return this;
        }
        public CustomAppAnomaliesErrorRateIncreaseErrorRateIncreaseAuto build() {
            final var o = new CustomAppAnomaliesErrorRateIncreaseErrorRateIncreaseAuto();
            o.thresholdAbsolute = thresholdAbsolute;
            o.thresholdRelative = thresholdRelative;
            return o;
        }
    }
}
