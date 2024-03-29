// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.MetricEventsQueryDefinitionDimensionFilterFilterArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricEventsQueryDefinitionDimensionFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricEventsQueryDefinitionDimensionFilterArgs Empty = new MetricEventsQueryDefinitionDimensionFilterArgs();

    @Import(name="filters")
    private @Nullable Output<List<MetricEventsQueryDefinitionDimensionFilterFilterArgs>> filters;

    public Optional<Output<List<MetricEventsQueryDefinitionDimensionFilterFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private MetricEventsQueryDefinitionDimensionFilterArgs() {}

    private MetricEventsQueryDefinitionDimensionFilterArgs(MetricEventsQueryDefinitionDimensionFilterArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricEventsQueryDefinitionDimensionFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricEventsQueryDefinitionDimensionFilterArgs $;

        public Builder() {
            $ = new MetricEventsQueryDefinitionDimensionFilterArgs();
        }

        public Builder(MetricEventsQueryDefinitionDimensionFilterArgs defaults) {
            $ = new MetricEventsQueryDefinitionDimensionFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<List<MetricEventsQueryDefinitionDimensionFilterFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<MetricEventsQueryDefinitionDimensionFilterFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(MetricEventsQueryDefinitionDimensionFilterFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public MetricEventsQueryDefinitionDimensionFilterArgs build() {
            return $;
        }
    }

}
