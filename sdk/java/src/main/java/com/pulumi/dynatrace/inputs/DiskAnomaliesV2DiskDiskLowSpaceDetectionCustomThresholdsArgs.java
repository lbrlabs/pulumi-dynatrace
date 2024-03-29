// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class DiskAnomaliesV2DiskDiskLowSpaceDetectionCustomThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskAnomaliesV2DiskDiskLowSpaceDetectionCustomThresholdsArgs Empty = new DiskAnomaliesV2DiskDiskLowSpaceDetectionCustomThresholdsArgs();

    @Import(name="freeSpacePercentage", required=true)
    private Output<Integer> freeSpacePercentage;

    public Output<Integer> freeSpacePercentage() {
        return this.freeSpacePercentage;
    }

    private DiskAnomaliesV2DiskDiskLowSpaceDetectionCustomThresholdsArgs() {}

    private DiskAnomaliesV2DiskDiskLowSpaceDetectionCustomThresholdsArgs(DiskAnomaliesV2DiskDiskLowSpaceDetectionCustomThresholdsArgs $) {
        this.freeSpacePercentage = $.freeSpacePercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskAnomaliesV2DiskDiskLowSpaceDetectionCustomThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskAnomaliesV2DiskDiskLowSpaceDetectionCustomThresholdsArgs $;

        public Builder() {
            $ = new DiskAnomaliesV2DiskDiskLowSpaceDetectionCustomThresholdsArgs();
        }

        public Builder(DiskAnomaliesV2DiskDiskLowSpaceDetectionCustomThresholdsArgs defaults) {
            $ = new DiskAnomaliesV2DiskDiskLowSpaceDetectionCustomThresholdsArgs(Objects.requireNonNull(defaults));
        }

        public Builder freeSpacePercentage(Output<Integer> freeSpacePercentage) {
            $.freeSpacePercentage = freeSpacePercentage;
            return this;
        }

        public Builder freeSpacePercentage(Integer freeSpacePercentage) {
            return freeSpacePercentage(Output.of(freeSpacePercentage));
        }

        public DiskAnomaliesV2DiskDiskLowSpaceDetectionCustomThresholdsArgs build() {
            $.freeSpacePercentage = Objects.requireNonNull($.freeSpacePercentage, "expected parameter 'freeSpacePercentage' to be non-null");
            return $;
        }
    }

}
