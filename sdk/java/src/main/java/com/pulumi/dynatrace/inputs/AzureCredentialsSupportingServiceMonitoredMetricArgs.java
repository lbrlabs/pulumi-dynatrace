// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureCredentialsSupportingServiceMonitoredMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureCredentialsSupportingServiceMonitoredMetricArgs Empty = new AzureCredentialsSupportingServiceMonitoredMetricArgs();

    @Import(name="dimensions")
    private @Nullable Output<List<String>> dimensions;

    public Optional<Output<List<String>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Any attributes that aren&#39;t yet supported by this provider
     * 
     */
    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    /**
     * @return Any attributes that aren&#39;t yet supported by this provider
     * 
     */
    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private AzureCredentialsSupportingServiceMonitoredMetricArgs() {}

    private AzureCredentialsSupportingServiceMonitoredMetricArgs(AzureCredentialsSupportingServiceMonitoredMetricArgs $) {
        this.dimensions = $.dimensions;
        this.name = $.name;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureCredentialsSupportingServiceMonitoredMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureCredentialsSupportingServiceMonitoredMetricArgs $;

        public Builder() {
            $ = new AzureCredentialsSupportingServiceMonitoredMetricArgs();
        }

        public Builder(AzureCredentialsSupportingServiceMonitoredMetricArgs defaults) {
            $ = new AzureCredentialsSupportingServiceMonitoredMetricArgs(Objects.requireNonNull(defaults));
        }

        public Builder dimensions(@Nullable Output<List<String>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(List<String> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        public Builder dimensions(String... dimensions) {
            return dimensions(List.of(dimensions));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param unknowns Any attributes that aren&#39;t yet supported by this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        /**
         * @param unknowns Any attributes that aren&#39;t yet supported by this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public AzureCredentialsSupportingServiceMonitoredMetricArgs build() {
            return $;
        }
    }

}
