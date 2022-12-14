// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.BrowserMonitorAnomalyDetectionLoadingTimeThreshold;
import com.pulumi.dynatrace.outputs.BrowserMonitorAnomalyDetectionOutageHandling;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BrowserMonitorAnomalyDetection {
    /**
     * @return Thresholds for loading times
     * 
     */
    private @Nullable List<BrowserMonitorAnomalyDetectionLoadingTimeThreshold> loadingTimeThresholds;
    /**
     * @return Outage handling configuration
     * 
     */
    private @Nullable List<BrowserMonitorAnomalyDetectionOutageHandling> outageHandlings;

    private BrowserMonitorAnomalyDetection() {}
    /**
     * @return Thresholds for loading times
     * 
     */
    public List<BrowserMonitorAnomalyDetectionLoadingTimeThreshold> loadingTimeThresholds() {
        return this.loadingTimeThresholds == null ? List.of() : this.loadingTimeThresholds;
    }
    /**
     * @return Outage handling configuration
     * 
     */
    public List<BrowserMonitorAnomalyDetectionOutageHandling> outageHandlings() {
        return this.outageHandlings == null ? List.of() : this.outageHandlings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrowserMonitorAnomalyDetection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<BrowserMonitorAnomalyDetectionLoadingTimeThreshold> loadingTimeThresholds;
        private @Nullable List<BrowserMonitorAnomalyDetectionOutageHandling> outageHandlings;
        public Builder() {}
        public Builder(BrowserMonitorAnomalyDetection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadingTimeThresholds = defaults.loadingTimeThresholds;
    	      this.outageHandlings = defaults.outageHandlings;
        }

        @CustomType.Setter
        public Builder loadingTimeThresholds(@Nullable List<BrowserMonitorAnomalyDetectionLoadingTimeThreshold> loadingTimeThresholds) {
            this.loadingTimeThresholds = loadingTimeThresholds;
            return this;
        }
        public Builder loadingTimeThresholds(BrowserMonitorAnomalyDetectionLoadingTimeThreshold... loadingTimeThresholds) {
            return loadingTimeThresholds(List.of(loadingTimeThresholds));
        }
        @CustomType.Setter
        public Builder outageHandlings(@Nullable List<BrowserMonitorAnomalyDetectionOutageHandling> outageHandlings) {
            this.outageHandlings = outageHandlings;
            return this;
        }
        public Builder outageHandlings(BrowserMonitorAnomalyDetectionOutageHandling... outageHandlings) {
            return outageHandlings(List.of(outageHandlings));
        }
        public BrowserMonitorAnomalyDetection build() {
            final var o = new BrowserMonitorAnomalyDetection();
            o.loadingTimeThresholds = loadingTimeThresholds;
            o.outageHandlings = outageHandlings;
            return o;
        }
    }
}
