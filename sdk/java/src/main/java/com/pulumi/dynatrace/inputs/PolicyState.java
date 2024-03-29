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


public final class PolicyState extends com.pulumi.resources.ResourceArgs {

    public static final PolicyState Empty = new PolicyState();

    /**
     * The UUID of the cluster in case the policy should be applied to all environments of this cluster.
     * 
     */
    @Import(name="cluster")
    private @Nullable Output<String> cluster;

    /**
     * @return The UUID of the cluster in case the policy should be applied to all environments of this cluster.
     * 
     */
    public Optional<Output<String>> cluster() {
        return Optional.ofNullable(this.cluster);
    }

    /**
     * An optional description text for the policy
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description text for the policy
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the environment if the policy should be applied to a specific environment
     * 
     */
    @Import(name="environment")
    private @Nullable Output<String> environment;

    /**
     * @return The ID of the environment if the policy should be applied to a specific environment
     * 
     */
    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * The name of the policy
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the policy
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Statement Query of the policy
     * 
     */
    @Import(name="statementQuery")
    private @Nullable Output<String> statementQuery;

    /**
     * @return The Statement Query of the policy
     * 
     */
    public Optional<Output<String>> statementQuery() {
        return Optional.ofNullable(this.statementQuery);
    }

    /**
     * Tags for this policy
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags for this policy
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PolicyState() {}

    private PolicyState(PolicyState $) {
        this.cluster = $.cluster;
        this.description = $.description;
        this.environment = $.environment;
        this.name = $.name;
        this.statementQuery = $.statementQuery;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyState $;

        public Builder() {
            $ = new PolicyState();
        }

        public Builder(PolicyState defaults) {
            $ = new PolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cluster The UUID of the cluster in case the policy should be applied to all environments of this cluster.
         * 
         * @return builder
         * 
         */
        public Builder cluster(@Nullable Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster The UUID of the cluster in case the policy should be applied to all environments of this cluster.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param description An optional description text for the policy
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description text for the policy
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param environment The ID of the environment if the policy should be applied to a specific environment
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The ID of the environment if the policy should be applied to a specific environment
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param name The name of the policy
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the policy
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param statementQuery The Statement Query of the policy
         * 
         * @return builder
         * 
         */
        public Builder statementQuery(@Nullable Output<String> statementQuery) {
            $.statementQuery = statementQuery;
            return this;
        }

        /**
         * @param statementQuery The Statement Query of the policy
         * 
         * @return builder
         * 
         */
        public Builder statementQuery(String statementQuery) {
            return statementQuery(Output.of(statementQuery));
        }

        /**
         * @param tags Tags for this policy
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags for this policy
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags for this policy
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public PolicyState build() {
            return $;
        }
    }

}
