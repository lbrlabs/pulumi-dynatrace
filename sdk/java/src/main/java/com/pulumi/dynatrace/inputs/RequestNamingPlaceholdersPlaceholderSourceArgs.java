// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RequestNamingPlaceholdersPlaceholderSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RequestNamingPlaceholdersPlaceholderSourceArgs Empty = new RequestNamingPlaceholdersPlaceholderSourceArgs();

    @Import(name="managementZone")
    private @Nullable Output<String> managementZone;

    public Optional<Output<String>> managementZone() {
        return Optional.ofNullable(this.managementZone);
    }

    @Import(name="serviceTag")
    private @Nullable Output<RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs> serviceTag;

    public Optional<Output<RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs>> serviceTag() {
        return Optional.ofNullable(this.serviceTag);
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private RequestNamingPlaceholdersPlaceholderSourceArgs() {}

    private RequestNamingPlaceholdersPlaceholderSourceArgs(RequestNamingPlaceholdersPlaceholderSourceArgs $) {
        this.managementZone = $.managementZone;
        this.serviceTag = $.serviceTag;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RequestNamingPlaceholdersPlaceholderSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RequestNamingPlaceholdersPlaceholderSourceArgs $;

        public Builder() {
            $ = new RequestNamingPlaceholdersPlaceholderSourceArgs();
        }

        public Builder(RequestNamingPlaceholdersPlaceholderSourceArgs defaults) {
            $ = new RequestNamingPlaceholdersPlaceholderSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder managementZone(@Nullable Output<String> managementZone) {
            $.managementZone = managementZone;
            return this;
        }

        public Builder managementZone(String managementZone) {
            return managementZone(Output.of(managementZone));
        }

        public Builder serviceTag(@Nullable Output<RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs> serviceTag) {
            $.serviceTag = serviceTag;
            return this;
        }

        public Builder serviceTag(RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs serviceTag) {
            return serviceTag(Output.of(serviceTag));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public RequestNamingPlaceholdersPlaceholderSourceArgs build() {
            return $;
        }
    }

}
