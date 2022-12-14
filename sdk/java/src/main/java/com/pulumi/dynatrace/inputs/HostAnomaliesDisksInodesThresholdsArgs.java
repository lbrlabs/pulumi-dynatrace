// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class HostAnomaliesDisksInodesThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostAnomaliesDisksInodesThresholdsArgs Empty = new HostAnomaliesDisksInodesThresholdsArgs();

    @Import(name="percentage", required=true)
    private Output<Integer> percentage;

    public Output<Integer> percentage() {
        return this.percentage;
    }

    private HostAnomaliesDisksInodesThresholdsArgs() {}

    private HostAnomaliesDisksInodesThresholdsArgs(HostAnomaliesDisksInodesThresholdsArgs $) {
        this.percentage = $.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostAnomaliesDisksInodesThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostAnomaliesDisksInodesThresholdsArgs $;

        public Builder() {
            $ = new HostAnomaliesDisksInodesThresholdsArgs();
        }

        public Builder(HostAnomaliesDisksInodesThresholdsArgs defaults) {
            $ = new HostAnomaliesDisksInodesThresholdsArgs(Objects.requireNonNull(defaults));
        }

        public Builder percentage(Output<Integer> percentage) {
            $.percentage = percentage;
            return this;
        }

        public Builder percentage(Integer percentage) {
            return percentage(Output.of(percentage));
        }

        public HostAnomaliesDisksInodesThresholdsArgs build() {
            $.percentage = Objects.requireNonNull($.percentage, "expected parameter 'percentage' to be non-null");
            return $;
        }
    }

}
