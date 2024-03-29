// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributorTransformations;
import com.pulumi.dynatrace.outputs.ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributorValueOverride;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributor {
    private String contributionType;
    private @Nullable ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributorTransformations transformations;
    private @Nullable ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributorValueOverride valueOverride;

    private ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributor() {}
    public String contributionType() {
        return this.contributionType;
    }
    public Optional<ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributorTransformations> transformations() {
        return Optional.ofNullable(this.transformations);
    }
    public Optional<ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributorValueOverride> valueOverride() {
        return Optional.ofNullable(this.valueOverride);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contributionType;
        private @Nullable ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributorTransformations transformations;
        private @Nullable ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributorValueOverride valueOverride;
        public Builder() {}
        public Builder(ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contributionType = defaults.contributionType;
    	      this.transformations = defaults.transformations;
    	      this.valueOverride = defaults.valueOverride;
        }

        @CustomType.Setter
        public Builder contributionType(String contributionType) {
            this.contributionType = Objects.requireNonNull(contributionType);
            return this;
        }
        @CustomType.Setter
        public Builder transformations(@Nullable ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributorTransformations transformations) {
            this.transformations = transformations;
            return this;
        }
        @CustomType.Setter
        public Builder valueOverride(@Nullable ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributorValueOverride valueOverride) {
            this.valueOverride = valueOverride;
            return this;
        }
        public ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributor build() {
            final var o = new ServiceExternalWebServiceIdContributorsUrlPathServiceIdContributor();
            o.contributionType = contributionType;
            o.transformations = transformations;
            o.valueOverride = valueOverride;
            return o;
        }
    }
}
