// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceFullWebServiceConditionsConditionArgs;
import java.util.List;
import java.util.Objects;


public final class ServiceFullWebServiceConditionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceFullWebServiceConditionsArgs Empty = new ServiceFullWebServiceConditionsArgs();

    @Import(name="conditions", required=true)
    private Output<List<ServiceFullWebServiceConditionsConditionArgs>> conditions;

    public Output<List<ServiceFullWebServiceConditionsConditionArgs>> conditions() {
        return this.conditions;
    }

    private ServiceFullWebServiceConditionsArgs() {}

    private ServiceFullWebServiceConditionsArgs(ServiceFullWebServiceConditionsArgs $) {
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceFullWebServiceConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceFullWebServiceConditionsArgs $;

        public Builder() {
            $ = new ServiceFullWebServiceConditionsArgs();
        }

        public Builder(ServiceFullWebServiceConditionsArgs defaults) {
            $ = new ServiceFullWebServiceConditionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditions(Output<List<ServiceFullWebServiceConditionsConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<ServiceFullWebServiceConditionsConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(ServiceFullWebServiceConditionsConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public ServiceFullWebServiceConditionsArgs build() {
            $.conditions = Objects.requireNonNull($.conditions, "expected parameter 'conditions' to be non-null");
            return $;
        }
    }

}
