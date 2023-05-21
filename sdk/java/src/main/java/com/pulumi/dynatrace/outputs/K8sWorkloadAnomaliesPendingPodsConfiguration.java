// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class K8sWorkloadAnomaliesPendingPodsConfiguration {
    private Integer observationPeriodInMinutes;
    private Integer samplePeriodInMinutes;
    private Integer threshold;

    private K8sWorkloadAnomaliesPendingPodsConfiguration() {}
    public Integer observationPeriodInMinutes() {
        return this.observationPeriodInMinutes;
    }
    public Integer samplePeriodInMinutes() {
        return this.samplePeriodInMinutes;
    }
    public Integer threshold() {
        return this.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(K8sWorkloadAnomaliesPendingPodsConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer observationPeriodInMinutes;
        private Integer samplePeriodInMinutes;
        private Integer threshold;
        public Builder() {}
        public Builder(K8sWorkloadAnomaliesPendingPodsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.observationPeriodInMinutes = defaults.observationPeriodInMinutes;
    	      this.samplePeriodInMinutes = defaults.samplePeriodInMinutes;
    	      this.threshold = defaults.threshold;
        }

        @CustomType.Setter
        public Builder observationPeriodInMinutes(Integer observationPeriodInMinutes) {
            this.observationPeriodInMinutes = Objects.requireNonNull(observationPeriodInMinutes);
            return this;
        }
        @CustomType.Setter
        public Builder samplePeriodInMinutes(Integer samplePeriodInMinutes) {
            this.samplePeriodInMinutes = Objects.requireNonNull(samplePeriodInMinutes);
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Integer threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public K8sWorkloadAnomaliesPendingPodsConfiguration build() {
            final var o = new K8sWorkloadAnomaliesPendingPodsConfiguration();
            o.observationPeriodInMinutes = observationPeriodInMinutes;
            o.samplePeriodInMinutes = samplePeriodInMinutes;
            o.threshold = threshold;
            return o;
        }
    }
}