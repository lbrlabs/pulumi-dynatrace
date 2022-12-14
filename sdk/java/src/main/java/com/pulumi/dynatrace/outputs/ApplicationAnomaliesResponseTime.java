// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ApplicationAnomaliesResponseTimeAuto;
import com.pulumi.dynatrace.outputs.ApplicationAnomaliesResponseTimeThresholds;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationAnomaliesResponseTime {
    /**
     * @return Parameters of the response time degradation auto-detection. Violation of **any** criterion triggers an alert
     * 
     */
    private @Nullable ApplicationAnomaliesResponseTimeAuto auto;
    /**
     * @return Fixed thresholds for response time degradation detection
     * 
     */
    private @Nullable ApplicationAnomaliesResponseTimeThresholds thresholds;

    private ApplicationAnomaliesResponseTime() {}
    /**
     * @return Parameters of the response time degradation auto-detection. Violation of **any** criterion triggers an alert
     * 
     */
    public Optional<ApplicationAnomaliesResponseTimeAuto> auto() {
        return Optional.ofNullable(this.auto);
    }
    /**
     * @return Fixed thresholds for response time degradation detection
     * 
     */
    public Optional<ApplicationAnomaliesResponseTimeThresholds> thresholds() {
        return Optional.ofNullable(this.thresholds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAnomaliesResponseTime defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ApplicationAnomaliesResponseTimeAuto auto;
        private @Nullable ApplicationAnomaliesResponseTimeThresholds thresholds;
        public Builder() {}
        public Builder(ApplicationAnomaliesResponseTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auto = defaults.auto;
    	      this.thresholds = defaults.thresholds;
        }

        @CustomType.Setter
        public Builder auto(@Nullable ApplicationAnomaliesResponseTimeAuto auto) {
            this.auto = auto;
            return this;
        }
        @CustomType.Setter
        public Builder thresholds(@Nullable ApplicationAnomaliesResponseTimeThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public ApplicationAnomaliesResponseTime build() {
            final var o = new ApplicationAnomaliesResponseTime();
            o.auto = auto;
            o.thresholds = thresholds;
            return o;
        }
    }
}
