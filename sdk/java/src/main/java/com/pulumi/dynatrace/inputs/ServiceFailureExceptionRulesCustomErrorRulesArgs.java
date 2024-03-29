// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceFailureExceptionRulesCustomErrorRulesCustomErrorRuleArgs;
import java.util.List;
import java.util.Objects;


public final class ServiceFailureExceptionRulesCustomErrorRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceFailureExceptionRulesCustomErrorRulesArgs Empty = new ServiceFailureExceptionRulesCustomErrorRulesArgs();

    @Import(name="customErrorRules", required=true)
    private Output<List<ServiceFailureExceptionRulesCustomErrorRulesCustomErrorRuleArgs>> customErrorRules;

    public Output<List<ServiceFailureExceptionRulesCustomErrorRulesCustomErrorRuleArgs>> customErrorRules() {
        return this.customErrorRules;
    }

    private ServiceFailureExceptionRulesCustomErrorRulesArgs() {}

    private ServiceFailureExceptionRulesCustomErrorRulesArgs(ServiceFailureExceptionRulesCustomErrorRulesArgs $) {
        this.customErrorRules = $.customErrorRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceFailureExceptionRulesCustomErrorRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceFailureExceptionRulesCustomErrorRulesArgs $;

        public Builder() {
            $ = new ServiceFailureExceptionRulesCustomErrorRulesArgs();
        }

        public Builder(ServiceFailureExceptionRulesCustomErrorRulesArgs defaults) {
            $ = new ServiceFailureExceptionRulesCustomErrorRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder customErrorRules(Output<List<ServiceFailureExceptionRulesCustomErrorRulesCustomErrorRuleArgs>> customErrorRules) {
            $.customErrorRules = customErrorRules;
            return this;
        }

        public Builder customErrorRules(List<ServiceFailureExceptionRulesCustomErrorRulesCustomErrorRuleArgs> customErrorRules) {
            return customErrorRules(Output.of(customErrorRules));
        }

        public Builder customErrorRules(ServiceFailureExceptionRulesCustomErrorRulesCustomErrorRuleArgs... customErrorRules) {
            return customErrorRules(List.of(customErrorRules));
        }

        public ServiceFailureExceptionRulesCustomErrorRulesArgs build() {
            $.customErrorRules = Objects.requireNonNull($.customErrorRules, "expected parameter 'customErrorRules' to be non-null");
            return $;
        }
    }

}
