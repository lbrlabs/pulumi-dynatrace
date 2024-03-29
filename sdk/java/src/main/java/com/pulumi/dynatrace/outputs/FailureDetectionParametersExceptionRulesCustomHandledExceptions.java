// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.FailureDetectionParametersExceptionRulesCustomHandledExceptionsCustomHandledException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FailureDetectionParametersExceptionRulesCustomHandledExceptions {
    private List<FailureDetectionParametersExceptionRulesCustomHandledExceptionsCustomHandledException> customHandledExceptions;

    private FailureDetectionParametersExceptionRulesCustomHandledExceptions() {}
    public List<FailureDetectionParametersExceptionRulesCustomHandledExceptionsCustomHandledException> customHandledExceptions() {
        return this.customHandledExceptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailureDetectionParametersExceptionRulesCustomHandledExceptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<FailureDetectionParametersExceptionRulesCustomHandledExceptionsCustomHandledException> customHandledExceptions;
        public Builder() {}
        public Builder(FailureDetectionParametersExceptionRulesCustomHandledExceptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHandledExceptions = defaults.customHandledExceptions;
        }

        @CustomType.Setter
        public Builder customHandledExceptions(List<FailureDetectionParametersExceptionRulesCustomHandledExceptionsCustomHandledException> customHandledExceptions) {
            this.customHandledExceptions = Objects.requireNonNull(customHandledExceptions);
            return this;
        }
        public Builder customHandledExceptions(FailureDetectionParametersExceptionRulesCustomHandledExceptionsCustomHandledException... customHandledExceptions) {
            return customHandledExceptions(List.of(customHandledExceptions));
        }
        public FailureDetectionParametersExceptionRulesCustomHandledExceptions build() {
            final var o = new FailureDetectionParametersExceptionRulesCustomHandledExceptions();
            o.customHandledExceptions = customHandledExceptions;
            return o;
        }
    }
}
