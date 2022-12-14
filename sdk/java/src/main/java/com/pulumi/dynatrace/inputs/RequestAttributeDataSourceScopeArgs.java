// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RequestAttributeDataSourceScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final RequestAttributeDataSourceScopeArgs Empty = new RequestAttributeDataSourceScopeArgs();

    @Import(name="hostGroup")
    private @Nullable Output<String> hostGroup;

    public Optional<Output<String>> hostGroup() {
        return Optional.ofNullable(this.hostGroup);
    }

    @Import(name="processGroup")
    private @Nullable Output<String> processGroup;

    public Optional<Output<String>> processGroup() {
        return Optional.ofNullable(this.processGroup);
    }

    @Import(name="serviceTechnology")
    private @Nullable Output<String> serviceTechnology;

    public Optional<Output<String>> serviceTechnology() {
        return Optional.ofNullable(this.serviceTechnology);
    }

    @Import(name="tagOfProcessGroup")
    private @Nullable Output<String> tagOfProcessGroup;

    public Optional<Output<String>> tagOfProcessGroup() {
        return Optional.ofNullable(this.tagOfProcessGroup);
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

    private RequestAttributeDataSourceScopeArgs() {}

    private RequestAttributeDataSourceScopeArgs(RequestAttributeDataSourceScopeArgs $) {
        this.hostGroup = $.hostGroup;
        this.processGroup = $.processGroup;
        this.serviceTechnology = $.serviceTechnology;
        this.tagOfProcessGroup = $.tagOfProcessGroup;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RequestAttributeDataSourceScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RequestAttributeDataSourceScopeArgs $;

        public Builder() {
            $ = new RequestAttributeDataSourceScopeArgs();
        }

        public Builder(RequestAttributeDataSourceScopeArgs defaults) {
            $ = new RequestAttributeDataSourceScopeArgs(Objects.requireNonNull(defaults));
        }

        public Builder hostGroup(@Nullable Output<String> hostGroup) {
            $.hostGroup = hostGroup;
            return this;
        }

        public Builder hostGroup(String hostGroup) {
            return hostGroup(Output.of(hostGroup));
        }

        public Builder processGroup(@Nullable Output<String> processGroup) {
            $.processGroup = processGroup;
            return this;
        }

        public Builder processGroup(String processGroup) {
            return processGroup(Output.of(processGroup));
        }

        public Builder serviceTechnology(@Nullable Output<String> serviceTechnology) {
            $.serviceTechnology = serviceTechnology;
            return this;
        }

        public Builder serviceTechnology(String serviceTechnology) {
            return serviceTechnology(Output.of(serviceTechnology));
        }

        public Builder tagOfProcessGroup(@Nullable Output<String> tagOfProcessGroup) {
            $.tagOfProcessGroup = tagOfProcessGroup;
            return this;
        }

        public Builder tagOfProcessGroup(String tagOfProcessGroup) {
            return tagOfProcessGroup(Output.of(tagOfProcessGroup));
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

        public RequestAttributeDataSourceScopeArgs build() {
            return $;
        }
    }

}
