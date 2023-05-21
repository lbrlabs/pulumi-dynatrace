// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class AwsAnomaliesRdsHighCpuDetectionCustomThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsAnomaliesRdsHighCpuDetectionCustomThresholdsArgs Empty = new AwsAnomaliesRdsHighCpuDetectionCustomThresholdsArgs();

    @Import(name="cpuUsage", required=true)
    private Output<Double> cpuUsage;

    public Output<Double> cpuUsage() {
        return this.cpuUsage;
    }

    private AwsAnomaliesRdsHighCpuDetectionCustomThresholdsArgs() {}

    private AwsAnomaliesRdsHighCpuDetectionCustomThresholdsArgs(AwsAnomaliesRdsHighCpuDetectionCustomThresholdsArgs $) {
        this.cpuUsage = $.cpuUsage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsAnomaliesRdsHighCpuDetectionCustomThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsAnomaliesRdsHighCpuDetectionCustomThresholdsArgs $;

        public Builder() {
            $ = new AwsAnomaliesRdsHighCpuDetectionCustomThresholdsArgs();
        }

        public Builder(AwsAnomaliesRdsHighCpuDetectionCustomThresholdsArgs defaults) {
            $ = new AwsAnomaliesRdsHighCpuDetectionCustomThresholdsArgs(Objects.requireNonNull(defaults));
        }

        public Builder cpuUsage(Output<Double> cpuUsage) {
            $.cpuUsage = cpuUsage;
            return this;
        }

        public Builder cpuUsage(Double cpuUsage) {
            return cpuUsage(Output.of(cpuUsage));
        }

        public AwsAnomaliesRdsHighCpuDetectionCustomThresholdsArgs build() {
            $.cpuUsage = Objects.requireNonNull($.cpuUsage, "expected parameter 'cpuUsage' to be non-null");
            return $;
        }
    }

}