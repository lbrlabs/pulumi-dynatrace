// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class HostAnomaliesJavaOutOfMemoryThresholds {
    private Integer exceptionCount;

    private HostAnomaliesJavaOutOfMemoryThresholds() {}
    public Integer exceptionCount() {
        return this.exceptionCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostAnomaliesJavaOutOfMemoryThresholds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer exceptionCount;
        public Builder() {}
        public Builder(HostAnomaliesJavaOutOfMemoryThresholds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exceptionCount = defaults.exceptionCount;
        }

        @CustomType.Setter
        public Builder exceptionCount(Integer exceptionCount) {
            this.exceptionCount = Objects.requireNonNull(exceptionCount);
            return this;
        }
        public HostAnomaliesJavaOutOfMemoryThresholds build() {
            final var o = new HostAnomaliesJavaOutOfMemoryThresholds();
            o.exceptionCount = exceptionCount;
            return o;
        }
    }
}
