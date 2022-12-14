// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholderArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs extends com.pulumi.resources.ResourceArgs {

    public static final CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs Empty = new CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs();

    @Import(name="placeholders")
    private @Nullable Output<List<CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholderArgs>> placeholders;

    public Optional<Output<List<CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholderArgs>>> placeholders() {
        return Optional.ofNullable(this.placeholders);
    }

    private CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs() {}

    private CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs(CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs $) {
        this.placeholders = $.placeholders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs $;

        public Builder() {
            $ = new CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs();
        }

        public Builder(CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs defaults) {
            $ = new CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs(Objects.requireNonNull(defaults));
        }

        public Builder placeholders(@Nullable Output<List<CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholderArgs>> placeholders) {
            $.placeholders = placeholders;
            return this;
        }

        public Builder placeholders(List<CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholderArgs> placeholders) {
            return placeholders(Output.of(placeholders));
        }

        public Builder placeholders(CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholderArgs... placeholders) {
            return placeholders(List.of(placeholders));
        }

        public CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs build() {
            return $;
        }
    }

}
