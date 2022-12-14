// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.DashboardTileFilterConfigFiltersFilterMatchArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardTileFilterConfigFiltersFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardTileFilterConfigFiltersFilterArgs Empty = new DashboardTileFilterConfigFiltersFilterArgs();

    @Import(name="entityType", required=true)
    private Output<String> entityType;

    public Output<String> entityType() {
        return this.entityType;
    }

    @Import(name="matches")
    private @Nullable Output<List<DashboardTileFilterConfigFiltersFilterMatchArgs>> matches;

    public Optional<Output<List<DashboardTileFilterConfigFiltersFilterMatchArgs>>> matches() {
        return Optional.ofNullable(this.matches);
    }

    private DashboardTileFilterConfigFiltersFilterArgs() {}

    private DashboardTileFilterConfigFiltersFilterArgs(DashboardTileFilterConfigFiltersFilterArgs $) {
        this.entityType = $.entityType;
        this.matches = $.matches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardTileFilterConfigFiltersFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardTileFilterConfigFiltersFilterArgs $;

        public Builder() {
            $ = new DashboardTileFilterConfigFiltersFilterArgs();
        }

        public Builder(DashboardTileFilterConfigFiltersFilterArgs defaults) {
            $ = new DashboardTileFilterConfigFiltersFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder entityType(Output<String> entityType) {
            $.entityType = entityType;
            return this;
        }

        public Builder entityType(String entityType) {
            return entityType(Output.of(entityType));
        }

        public Builder matches(@Nullable Output<List<DashboardTileFilterConfigFiltersFilterMatchArgs>> matches) {
            $.matches = matches;
            return this;
        }

        public Builder matches(List<DashboardTileFilterConfigFiltersFilterMatchArgs> matches) {
            return matches(Output.of(matches));
        }

        public Builder matches(DashboardTileFilterConfigFiltersFilterMatchArgs... matches) {
            return matches(List.of(matches));
        }

        public DashboardTileFilterConfigFiltersFilterArgs build() {
            $.entityType = Objects.requireNonNull($.entityType, "expected parameter 'entityType' to be non-null");
            return $;
        }
    }

}
