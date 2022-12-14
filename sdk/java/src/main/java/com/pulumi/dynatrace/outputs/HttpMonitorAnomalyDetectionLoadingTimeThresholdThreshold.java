// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.HttpMonitorAnomalyDetectionLoadingTimeThresholdThresholdThreshold;
import java.util.List;
import java.util.Objects;

@CustomType
public final class HttpMonitorAnomalyDetectionLoadingTimeThresholdThreshold {
    private List<HttpMonitorAnomalyDetectionLoadingTimeThresholdThresholdThreshold> thresholds;

    private HttpMonitorAnomalyDetectionLoadingTimeThresholdThreshold() {}
    public List<HttpMonitorAnomalyDetectionLoadingTimeThresholdThresholdThreshold> thresholds() {
        return this.thresholds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpMonitorAnomalyDetectionLoadingTimeThresholdThreshold defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<HttpMonitorAnomalyDetectionLoadingTimeThresholdThresholdThreshold> thresholds;
        public Builder() {}
        public Builder(HttpMonitorAnomalyDetectionLoadingTimeThresholdThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.thresholds = defaults.thresholds;
        }

        @CustomType.Setter
        public Builder thresholds(List<HttpMonitorAnomalyDetectionLoadingTimeThresholdThresholdThreshold> thresholds) {
            this.thresholds = Objects.requireNonNull(thresholds);
            return this;
        }
        public Builder thresholds(HttpMonitorAnomalyDetectionLoadingTimeThresholdThresholdThreshold... thresholds) {
            return thresholds(List.of(thresholds));
        }
        public HttpMonitorAnomalyDetectionLoadingTimeThresholdThreshold build() {
            final var o = new HttpMonitorAnomalyDetectionLoadingTimeThresholdThreshold();
            o.thresholds = thresholds;
            return o;
        }
    }
}
