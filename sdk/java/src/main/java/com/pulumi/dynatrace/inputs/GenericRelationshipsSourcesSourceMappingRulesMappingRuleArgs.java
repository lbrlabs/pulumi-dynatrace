// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GenericRelationshipsSourcesSourceMappingRulesMappingRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GenericRelationshipsSourcesSourceMappingRulesMappingRuleArgs Empty = new GenericRelationshipsSourcesSourceMappingRulesMappingRuleArgs();

    @Import(name="destinationProperty", required=true)
    private Output<String> destinationProperty;

    public Output<String> destinationProperty() {
        return this.destinationProperty;
    }

    @Import(name="destinationTransformation", required=true)
    private Output<String> destinationTransformation;

    public Output<String> destinationTransformation() {
        return this.destinationTransformation;
    }

    @Import(name="sourceProperty", required=true)
    private Output<String> sourceProperty;

    public Output<String> sourceProperty() {
        return this.sourceProperty;
    }

    @Import(name="sourceTransformation", required=true)
    private Output<String> sourceTransformation;

    public Output<String> sourceTransformation() {
        return this.sourceTransformation;
    }

    private GenericRelationshipsSourcesSourceMappingRulesMappingRuleArgs() {}

    private GenericRelationshipsSourcesSourceMappingRulesMappingRuleArgs(GenericRelationshipsSourcesSourceMappingRulesMappingRuleArgs $) {
        this.destinationProperty = $.destinationProperty;
        this.destinationTransformation = $.destinationTransformation;
        this.sourceProperty = $.sourceProperty;
        this.sourceTransformation = $.sourceTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GenericRelationshipsSourcesSourceMappingRulesMappingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GenericRelationshipsSourcesSourceMappingRulesMappingRuleArgs $;

        public Builder() {
            $ = new GenericRelationshipsSourcesSourceMappingRulesMappingRuleArgs();
        }

        public Builder(GenericRelationshipsSourcesSourceMappingRulesMappingRuleArgs defaults) {
            $ = new GenericRelationshipsSourcesSourceMappingRulesMappingRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinationProperty(Output<String> destinationProperty) {
            $.destinationProperty = destinationProperty;
            return this;
        }

        public Builder destinationProperty(String destinationProperty) {
            return destinationProperty(Output.of(destinationProperty));
        }

        public Builder destinationTransformation(Output<String> destinationTransformation) {
            $.destinationTransformation = destinationTransformation;
            return this;
        }

        public Builder destinationTransformation(String destinationTransformation) {
            return destinationTransformation(Output.of(destinationTransformation));
        }

        public Builder sourceProperty(Output<String> sourceProperty) {
            $.sourceProperty = sourceProperty;
            return this;
        }

        public Builder sourceProperty(String sourceProperty) {
            return sourceProperty(Output.of(sourceProperty));
        }

        public Builder sourceTransformation(Output<String> sourceTransformation) {
            $.sourceTransformation = sourceTransformation;
            return this;
        }

        public Builder sourceTransformation(String sourceTransformation) {
            return sourceTransformation(Output.of(sourceTransformation));
        }

        public GenericRelationshipsSourcesSourceMappingRulesMappingRuleArgs build() {
            $.destinationProperty = Objects.requireNonNull($.destinationProperty, "expected parameter 'destinationProperty' to be non-null");
            $.destinationTransformation = Objects.requireNonNull($.destinationTransformation, "expected parameter 'destinationTransformation' to be non-null");
            $.sourceProperty = Objects.requireNonNull($.sourceProperty, "expected parameter 'sourceProperty' to be non-null");
            $.sourceTransformation = Objects.requireNonNull($.sourceTransformation, "expected parameter 'sourceTransformation' to be non-null");
            return $;
        }
    }

}
