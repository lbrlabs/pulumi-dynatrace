// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.HostAnomaliesDisksSpaceThresholds;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostAnomaliesDisksSpace {
    private Boolean enabled;
    private @Nullable HostAnomaliesDisksSpaceThresholds thresholds;

    private HostAnomaliesDisksSpace() {}
    public Boolean enabled() {
        return this.enabled;
    }
    public Optional<HostAnomaliesDisksSpaceThresholds> thresholds() {
        return Optional.ofNullable(this.thresholds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostAnomaliesDisksSpace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable HostAnomaliesDisksSpaceThresholds thresholds;
        public Builder() {}
        public Builder(HostAnomaliesDisksSpace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.thresholds = defaults.thresholds;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder thresholds(@Nullable HostAnomaliesDisksSpaceThresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public HostAnomaliesDisksSpace build() {
            final var o = new HostAnomaliesDisksSpace();
            o.enabled = enabled;
            o.thresholds = thresholds;
            return o;
        }
    }
}
