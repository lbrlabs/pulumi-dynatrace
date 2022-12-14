// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class HostAnomaliesDisksSpeedThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostAnomaliesDisksSpeedThresholdsArgs Empty = new HostAnomaliesDisksSpeedThresholdsArgs();

    @Import(name="writeAndReadTime", required=true)
    private Output<Integer> writeAndReadTime;

    public Output<Integer> writeAndReadTime() {
        return this.writeAndReadTime;
    }

    private HostAnomaliesDisksSpeedThresholdsArgs() {}

    private HostAnomaliesDisksSpeedThresholdsArgs(HostAnomaliesDisksSpeedThresholdsArgs $) {
        this.writeAndReadTime = $.writeAndReadTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostAnomaliesDisksSpeedThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostAnomaliesDisksSpeedThresholdsArgs $;

        public Builder() {
            $ = new HostAnomaliesDisksSpeedThresholdsArgs();
        }

        public Builder(HostAnomaliesDisksSpeedThresholdsArgs defaults) {
            $ = new HostAnomaliesDisksSpeedThresholdsArgs(Objects.requireNonNull(defaults));
        }

        public Builder writeAndReadTime(Output<Integer> writeAndReadTime) {
            $.writeAndReadTime = writeAndReadTime;
            return this;
        }

        public Builder writeAndReadTime(Integer writeAndReadTime) {
            return writeAndReadTime(Output.of(writeAndReadTime));
        }

        public HostAnomaliesDisksSpeedThresholdsArgs build() {
            $.writeAndReadTime = Objects.requireNonNull($.writeAndReadTime, "expected parameter 'writeAndReadTime' to be non-null");
            return $;
        }
    }

}
