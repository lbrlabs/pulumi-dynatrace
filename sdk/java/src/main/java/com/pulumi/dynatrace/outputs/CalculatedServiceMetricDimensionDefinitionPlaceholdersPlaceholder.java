// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholderSource;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholder {
    private @Nullable String aggregation;
    private String attribute;
    private @Nullable String delimiterOrRegex;
    private @Nullable String endDelimiter;
    private String kind;
    private String name;
    private @Nullable String normalization;
    private @Nullable String requestAttribute;
    private @Nullable CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholderSource source;
    private @Nullable String unknowns;
    private @Nullable Boolean useFromChildCalls;

    private CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholder() {}
    public Optional<String> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }
    public String attribute() {
        return this.attribute;
    }
    public Optional<String> delimiterOrRegex() {
        return Optional.ofNullable(this.delimiterOrRegex);
    }
    public Optional<String> endDelimiter() {
        return Optional.ofNullable(this.endDelimiter);
    }
    public String kind() {
        return this.kind;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> normalization() {
        return Optional.ofNullable(this.normalization);
    }
    public Optional<String> requestAttribute() {
        return Optional.ofNullable(this.requestAttribute);
    }
    public Optional<CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholderSource> source() {
        return Optional.ofNullable(this.source);
    }
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }
    public Optional<Boolean> useFromChildCalls() {
        return Optional.ofNullable(this.useFromChildCalls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholder defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aggregation;
        private String attribute;
        private @Nullable String delimiterOrRegex;
        private @Nullable String endDelimiter;
        private String kind;
        private String name;
        private @Nullable String normalization;
        private @Nullable String requestAttribute;
        private @Nullable CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholderSource source;
        private @Nullable String unknowns;
        private @Nullable Boolean useFromChildCalls;
        public Builder() {}
        public Builder(CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.attribute = defaults.attribute;
    	      this.delimiterOrRegex = defaults.delimiterOrRegex;
    	      this.endDelimiter = defaults.endDelimiter;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.normalization = defaults.normalization;
    	      this.requestAttribute = defaults.requestAttribute;
    	      this.source = defaults.source;
    	      this.unknowns = defaults.unknowns;
    	      this.useFromChildCalls = defaults.useFromChildCalls;
        }

        @CustomType.Setter
        public Builder aggregation(@Nullable String aggregation) {
            this.aggregation = aggregation;
            return this;
        }
        @CustomType.Setter
        public Builder attribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }
        @CustomType.Setter
        public Builder delimiterOrRegex(@Nullable String delimiterOrRegex) {
            this.delimiterOrRegex = delimiterOrRegex;
            return this;
        }
        @CustomType.Setter
        public Builder endDelimiter(@Nullable String endDelimiter) {
            this.endDelimiter = endDelimiter;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder normalization(@Nullable String normalization) {
            this.normalization = normalization;
            return this;
        }
        @CustomType.Setter
        public Builder requestAttribute(@Nullable String requestAttribute) {
            this.requestAttribute = requestAttribute;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholderSource source) {
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        @CustomType.Setter
        public Builder useFromChildCalls(@Nullable Boolean useFromChildCalls) {
            this.useFromChildCalls = useFromChildCalls;
            return this;
        }
        public CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholder build() {
            final var o = new CalculatedServiceMetricDimensionDefinitionPlaceholdersPlaceholder();
            o.aggregation = aggregation;
            o.attribute = attribute;
            o.delimiterOrRegex = delimiterOrRegex;
            o.endDelimiter = endDelimiter;
            o.kind = kind;
            o.name = name;
            o.normalization = normalization;
            o.requestAttribute = requestAttribute;
            o.source = source;
            o.unknowns = unknowns;
            o.useFromChildCalls = useFromChildCalls;
            return o;
        }
    }
}
