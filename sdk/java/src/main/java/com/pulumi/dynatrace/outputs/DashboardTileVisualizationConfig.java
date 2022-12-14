// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DashboardTileVisualizationConfig {
    private @Nullable Boolean hasAxisBucketing;
    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    private @Nullable String unknowns;

    private DashboardTileVisualizationConfig() {}
    public Optional<Boolean> hasAxisBucketing() {
        return Optional.ofNullable(this.hasAxisBucketing);
    }
    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardTileVisualizationConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean hasAxisBucketing;
        private @Nullable String unknowns;
        public Builder() {}
        public Builder(DashboardTileVisualizationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasAxisBucketing = defaults.hasAxisBucketing;
    	      this.unknowns = defaults.unknowns;
        }

        @CustomType.Setter
        public Builder hasAxisBucketing(@Nullable Boolean hasAxisBucketing) {
            this.hasAxisBucketing = hasAxisBucketing;
            return this;
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        public DashboardTileVisualizationConfig build() {
            final var o = new DashboardTileVisualizationConfig();
            o.hasAxisBucketing = hasAxisBucketing;
            o.unknowns = unknowns;
            return o;
        }
    }
}
