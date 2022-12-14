// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.HostAnomaliesGcThresholdsArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostAnomaliesGcArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostAnomaliesGcArgs Empty = new HostAnomaliesGcArgs();

    /**
     * The detection is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return The detection is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Custom thresholds for high GC activity. If not set, automatic mode is used.   Meeting **any** of these conditions triggers an alert
     * 
     */
    @Import(name="thresholds")
    private @Nullable Output<HostAnomaliesGcThresholdsArgs> thresholds;

    /**
     * @return Custom thresholds for high GC activity. If not set, automatic mode is used.   Meeting **any** of these conditions triggers an alert
     * 
     */
    public Optional<Output<HostAnomaliesGcThresholdsArgs>> thresholds() {
        return Optional.ofNullable(this.thresholds);
    }

    private HostAnomaliesGcArgs() {}

    private HostAnomaliesGcArgs(HostAnomaliesGcArgs $) {
        this.enabled = $.enabled;
        this.thresholds = $.thresholds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostAnomaliesGcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostAnomaliesGcArgs $;

        public Builder() {
            $ = new HostAnomaliesGcArgs();
        }

        public Builder(HostAnomaliesGcArgs defaults) {
            $ = new HostAnomaliesGcArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled The detection is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The detection is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param thresholds Custom thresholds for high GC activity. If not set, automatic mode is used.   Meeting **any** of these conditions triggers an alert
         * 
         * @return builder
         * 
         */
        public Builder thresholds(@Nullable Output<HostAnomaliesGcThresholdsArgs> thresholds) {
            $.thresholds = thresholds;
            return this;
        }

        /**
         * @param thresholds Custom thresholds for high GC activity. If not set, automatic mode is used.   Meeting **any** of these conditions triggers an alert
         * 
         * @return builder
         * 
         */
        public Builder thresholds(HostAnomaliesGcThresholdsArgs thresholds) {
            return thresholds(Output.of(thresholds));
        }

        public HostAnomaliesGcArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
