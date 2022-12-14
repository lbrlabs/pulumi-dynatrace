// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class HostAnomaliesMemoryThresholdsWindowsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostAnomaliesMemoryThresholdsWindowsArgs Empty = new HostAnomaliesMemoryThresholdsWindowsArgs();

    @Import(name="pageFaults", required=true)
    private Output<Integer> pageFaults;

    public Output<Integer> pageFaults() {
        return this.pageFaults;
    }

    @Import(name="usage", required=true)
    private Output<Integer> usage;

    public Output<Integer> usage() {
        return this.usage;
    }

    private HostAnomaliesMemoryThresholdsWindowsArgs() {}

    private HostAnomaliesMemoryThresholdsWindowsArgs(HostAnomaliesMemoryThresholdsWindowsArgs $) {
        this.pageFaults = $.pageFaults;
        this.usage = $.usage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostAnomaliesMemoryThresholdsWindowsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostAnomaliesMemoryThresholdsWindowsArgs $;

        public Builder() {
            $ = new HostAnomaliesMemoryThresholdsWindowsArgs();
        }

        public Builder(HostAnomaliesMemoryThresholdsWindowsArgs defaults) {
            $ = new HostAnomaliesMemoryThresholdsWindowsArgs(Objects.requireNonNull(defaults));
        }

        public Builder pageFaults(Output<Integer> pageFaults) {
            $.pageFaults = pageFaults;
            return this;
        }

        public Builder pageFaults(Integer pageFaults) {
            return pageFaults(Output.of(pageFaults));
        }

        public Builder usage(Output<Integer> usage) {
            $.usage = usage;
            return this;
        }

        public Builder usage(Integer usage) {
            return usage(Output.of(usage));
        }

        public HostAnomaliesMemoryThresholdsWindowsArgs build() {
            $.pageFaults = Objects.requireNonNull($.pageFaults, "expected parameter 'pageFaults' to be non-null");
            $.usage = Objects.requireNonNull($.usage, "expected parameter 'usage' to be non-null");
            return $;
        }
    }

}
