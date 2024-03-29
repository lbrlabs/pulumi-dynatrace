// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.CustomTagsTagsFilterArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomTagsTagsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomTagsTagsArgs Empty = new CustomTagsTagsArgs();

    /**
     * A Tag Filter
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<CustomTagsTagsFilterArgs>> filters;

    /**
     * @return A Tag Filter
     * 
     */
    public Optional<Output<List<CustomTagsTagsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private CustomTagsTagsArgs() {}

    private CustomTagsTagsArgs(CustomTagsTagsArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomTagsTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomTagsTagsArgs $;

        public Builder() {
            $ = new CustomTagsTagsArgs();
        }

        public Builder(CustomTagsTagsArgs defaults) {
            $ = new CustomTagsTagsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters A Tag Filter
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<CustomTagsTagsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A Tag Filter
         * 
         * @return builder
         * 
         */
        public Builder filters(List<CustomTagsTagsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A Tag Filter
         * 
         * @return builder
         * 
         */
        public Builder filters(CustomTagsTagsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public CustomTagsTagsArgs build() {
            return $;
        }
    }

}
