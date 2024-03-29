// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.CustomTagsTagsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomTagsState extends com.pulumi.resources.ResourceArgs {

    public static final CustomTagsState Empty = new CustomTagsState();

    /**
     * For internal use: current state of tags in JSON format
     * 
     */
    @Import(name="currentState")
    private @Nullable Output<String> currentState;

    /**
     * @return For internal use: current state of tags in JSON format
     * 
     */
    public Optional<Output<String>> currentState() {
        return Optional.ofNullable(this.currentState);
    }

    /**
     * Specifies the entities where you want to update tags
     * 
     */
    @Import(name="entitySelector")
    private @Nullable Output<String> entitySelector;

    /**
     * @return Specifies the entities where you want to update tags
     * 
     */
    public Optional<Output<String>> entitySelector() {
        return Optional.ofNullable(this.entitySelector);
    }

    /**
     * The number of monitored entities where the tags have been added.
     * 
     */
    @Import(name="matchedEntities")
    private @Nullable Output<Integer> matchedEntities;

    /**
     * @return The number of monitored entities where the tags have been added.
     * 
     */
    public Optional<Output<Integer>> matchedEntities() {
        return Optional.ofNullable(this.matchedEntities);
    }

    /**
     * Specifies the entities where you want to update tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<CustomTagsTagsArgs> tags;

    /**
     * @return Specifies the entities where you want to update tags
     * 
     */
    public Optional<Output<CustomTagsTagsArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CustomTagsState() {}

    private CustomTagsState(CustomTagsState $) {
        this.currentState = $.currentState;
        this.entitySelector = $.entitySelector;
        this.matchedEntities = $.matchedEntities;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomTagsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomTagsState $;

        public Builder() {
            $ = new CustomTagsState();
        }

        public Builder(CustomTagsState defaults) {
            $ = new CustomTagsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param currentState For internal use: current state of tags in JSON format
         * 
         * @return builder
         * 
         */
        public Builder currentState(@Nullable Output<String> currentState) {
            $.currentState = currentState;
            return this;
        }

        /**
         * @param currentState For internal use: current state of tags in JSON format
         * 
         * @return builder
         * 
         */
        public Builder currentState(String currentState) {
            return currentState(Output.of(currentState));
        }

        /**
         * @param entitySelector Specifies the entities where you want to update tags
         * 
         * @return builder
         * 
         */
        public Builder entitySelector(@Nullable Output<String> entitySelector) {
            $.entitySelector = entitySelector;
            return this;
        }

        /**
         * @param entitySelector Specifies the entities where you want to update tags
         * 
         * @return builder
         * 
         */
        public Builder entitySelector(String entitySelector) {
            return entitySelector(Output.of(entitySelector));
        }

        /**
         * @param matchedEntities The number of monitored entities where the tags have been added.
         * 
         * @return builder
         * 
         */
        public Builder matchedEntities(@Nullable Output<Integer> matchedEntities) {
            $.matchedEntities = matchedEntities;
            return this;
        }

        /**
         * @param matchedEntities The number of monitored entities where the tags have been added.
         * 
         * @return builder
         * 
         */
        public Builder matchedEntities(Integer matchedEntities) {
            return matchedEntities(Output.of(matchedEntities));
        }

        /**
         * @param tags Specifies the entities where you want to update tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<CustomTagsTagsArgs> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Specifies the entities where you want to update tags
         * 
         * @return builder
         * 
         */
        public Builder tags(CustomTagsTagsArgs tags) {
            return tags(Output.of(tags));
        }

        public CustomTagsState build() {
            return $;
        }
    }

}
