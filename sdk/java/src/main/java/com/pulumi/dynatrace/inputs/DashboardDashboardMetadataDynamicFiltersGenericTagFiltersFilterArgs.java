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


public final class DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterArgs Empty = new DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterArgs();

    @Import(name="entityTypes", required=true)
    private Output<List<String>> entityTypes;

    public Output<List<String>> entityTypes() {
        return this.entityTypes;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="suggestionsFromEntityType")
    private @Nullable Output<String> suggestionsFromEntityType;

    public Optional<Output<String>> suggestionsFromEntityType() {
        return Optional.ofNullable(this.suggestionsFromEntityType);
    }

    @Import(name="tagKey")
    private @Nullable Output<String> tagKey;

    public Optional<Output<String>> tagKey() {
        return Optional.ofNullable(this.tagKey);
    }

    private DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterArgs() {}

    private DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterArgs(DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterArgs $) {
        this.entityTypes = $.entityTypes;
        this.name = $.name;
        this.suggestionsFromEntityType = $.suggestionsFromEntityType;
        this.tagKey = $.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterArgs $;

        public Builder() {
            $ = new DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterArgs();
        }

        public Builder(DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterArgs defaults) {
            $ = new DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder entityTypes(Output<List<String>> entityTypes) {
            $.entityTypes = entityTypes;
            return this;
        }

        public Builder entityTypes(List<String> entityTypes) {
            return entityTypes(Output.of(entityTypes));
        }

        public Builder entityTypes(String... entityTypes) {
            return entityTypes(List.of(entityTypes));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder suggestionsFromEntityType(@Nullable Output<String> suggestionsFromEntityType) {
            $.suggestionsFromEntityType = suggestionsFromEntityType;
            return this;
        }

        public Builder suggestionsFromEntityType(String suggestionsFromEntityType) {
            return suggestionsFromEntityType(Output.of(suggestionsFromEntityType));
        }

        public Builder tagKey(@Nullable Output<String> tagKey) {
            $.tagKey = tagKey;
            return this;
        }

        public Builder tagKey(String tagKey) {
            return tagKey(Output.of(tagKey));
        }

        public DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterArgs build() {
            $.entityTypes = Objects.requireNonNull($.entityTypes, "expected parameter 'entityTypes' to be non-null");
            return $;
        }
    }

}
