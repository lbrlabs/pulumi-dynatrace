// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholdsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostAnomaliesV2NetworkHighNetworkDetectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostAnomaliesV2NetworkHighNetworkDetectionArgs Empty = new HostAnomaliesV2NetworkHighNetworkDetectionArgs();

    @Import(name="customThresholds")
    private @Nullable Output<HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholdsArgs> customThresholds;

    public Optional<Output<HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholdsArgs>> customThresholds() {
        return Optional.ofNullable(this.customThresholds);
    }

    @Import(name="detectionMode")
    private @Nullable Output<String> detectionMode;

    public Optional<Output<String>> detectionMode() {
        return Optional.ofNullable(this.detectionMode);
    }

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private HostAnomaliesV2NetworkHighNetworkDetectionArgs() {}

    private HostAnomaliesV2NetworkHighNetworkDetectionArgs(HostAnomaliesV2NetworkHighNetworkDetectionArgs $) {
        this.customThresholds = $.customThresholds;
        this.detectionMode = $.detectionMode;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostAnomaliesV2NetworkHighNetworkDetectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostAnomaliesV2NetworkHighNetworkDetectionArgs $;

        public Builder() {
            $ = new HostAnomaliesV2NetworkHighNetworkDetectionArgs();
        }

        public Builder(HostAnomaliesV2NetworkHighNetworkDetectionArgs defaults) {
            $ = new HostAnomaliesV2NetworkHighNetworkDetectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder customThresholds(@Nullable Output<HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholdsArgs> customThresholds) {
            $.customThresholds = customThresholds;
            return this;
        }

        public Builder customThresholds(HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholdsArgs customThresholds) {
            return customThresholds(Output.of(customThresholds));
        }

        public Builder detectionMode(@Nullable Output<String> detectionMode) {
            $.detectionMode = detectionMode;
            return this;
        }

        public Builder detectionMode(String detectionMode) {
            return detectionMode(Output.of(detectionMode));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public HostAnomaliesV2NetworkHighNetworkDetectionArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
