// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomAnomaliesStrategyAuto {
    private String alertCondition;
    private @Nullable Boolean alertingOnMissingData;
    private Integer dealertingSamples;
    private Integer samples;
    private Double signalFluctuations;
    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    private @Nullable String unknowns;
    private Integer violatingSamples;

    private CustomAnomaliesStrategyAuto() {}
    public String alertCondition() {
        return this.alertCondition;
    }
    public Optional<Boolean> alertingOnMissingData() {
        return Optional.ofNullable(this.alertingOnMissingData);
    }
    public Integer dealertingSamples() {
        return this.dealertingSamples;
    }
    public Integer samples() {
        return this.samples;
    }
    public Double signalFluctuations() {
        return this.signalFluctuations;
    }
    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }
    public Integer violatingSamples() {
        return this.violatingSamples;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomAnomaliesStrategyAuto defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alertCondition;
        private @Nullable Boolean alertingOnMissingData;
        private Integer dealertingSamples;
        private Integer samples;
        private Double signalFluctuations;
        private @Nullable String unknowns;
        private Integer violatingSamples;
        public Builder() {}
        public Builder(CustomAnomaliesStrategyAuto defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertCondition = defaults.alertCondition;
    	      this.alertingOnMissingData = defaults.alertingOnMissingData;
    	      this.dealertingSamples = defaults.dealertingSamples;
    	      this.samples = defaults.samples;
    	      this.signalFluctuations = defaults.signalFluctuations;
    	      this.unknowns = defaults.unknowns;
    	      this.violatingSamples = defaults.violatingSamples;
        }

        @CustomType.Setter
        public Builder alertCondition(String alertCondition) {
            this.alertCondition = Objects.requireNonNull(alertCondition);
            return this;
        }
        @CustomType.Setter
        public Builder alertingOnMissingData(@Nullable Boolean alertingOnMissingData) {
            this.alertingOnMissingData = alertingOnMissingData;
            return this;
        }
        @CustomType.Setter
        public Builder dealertingSamples(Integer dealertingSamples) {
            this.dealertingSamples = Objects.requireNonNull(dealertingSamples);
            return this;
        }
        @CustomType.Setter
        public Builder samples(Integer samples) {
            this.samples = Objects.requireNonNull(samples);
            return this;
        }
        @CustomType.Setter
        public Builder signalFluctuations(Double signalFluctuations) {
            this.signalFluctuations = Objects.requireNonNull(signalFluctuations);
            return this;
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        @CustomType.Setter
        public Builder violatingSamples(Integer violatingSamples) {
            this.violatingSamples = Objects.requireNonNull(violatingSamples);
            return this;
        }
        public CustomAnomaliesStrategyAuto build() {
            final var o = new CustomAnomaliesStrategyAuto();
            o.alertCondition = alertCondition;
            o.alertingOnMissingData = alertingOnMissingData;
            o.dealertingSamples = dealertingSamples;
            o.samples = samples;
            o.signalFluctuations = signalFluctuations;
            o.unknowns = unknowns;
            o.violatingSamples = violatingSamples;
            return o;
        }
    }
}
