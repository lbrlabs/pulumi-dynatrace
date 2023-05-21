// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.GetEntitiesEntitiesEntityArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntitiesEntitiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetEntitiesEntitiesArgs Empty = new GetEntitiesEntitiesArgs();

    /**
     * A list of monitored entities.
     * 
     */
    @Import(name="entities")
    private @Nullable Output<List<GetEntitiesEntitiesEntityArgs>> entities;

    /**
     * @return A list of monitored entities.
     * 
     */
    public Optional<Output<List<GetEntitiesEntitiesEntityArgs>>> entities() {
        return Optional.ofNullable(this.entities);
    }

    private GetEntitiesEntitiesArgs() {}

    private GetEntitiesEntitiesArgs(GetEntitiesEntitiesArgs $) {
        this.entities = $.entities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEntitiesEntitiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEntitiesEntitiesArgs $;

        public Builder() {
            $ = new GetEntitiesEntitiesArgs();
        }

        public Builder(GetEntitiesEntitiesArgs defaults) {
            $ = new GetEntitiesEntitiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entities A list of monitored entities.
         * 
         * @return builder
         * 
         */
        public Builder entities(@Nullable Output<List<GetEntitiesEntitiesEntityArgs>> entities) {
            $.entities = entities;
            return this;
        }

        /**
         * @param entities A list of monitored entities.
         * 
         * @return builder
         * 
         */
        public Builder entities(List<GetEntitiesEntitiesEntityArgs> entities) {
            return entities(Output.of(entities));
        }

        /**
         * @param entities A list of monitored entities.
         * 
         * @return builder
         * 
         */
        public Builder entities(GetEntitiesEntitiesEntityArgs... entities) {
            return entities(List.of(entities));
        }

        public GetEntitiesEntitiesArgs build() {
            return $;
        }
    }

}