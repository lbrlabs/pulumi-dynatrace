// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.AwsAnomaliesRdsHighMemoryDetectionCustomThresholds;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AwsAnomaliesRdsHighMemoryDetection {
    /**
     * @return Alert if **both** conditions is met in 3 out of 5 samples
     * 
     */
    private @Nullable AwsAnomaliesRdsHighMemoryDetectionCustomThresholds customThresholds;
    /**
     * @return Possible Values: `Auto`, `Custom`
     * 
     */
    private @Nullable String detectionMode;
    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    private Boolean enabled;

    private AwsAnomaliesRdsHighMemoryDetection() {}
    /**
     * @return Alert if **both** conditions is met in 3 out of 5 samples
     * 
     */
    public Optional<AwsAnomaliesRdsHighMemoryDetectionCustomThresholds> customThresholds() {
        return Optional.ofNullable(this.customThresholds);
    }
    /**
     * @return Possible Values: `Auto`, `Custom`
     * 
     */
    public Optional<String> detectionMode() {
        return Optional.ofNullable(this.detectionMode);
    }
    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsAnomaliesRdsHighMemoryDetection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AwsAnomaliesRdsHighMemoryDetectionCustomThresholds customThresholds;
        private @Nullable String detectionMode;
        private Boolean enabled;
        public Builder() {}
        public Builder(AwsAnomaliesRdsHighMemoryDetection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customThresholds = defaults.customThresholds;
    	      this.detectionMode = defaults.detectionMode;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder customThresholds(@Nullable AwsAnomaliesRdsHighMemoryDetectionCustomThresholds customThresholds) {
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
        public AwsAnomaliesRdsHighMemoryDetection build() {
            final var o = new AwsAnomaliesRdsHighMemoryDetection();
            o.customThresholds = customThresholds;
            o.detectionMode = detectionMode;
            o.enabled = enabled;
            return o;
        }
    }
}
