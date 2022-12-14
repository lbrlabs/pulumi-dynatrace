// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureCredentialsSupportingServiceMonitoredMetric {
    private @Nullable List<String> dimensions;
    private @Nullable String name;
    /**
     * @return Any attributes that aren&#39;t yet supported by this provider
     * 
     */
    private @Nullable String unknowns;

    private AzureCredentialsSupportingServiceMonitoredMetric() {}
    public List<String> dimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Any attributes that aren&#39;t yet supported by this provider
     * 
     */
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureCredentialsSupportingServiceMonitoredMetric defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> dimensions;
        private @Nullable String name;
        private @Nullable String unknowns;
        public Builder() {}
        public Builder(AzureCredentialsSupportingServiceMonitoredMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.name = defaults.name;
    	      this.unknowns = defaults.unknowns;
        }

        @CustomType.Setter
        public Builder dimensions(@Nullable List<String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(String... dimensions) {
            return dimensions(List.of(dimensions));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        public AzureCredentialsSupportingServiceMonitoredMetric build() {
            final var o = new AzureCredentialsSupportingServiceMonitoredMetric();
            o.dimensions = dimensions;
            o.name = name;
            o.unknowns = unknowns;
            return o;
        }
    }
}
