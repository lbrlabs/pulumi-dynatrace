// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ServiceFullWebServiceIdContributorsServerNameServiceIdContributorTransformationsTransformation;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServiceFullWebServiceIdContributorsServerNameServiceIdContributorTransformations {
    private List<ServiceFullWebServiceIdContributorsServerNameServiceIdContributorTransformationsTransformation> transformations;

    private ServiceFullWebServiceIdContributorsServerNameServiceIdContributorTransformations() {}
    public List<ServiceFullWebServiceIdContributorsServerNameServiceIdContributorTransformationsTransformation> transformations() {
        return this.transformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceFullWebServiceIdContributorsServerNameServiceIdContributorTransformations defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ServiceFullWebServiceIdContributorsServerNameServiceIdContributorTransformationsTransformation> transformations;
        public Builder() {}
        public Builder(ServiceFullWebServiceIdContributorsServerNameServiceIdContributorTransformations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transformations = defaults.transformations;
        }

        @CustomType.Setter
        public Builder transformations(List<ServiceFullWebServiceIdContributorsServerNameServiceIdContributorTransformationsTransformation> transformations) {
            this.transformations = Objects.requireNonNull(transformations);
            return this;
        }
        public Builder transformations(ServiceFullWebServiceIdContributorsServerNameServiceIdContributorTransformationsTransformation... transformations) {
            return transformations(List.of(transformations));
        }
        public ServiceFullWebServiceIdContributorsServerNameServiceIdContributorTransformations build() {
            final var o = new ServiceFullWebServiceIdContributorsServerNameServiceIdContributorTransformations();
            o.transformations = transformations;
            return o;
        }
    }
}
