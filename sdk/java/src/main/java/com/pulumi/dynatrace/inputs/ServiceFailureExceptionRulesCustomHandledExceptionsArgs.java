// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceFailureExceptionRulesCustomHandledExceptionsCustomHandledExceptionArgs;
import java.util.List;
import java.util.Objects;


public final class ServiceFailureExceptionRulesCustomHandledExceptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceFailureExceptionRulesCustomHandledExceptionsArgs Empty = new ServiceFailureExceptionRulesCustomHandledExceptionsArgs();

    @Import(name="customHandledExceptions", required=true)
    private Output<List<ServiceFailureExceptionRulesCustomHandledExceptionsCustomHandledExceptionArgs>> customHandledExceptions;

    public Output<List<ServiceFailureExceptionRulesCustomHandledExceptionsCustomHandledExceptionArgs>> customHandledExceptions() {
        return this.customHandledExceptions;
    }

    private ServiceFailureExceptionRulesCustomHandledExceptionsArgs() {}

    private ServiceFailureExceptionRulesCustomHandledExceptionsArgs(ServiceFailureExceptionRulesCustomHandledExceptionsArgs $) {
        this.customHandledExceptions = $.customHandledExceptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceFailureExceptionRulesCustomHandledExceptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceFailureExceptionRulesCustomHandledExceptionsArgs $;

        public Builder() {
            $ = new ServiceFailureExceptionRulesCustomHandledExceptionsArgs();
        }

        public Builder(ServiceFailureExceptionRulesCustomHandledExceptionsArgs defaults) {
            $ = new ServiceFailureExceptionRulesCustomHandledExceptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder customHandledExceptions(Output<List<ServiceFailureExceptionRulesCustomHandledExceptionsCustomHandledExceptionArgs>> customHandledExceptions) {
            $.customHandledExceptions = customHandledExceptions;
            return this;
        }

        public Builder customHandledExceptions(List<ServiceFailureExceptionRulesCustomHandledExceptionsCustomHandledExceptionArgs> customHandledExceptions) {
            return customHandledExceptions(Output.of(customHandledExceptions));
        }

        public Builder customHandledExceptions(ServiceFailureExceptionRulesCustomHandledExceptionsCustomHandledExceptionArgs... customHandledExceptions) {
            return customHandledExceptions(List.of(customHandledExceptions));
        }

        public ServiceFailureExceptionRulesCustomHandledExceptionsArgs build() {
            $.customHandledExceptions = Objects.requireNonNull($.customHandledExceptions, "expected parameter 'customHandledExceptions' to be non-null");
            return $;
        }
    }

}
