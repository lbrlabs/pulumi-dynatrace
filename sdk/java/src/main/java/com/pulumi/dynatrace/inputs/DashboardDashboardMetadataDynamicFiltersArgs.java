// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.DashboardDashboardMetadataDynamicFiltersGenericTagFiltersArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardDashboardMetadataDynamicFiltersArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardDashboardMetadataDynamicFiltersArgs Empty = new DashboardDashboardMetadataDynamicFiltersArgs();

    @Import(name="filters", required=true)
    private Output<List<String>> filters;

    public Output<List<String>> filters() {
        return this.filters;
    }

    @Import(name="genericTagFilters")
    private @Nullable Output<DashboardDashboardMetadataDynamicFiltersGenericTagFiltersArgs> genericTagFilters;

    public Optional<Output<DashboardDashboardMetadataDynamicFiltersGenericTagFiltersArgs>> genericTagFilters() {
        return Optional.ofNullable(this.genericTagFilters);
    }

    @Import(name="tagSuggestionTypes")
    private @Nullable Output<List<String>> tagSuggestionTypes;

    public Optional<Output<List<String>>> tagSuggestionTypes() {
        return Optional.ofNullable(this.tagSuggestionTypes);
    }

    /**
     * allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private DashboardDashboardMetadataDynamicFiltersArgs() {}

    private DashboardDashboardMetadataDynamicFiltersArgs(DashboardDashboardMetadataDynamicFiltersArgs $) {
        this.filters = $.filters;
        this.genericTagFilters = $.genericTagFilters;
        this.tagSuggestionTypes = $.tagSuggestionTypes;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardDashboardMetadataDynamicFiltersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardDashboardMetadataDynamicFiltersArgs $;

        public Builder() {
            $ = new DashboardDashboardMetadataDynamicFiltersArgs();
        }

        public Builder(DashboardDashboardMetadataDynamicFiltersArgs defaults) {
            $ = new DashboardDashboardMetadataDynamicFiltersArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(Output<List<String>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<String> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }

        public Builder genericTagFilters(@Nullable Output<DashboardDashboardMetadataDynamicFiltersGenericTagFiltersArgs> genericTagFilters) {
            $.genericTagFilters = genericTagFilters;
            return this;
        }

        public Builder genericTagFilters(DashboardDashboardMetadataDynamicFiltersGenericTagFiltersArgs genericTagFilters) {
            return genericTagFilters(Output.of(genericTagFilters));
        }

        public Builder tagSuggestionTypes(@Nullable Output<List<String>> tagSuggestionTypes) {
            $.tagSuggestionTypes = tagSuggestionTypes;
            return this;
        }

        public Builder tagSuggestionTypes(List<String> tagSuggestionTypes) {
            return tagSuggestionTypes(Output.of(tagSuggestionTypes));
        }

        public Builder tagSuggestionTypes(String... tagSuggestionTypes) {
            return tagSuggestionTypes(List.of(tagSuggestionTypes));
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public DashboardDashboardMetadataDynamicFiltersArgs build() {
            $.filters = Objects.requireNonNull($.filters, "expected parameter 'filters' to be non-null");
            return $;
        }
    }

}
