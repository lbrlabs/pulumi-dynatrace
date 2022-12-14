// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.MaintenanceFilterFilterArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MaintenanceFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceFilterArgs Empty = new MaintenanceFilterArgs();

    /**
     * A list of matching rules for dynamic filter formation.  If several rules are set, the OR logic applies
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<MaintenanceFilterFilterArgs>> filters;

    /**
     * @return A list of matching rules for dynamic filter formation.  If several rules are set, the OR logic applies
     * 
     */
    public Optional<Output<List<MaintenanceFilterFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private MaintenanceFilterArgs() {}

    private MaintenanceFilterArgs(MaintenanceFilterArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceFilterArgs $;

        public Builder() {
            $ = new MaintenanceFilterArgs();
        }

        public Builder(MaintenanceFilterArgs defaults) {
            $ = new MaintenanceFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A list of matching rules for dynamic filter formation.  If several rules are set, the OR logic applies
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<MaintenanceFilterFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A list of matching rules for dynamic filter formation.  If several rules are set, the OR logic applies
         * 
         * @return builder
         * 
         */
        public Builder filters(List<MaintenanceFilterFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A list of matching rules for dynamic filter formation.  If several rules are set, the OR logic applies
         * 
         * @return builder
         * 
         */
        public Builder filters(MaintenanceFilterFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public MaintenanceFilterArgs build() {
            return $;
        }
    }

}
