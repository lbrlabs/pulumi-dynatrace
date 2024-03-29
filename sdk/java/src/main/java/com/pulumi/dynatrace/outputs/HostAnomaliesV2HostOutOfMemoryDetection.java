// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.HostAnomaliesV2HostOutOfMemoryDetectionCustomThresholds;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostAnomaliesV2HostOutOfMemoryDetection {
    private @Nullable HostAnomaliesV2HostOutOfMemoryDetectionCustomThresholds customThresholds;
    private @Nullable String detectionMode;
    private Boolean enabled;

    private HostAnomaliesV2HostOutOfMemoryDetection() {}
    public Optional<HostAnomaliesV2HostOutOfMemoryDetectionCustomThresholds> customThresholds() {
        return Optional.ofNullable(this.customThresholds);
    }
    public Optional<String> detectionMode() {
        return Optional.ofNullable(this.detectionMode);
    }
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostAnomaliesV2HostOutOfMemoryDetection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable HostAnomaliesV2HostOutOfMemoryDetectionCustomThresholds customThresholds;
        private @Nullable String detectionMode;
        private Boolean enabled;
        public Builder() {}
        public Builder(HostAnomaliesV2HostOutOfMemoryDetection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customThresholds = defaults.customThresholds;
    	      this.detectionMode = defaults.detectionMode;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder customThresholds(@Nullable HostAnomaliesV2HostOutOfMemoryDetectionCustomThresholds customThresholds) {
            this.customThresholds = customThresholds;
            return this;
        }
        @CustomType.Setter
        public Builder detectionMode(@Nullable String detectionMode) {
            this.detectionMode = detectionMode;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public HostAnomaliesV2HostOutOfMemoryDetection build() {
            final var o = new HostAnomaliesV2HostOutOfMemoryDetection();
            o.customThresholds = customThresholds;
            o.detectionMode = detectionMode;
            o.enabled = enabled;
            return o;
        }
    }
}
