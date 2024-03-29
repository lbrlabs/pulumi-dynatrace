// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsTransformationArgs;
import java.util.List;
import java.util.Objects;


public final class ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsArgs Empty = new ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsArgs();

    @Import(name="transformations", required=true)
    private Output<List<ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsTransformationArgs>> transformations;

    public Output<List<ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsTransformationArgs>> transformations() {
        return this.transformations;
    }

    private ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsArgs() {}

    private ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsArgs(ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsArgs $) {
        this.transformations = $.transformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsArgs $;

        public Builder() {
            $ = new ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsArgs();
        }

        public Builder(ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsArgs defaults) {
            $ = new ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder transformations(Output<List<ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsTransformationArgs>> transformations) {
            $.transformations = transformations;
            return this;
        }

        public Builder transformations(List<ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsTransformationArgs> transformations) {
            return transformations(Output.of(transformations));
        }

        public Builder transformations(ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsTransformationArgs... transformations) {
            return transformations(List.of(transformations));
        }

        public ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributorTransformationsArgs build() {
            $.transformations = Objects.requireNonNull($.transformations, "expected parameter 'transformations' to be non-null");
            return $;
        }
    }

}
