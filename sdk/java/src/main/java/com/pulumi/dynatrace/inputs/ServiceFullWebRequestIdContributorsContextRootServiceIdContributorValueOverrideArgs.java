// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs Empty = new ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs();

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs() {}

    private ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs(ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs $;

        public Builder() {
            $ = new ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs();
        }

        public Builder(ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs defaults) {
            $ = new ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs(Objects.requireNonNull(defaults));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
