// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class VmwareAnomaliesOverloadedStorageDetectionCustomThresholds {
    private Integer commandAbortsNumber;

    private VmwareAnomaliesOverloadedStorageDetectionCustomThresholds() {}
    public Integer commandAbortsNumber() {
        return this.commandAbortsNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareAnomaliesOverloadedStorageDetectionCustomThresholds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer commandAbortsNumber;
        public Builder() {}
        public Builder(VmwareAnomaliesOverloadedStorageDetectionCustomThresholds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandAbortsNumber = defaults.commandAbortsNumber;
        }

        @CustomType.Setter
        public Builder commandAbortsNumber(Integer commandAbortsNumber) {
            this.commandAbortsNumber = Objects.requireNonNull(commandAbortsNumber);
            return this;
        }
        public VmwareAnomaliesOverloadedStorageDetectionCustomThresholds build() {
            final var o = new VmwareAnomaliesOverloadedStorageDetectionCustomThresholds();
            o.commandAbortsNumber = commandAbortsNumber;
            return o;
        }
    }
}
