// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceExternalWebRequestIdContributorsPublicDomainNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceExternalWebRequestIdContributorsPublicDomainNameArgs Empty = new ServiceExternalWebRequestIdContributorsPublicDomainNameArgs();

    @Import(name="enableIdContributor", required=true)
    private Output<Boolean> enableIdContributor;

    public Output<Boolean> enableIdContributor() {
        return this.enableIdContributor;
    }

    @Import(name="serviceIdContributor")
    private @Nullable Output<ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorArgs> serviceIdContributor;

    public Optional<Output<ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorArgs>> serviceIdContributor() {
        return Optional.ofNullable(this.serviceIdContributor);
    }

    private ServiceExternalWebRequestIdContributorsPublicDomainNameArgs() {}

    private ServiceExternalWebRequestIdContributorsPublicDomainNameArgs(ServiceExternalWebRequestIdContributorsPublicDomainNameArgs $) {
        this.enableIdContributor = $.enableIdContributor;
        this.serviceIdContributor = $.serviceIdContributor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceExternalWebRequestIdContributorsPublicDomainNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceExternalWebRequestIdContributorsPublicDomainNameArgs $;

        public Builder() {
            $ = new ServiceExternalWebRequestIdContributorsPublicDomainNameArgs();
        }

        public Builder(ServiceExternalWebRequestIdContributorsPublicDomainNameArgs defaults) {
            $ = new ServiceExternalWebRequestIdContributorsPublicDomainNameArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableIdContributor(Output<Boolean> enableIdContributor) {
            $.enableIdContributor = enableIdContributor;
            return this;
        }

        public Builder enableIdContributor(Boolean enableIdContributor) {
            return enableIdContributor(Output.of(enableIdContributor));
        }

        public Builder serviceIdContributor(@Nullable Output<ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorArgs> serviceIdContributor) {
            $.serviceIdContributor = serviceIdContributor;
            return this;
        }

        public Builder serviceIdContributor(ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorArgs serviceIdContributor) {
            return serviceIdContributor(Output.of(serviceIdContributor));
        }

        public ServiceExternalWebRequestIdContributorsPublicDomainNameArgs build() {
            $.enableIdContributor = Objects.requireNonNull($.enableIdContributor, "expected parameter 'enableIdContributor' to be non-null");
            return $;
        }
    }

}
