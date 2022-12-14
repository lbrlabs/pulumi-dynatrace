// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.HostAnomaliesJavaOutOfThreadsThresholdsArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostAnomaliesJavaOutOfThreadsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostAnomaliesJavaOutOfThreadsArgs Empty = new HostAnomaliesJavaOutOfThreadsArgs();

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="thresholds")
    private @Nullable Output<HostAnomaliesJavaOutOfThreadsThresholdsArgs> thresholds;

    public Optional<Output<HostAnomaliesJavaOutOfThreadsThresholdsArgs>> thresholds() {
        return Optional.ofNullable(this.thresholds);
    }

    private HostAnomaliesJavaOutOfThreadsArgs() {}

    private HostAnomaliesJavaOutOfThreadsArgs(HostAnomaliesJavaOutOfThreadsArgs $) {
        this.enabled = $.enabled;
        this.thresholds = $.thresholds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostAnomaliesJavaOutOfThreadsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostAnomaliesJavaOutOfThreadsArgs $;

        public Builder() {
            $ = new HostAnomaliesJavaOutOfThreadsArgs();
        }

        public Builder(HostAnomaliesJavaOutOfThreadsArgs defaults) {
            $ = new HostAnomaliesJavaOutOfThreadsArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder thresholds(@Nullable Output<HostAnomaliesJavaOutOfThreadsThresholdsArgs> thresholds) {
            $.thresholds = thresholds;
            return this;
        }

        public Builder thresholds(HostAnomaliesJavaOutOfThreadsThresholdsArgs thresholds) {
            return thresholds(Output.of(thresholds));
        }

        public HostAnomaliesJavaOutOfThreadsArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
