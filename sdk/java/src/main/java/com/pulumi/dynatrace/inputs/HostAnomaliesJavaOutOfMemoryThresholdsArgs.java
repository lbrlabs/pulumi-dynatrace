// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class HostAnomaliesJavaOutOfMemoryThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostAnomaliesJavaOutOfMemoryThresholdsArgs Empty = new HostAnomaliesJavaOutOfMemoryThresholdsArgs();

    @Import(name="exceptionCount", required=true)
    private Output<Integer> exceptionCount;

    public Output<Integer> exceptionCount() {
        return this.exceptionCount;
    }

    private HostAnomaliesJavaOutOfMemoryThresholdsArgs() {}

    private HostAnomaliesJavaOutOfMemoryThresholdsArgs(HostAnomaliesJavaOutOfMemoryThresholdsArgs $) {
        this.exceptionCount = $.exceptionCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostAnomaliesJavaOutOfMemoryThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostAnomaliesJavaOutOfMemoryThresholdsArgs $;

        public Builder() {
            $ = new HostAnomaliesJavaOutOfMemoryThresholdsArgs();
        }

        public Builder(HostAnomaliesJavaOutOfMemoryThresholdsArgs defaults) {
            $ = new HostAnomaliesJavaOutOfMemoryThresholdsArgs(Objects.requireNonNull(defaults));
        }

        public Builder exceptionCount(Output<Integer> exceptionCount) {
            $.exceptionCount = exceptionCount;
            return this;
        }

        public Builder exceptionCount(Integer exceptionCount) {
            return exceptionCount(Output.of(exceptionCount));
        }

        public HostAnomaliesJavaOutOfMemoryThresholdsArgs build() {
            $.exceptionCount = Objects.requireNonNull($.exceptionCount, "expected parameter 'exceptionCount' to be non-null");
            return $;
        }
    }

}
