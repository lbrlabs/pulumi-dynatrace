// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.CalculatedServiceMetricConditionConditionComparisonArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CalculatedServiceMetricConditionConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CalculatedServiceMetricConditionConditionArgs Empty = new CalculatedServiceMetricConditionConditionArgs();

    @Import(name="attribute", required=true)
    private Output<String> attribute;

    public Output<String> attribute() {
        return this.attribute;
    }

    @Import(name="comparison", required=true)
    private Output<CalculatedServiceMetricConditionConditionComparisonArgs> comparison;

    public Output<CalculatedServiceMetricConditionConditionComparisonArgs> comparison() {
        return this.comparison;
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private CalculatedServiceMetricConditionConditionArgs() {}

    private CalculatedServiceMetricConditionConditionArgs(CalculatedServiceMetricConditionConditionArgs $) {
        this.attribute = $.attribute;
        this.comparison = $.comparison;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CalculatedServiceMetricConditionConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CalculatedServiceMetricConditionConditionArgs $;

        public Builder() {
            $ = new CalculatedServiceMetricConditionConditionArgs();
        }

        public Builder(CalculatedServiceMetricConditionConditionArgs defaults) {
            $ = new CalculatedServiceMetricConditionConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder attribute(Output<String> attribute) {
            $.attribute = attribute;
            return this;
        }

        public Builder attribute(String attribute) {
            return attribute(Output.of(attribute));
        }

        public Builder comparison(Output<CalculatedServiceMetricConditionConditionComparisonArgs> comparison) {
            $.comparison = comparison;
            return this;
        }

        public Builder comparison(CalculatedServiceMetricConditionConditionComparisonArgs comparison) {
            return comparison(Output.of(comparison));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public CalculatedServiceMetricConditionConditionArgs build() {
            $.attribute = Objects.requireNonNull($.attribute, "expected parameter 'attribute' to be non-null");
            $.comparison = Objects.requireNonNull($.comparison, "expected parameter 'comparison' to be non-null");
            return $;
        }
    }

}
