// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorTransformationsArgs;
import com.pulumi.dynatrace.inputs.ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorArgs Empty = new ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorArgs();

    @Import(name="contributionType", required=true)
    private Output<String> contributionType;

    public Output<String> contributionType() {
        return this.contributionType;
    }

    @Import(name="segmentCount")
    private @Nullable Output<Integer> segmentCount;

    public Optional<Output<Integer>> segmentCount() {
        return Optional.ofNullable(this.segmentCount);
    }

    @Import(name="transformations")
    private @Nullable Output<ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorTransformationsArgs> transformations;

    public Optional<Output<ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorTransformationsArgs>> transformations() {
        return Optional.ofNullable(this.transformations);
    }

    @Import(name="valueOverride")
    private @Nullable Output<ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs> valueOverride;

    public Optional<Output<ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs>> valueOverride() {
        return Optional.ofNullable(this.valueOverride);
    }

    private ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorArgs() {}

    private ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorArgs(ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorArgs $) {
        this.contributionType = $.contributionType;
        this.segmentCount = $.segmentCount;
        this.transformations = $.transformations;
        this.valueOverride = $.valueOverride;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorArgs $;

        public Builder() {
            $ = new ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorArgs();
        }

        public Builder(ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorArgs defaults) {
            $ = new ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorArgs(Objects.requireNonNull(defaults));
        }

        public Builder contributionType(Output<String> contributionType) {
            $.contributionType = contributionType;
            return this;
        }

        public Builder contributionType(String contributionType) {
            return contributionType(Output.of(contributionType));
        }

        public Builder segmentCount(@Nullable Output<Integer> segmentCount) {
            $.segmentCount = segmentCount;
            return this;
        }

        public Builder segmentCount(Integer segmentCount) {
            return segmentCount(Output.of(segmentCount));
        }

        public Builder transformations(@Nullable Output<ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorTransformationsArgs> transformations) {
            $.transformations = transformations;
            return this;
        }

        public Builder transformations(ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorTransformationsArgs transformations) {
            return transformations(Output.of(transformations));
        }

        public Builder valueOverride(@Nullable Output<ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs> valueOverride) {
            $.valueOverride = valueOverride;
            return this;
        }

        public Builder valueOverride(ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs valueOverride) {
            return valueOverride(Output.of(valueOverride));
        }

        public ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorArgs build() {
            $.contributionType = Objects.requireNonNull($.contributionType, "expected parameter 'contributionType' to be non-null");
            return $;
        }
    }

}
