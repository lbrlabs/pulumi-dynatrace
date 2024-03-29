// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class VmwareAnomaliesEsxiHighCpuDetectionCustomThresholds {
    private Integer cpuPeakPercentage;
    private Integer cpuUsagePercentage;
    private Integer vmCpuReadyPercentage;

    private VmwareAnomaliesEsxiHighCpuDetectionCustomThresholds() {}
    public Integer cpuPeakPercentage() {
        return this.cpuPeakPercentage;
    }
    public Integer cpuUsagePercentage() {
        return this.cpuUsagePercentage;
    }
    public Integer vmCpuReadyPercentage() {
        return this.vmCpuReadyPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareAnomaliesEsxiHighCpuDetectionCustomThresholds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer cpuPeakPercentage;
        private Integer cpuUsagePercentage;
        private Integer vmCpuReadyPercentage;
        public Builder() {}
        public Builder(VmwareAnomaliesEsxiHighCpuDetectionCustomThresholds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuPeakPercentage = defaults.cpuPeakPercentage;
    	      this.cpuUsagePercentage = defaults.cpuUsagePercentage;
    	      this.vmCpuReadyPercentage = defaults.vmCpuReadyPercentage;
        }

        @CustomType.Setter
        public Builder cpuPeakPercentage(Integer cpuPeakPercentage) {
            this.cpuPeakPercentage = Objects.requireNonNull(cpuPeakPercentage);
            return this;
        }
        @CustomType.Setter
        public Builder cpuUsagePercentage(Integer cpuUsagePercentage) {
            this.cpuUsagePercentage = Objects.requireNonNull(cpuUsagePercentage);
            return this;
        }
        @CustomType.Setter
        public Builder vmCpuReadyPercentage(Integer vmCpuReadyPercentage) {
            this.vmCpuReadyPercentage = Objects.requireNonNull(vmCpuReadyPercentage);
            return this;
        }
        public VmwareAnomaliesEsxiHighCpuDetectionCustomThresholds build() {
            final var o = new VmwareAnomaliesEsxiHighCpuDetectionCustomThresholds();
            o.cpuPeakPercentage = cpuPeakPercentage;
            o.cpuUsagePercentage = cpuUsagePercentage;
            o.vmCpuReadyPercentage = vmCpuReadyPercentage;
            return o;
        }
    }
}
