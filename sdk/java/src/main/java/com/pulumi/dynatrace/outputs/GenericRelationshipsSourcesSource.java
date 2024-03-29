// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.GenericRelationshipsSourcesSourceMappingRules;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GenericRelationshipsSourcesSource {
    private @Nullable String condition;
    private @Nullable GenericRelationshipsSourcesSourceMappingRules mappingRules;
    private String sourceType;

    private GenericRelationshipsSourcesSource() {}
    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    public Optional<GenericRelationshipsSourcesSourceMappingRules> mappingRules() {
        return Optional.ofNullable(this.mappingRules);
    }
    public String sourceType() {
        return this.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericRelationshipsSourcesSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String condition;
        private @Nullable GenericRelationshipsSourcesSourceMappingRules mappingRules;
        private String sourceType;
        public Builder() {}
        public Builder(GenericRelationshipsSourcesSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.mappingRules = defaults.mappingRules;
    	      this.sourceType = defaults.sourceType;
        }

        @CustomType.Setter
        public Builder condition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder mappingRules(@Nullable GenericRelationshipsSourcesSourceMappingRules mappingRules) {
            this.mappingRules = mappingRules;
            return this;
        }
        @CustomType.Setter
        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        public GenericRelationshipsSourcesSource build() {
            final var o = new GenericRelationshipsSourcesSource();
            o.condition = condition;
            o.mappingRules = mappingRules;
            o.sourceType = sourceType;
            return o;
        }
    }
}
