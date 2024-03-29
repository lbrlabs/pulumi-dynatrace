// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsTransformationArgs;
import java.util.List;
import java.util.Objects;


public final class ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsArgs Empty = new ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsArgs();

    @Import(name="transformations", required=true)
    private Output<List<ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsTransformationArgs>> transformations;

    public Output<List<ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsTransformationArgs>> transformations() {
        return this.transformations;
    }

    private ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsArgs() {}

    private ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsArgs(ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsArgs $) {
        this.transformations = $.transformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsArgs $;

        public Builder() {
            $ = new ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsArgs();
        }

        public Builder(ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsArgs defaults) {
            $ = new ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder transformations(Output<List<ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsTransformationArgs>> transformations) {
            $.transformations = transformations;
            return this;
        }

        public Builder transformations(List<ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsTransformationArgs> transformations) {
            return transformations(Output.of(transformations));
        }

        public Builder transformations(ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsTransformationArgs... transformations) {
            return transformations(List.of(transformations));
        }

        public ServiceFullWebServiceIdContributorsContextRootServiceIdContributorTransformationsArgs build() {
            $.transformations = Objects.requireNonNull($.transformations, "expected parameter 'transformations' to be non-null");
            return $;
        }
    }

}
