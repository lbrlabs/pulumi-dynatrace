// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class ServiceAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowest {
    private Double slowestDegradationMilliseconds;

    private ServiceAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowest() {}
    public Double slowestDegradationMilliseconds() {
        return this.slowestDegradationMilliseconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double slowestDegradationMilliseconds;
        public Builder() {}
        public Builder(ServiceAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.slowestDegradationMilliseconds = defaults.slowestDegradationMilliseconds;
        }

        @CustomType.Setter
        public Builder slowestDegradationMilliseconds(Double slowestDegradationMilliseconds) {
            this.slowestDegradationMilliseconds = Objects.requireNonNull(slowestDegradationMilliseconds);
            return this;
        }
        public ServiceAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowest build() {
            final var o = new ServiceAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowest();
            o.slowestDegradationMilliseconds = slowestDegradationMilliseconds;
            return o;
        }
    }
}
