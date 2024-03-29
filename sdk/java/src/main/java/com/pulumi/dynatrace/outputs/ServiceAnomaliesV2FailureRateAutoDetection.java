// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtection;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class ServiceAnomaliesV2FailureRateAutoDetection {
    private Double absoluteIncrease;
    private ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtection overAlertingProtection;
    private Double relativeIncrease;

    private ServiceAnomaliesV2FailureRateAutoDetection() {}
    public Double absoluteIncrease() {
        return this.absoluteIncrease;
    }
    public ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtection overAlertingProtection() {
        return this.overAlertingProtection;
    }
    public Double relativeIncrease() {
        return this.relativeIncrease;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAnomaliesV2FailureRateAutoDetection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double absoluteIncrease;
        private ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtection overAlertingProtection;
        private Double relativeIncrease;
        public Builder() {}
        public Builder(ServiceAnomaliesV2FailureRateAutoDetection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.absoluteIncrease = defaults.absoluteIncrease;
    	      this.overAlertingProtection = defaults.overAlertingProtection;
    	      this.relativeIncrease = defaults.relativeIncrease;
        }

        @CustomType.Setter
        public Builder absoluteIncrease(Double absoluteIncrease) {
            this.absoluteIncrease = Objects.requireNonNull(absoluteIncrease);
            return this;
        }
        @CustomType.Setter
        public Builder overAlertingProtection(ServiceAnomaliesV2FailureRateAutoDetectionOverAlertingProtection overAlertingProtection) {
            this.overAlertingProtection = Objects.requireNonNull(overAlertingProtection);
            return this;
        }
        @CustomType.Setter
        public Builder relativeIncrease(Double relativeIncrease) {
            this.relativeIncrease = Objects.requireNonNull(relativeIncrease);
            return this;
        }
        public ServiceAnomaliesV2FailureRateAutoDetection build() {
            final var o = new ServiceAnomaliesV2FailureRateAutoDetection();
            o.absoluteIncrease = absoluteIncrease;
            o.overAlertingProtection = overAlertingProtection;
            o.relativeIncrease = relativeIncrease;
            return o;
        }
    }
}
