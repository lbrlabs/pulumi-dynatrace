// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CalculatedServiceMetricDimensionDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CalculatedServiceMetricDimensionDefinitionArgs Empty = new CalculatedServiceMetricDimensionDefinitionArgs();

    @Import(name="dimension", required=true)
    private Output<String> dimension;

    public Output<String> dimension() {
        return this.dimension;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="placeholders")
    private @Nullable Output<CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs> placeholders;

    public Optional<Output<CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs>> placeholders() {
        return Optional.ofNullable(this.placeholders);
    }

    @Import(name="topX", required=true)
    private Output<Integer> topX;

    public Output<Integer> topX() {
        return this.topX;
    }

    @Import(name="topXAggregation", required=true)
    private Output<String> topXAggregation;

    public Output<String> topXAggregation() {
        return this.topXAggregation;
    }

    @Import(name="topXDirection", required=true)
    private Output<String> topXDirection;

    public Output<String> topXDirection() {
        return this.topXDirection;
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private CalculatedServiceMetricDimensionDefinitionArgs() {}

    private CalculatedServiceMetricDimensionDefinitionArgs(CalculatedServiceMetricDimensionDefinitionArgs $) {
        this.dimension = $.dimension;
        this.name = $.name;
        this.placeholders = $.placeholders;
        this.topX = $.topX;
        this.topXAggregation = $.topXAggregation;
        this.topXDirection = $.topXDirection;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CalculatedServiceMetricDimensionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CalculatedServiceMetricDimensionDefinitionArgs $;

        public Builder() {
            $ = new CalculatedServiceMetricDimensionDefinitionArgs();
        }

        public Builder(CalculatedServiceMetricDimensionDefinitionArgs defaults) {
            $ = new CalculatedServiceMetricDimensionDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder dimension(Output<String> dimension) {
            $.dimension = dimension;
            return this;
        }

        public Builder dimension(String dimension) {
            return dimension(Output.of(dimension));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder placeholders(@Nullable Output<CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs> placeholders) {
            $.placeholders = placeholders;
            return this;
        }

        public Builder placeholders(CalculatedServiceMetricDimensionDefinitionPlaceholdersArgs placeholders) {
            return placeholders(Output.of(placeholders));
        }

        public Builder topX(Output<Integer> topX) {
            $.topX = topX;
            return this;
        }

        public Builder topX(Integer topX) {
            return topX(Output.of(topX));
        }

        public Builder topXAggregation(Output<String> topXAggregation) {
            $.topXAggregation = topXAggregation;
            return this;
        }

        public Builder topXAggregation(String topXAggregation) {
            return topXAggregation(Output.of(topXAggregation));
        }

        public Builder topXDirection(Output<String> topXDirection) {
            $.topXDirection = topXDirection;
            return this;
        }

        public Builder topXDirection(String topXDirection) {
            return topXDirection(Output.of(topXDirection));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public CalculatedServiceMetricDimensionDefinitionArgs build() {
            $.dimension = Objects.requireNonNull($.dimension, "expected parameter 'dimension' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.topX = Objects.requireNonNull($.topX, "expected parameter 'topX' to be non-null");
            $.topXAggregation = Objects.requireNonNull($.topXAggregation, "expected parameter 'topXAggregation' to be non-null");
            $.topXDirection = Objects.requireNonNull($.topXDirection, "expected parameter 'topXDirection' to be non-null");
            return $;
        }
    }

}
