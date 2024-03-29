// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.FailureDetectionParametersExceptionRulesCustomErrorRules;
import com.pulumi.dynatrace.outputs.FailureDetectionParametersExceptionRulesCustomHandledExceptions;
import com.pulumi.dynatrace.outputs.FailureDetectionParametersExceptionRulesIgnoredExceptions;
import com.pulumi.dynatrace.outputs.FailureDetectionParametersExceptionRulesSuccessForcingExceptions;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FailureDetectionParametersExceptionRules {
    /**
     * @return Some custom error situations are only detectable via a return value or other means. To support such cases, [define a request attribute](https://dt-url.net/ys5k0p4y) that captures the required data. Then define a custom error rule that determines if the request has failed based on the value of the request attribute.
     * 
     */
    private @Nullable FailureDetectionParametersExceptionRulesCustomErrorRules customErrorRules;
    /**
     * @return There may be situations where your application code handles exceptions gracefully in a manner that these failures aren&#39;t detected by Dynatrace. Use this setting to define specific gracefully-handled exceptions that should be treated as service failures.
     * 
     */
    private @Nullable FailureDetectionParametersExceptionRulesCustomHandledExceptions customHandledExceptions;
    /**
     * @return Ignore all exceptions
     * 
     */
    private Boolean ignoreAllExceptions;
    /**
     * @return Ignore span failure detection
     * 
     */
    private Boolean ignoreSpanFailureDetection;
    /**
     * @return Some exceptions that are thrown by legacy or 3rd-party code indicate a specific response, not an error. Use this setting to instruct Dynatrace to treat such exceptions as non-failed requests.. If an exception matching any of the defined patterns occurs in a request, it will not be considered as a failure. Other exceptions occurring at the same request might still mark the request as failed.
     * 
     */
    private @Nullable FailureDetectionParametersExceptionRulesIgnoredExceptions ignoredExceptions;
    /**
     * @return Define exceptions which indicate that a service call should not be considered as failed. E.g. an exception indicating that the client aborted the operation.. If an exception matching any of the defined patterns occurs on the entry node of the service, it will be considered successful. Compared to ignored exceptions, the request will be considered successful even if other exceptions occur in the same request.
     * 
     */
    private @Nullable FailureDetectionParametersExceptionRulesSuccessForcingExceptions successForcingExceptions;

    private FailureDetectionParametersExceptionRules() {}
    /**
     * @return Some custom error situations are only detectable via a return value or other means. To support such cases, [define a request attribute](https://dt-url.net/ys5k0p4y) that captures the required data. Then define a custom error rule that determines if the request has failed based on the value of the request attribute.
     * 
     */
    public Optional<FailureDetectionParametersExceptionRulesCustomErrorRules> customErrorRules() {
        return Optional.ofNullable(this.customErrorRules);
    }
    /**
     * @return There may be situations where your application code handles exceptions gracefully in a manner that these failures aren&#39;t detected by Dynatrace. Use this setting to define specific gracefully-handled exceptions that should be treated as service failures.
     * 
     */
    public Optional<FailureDetectionParametersExceptionRulesCustomHandledExceptions> customHandledExceptions() {
        return Optional.ofNullable(this.customHandledExceptions);
    }
    /**
     * @return Ignore all exceptions
     * 
     */
    public Boolean ignoreAllExceptions() {
        return this.ignoreAllExceptions;
    }
    /**
     * @return Ignore span failure detection
     * 
     */
    public Boolean ignoreSpanFailureDetection() {
        return this.ignoreSpanFailureDetection;
    }
    /**
     * @return Some exceptions that are thrown by legacy or 3rd-party code indicate a specific response, not an error. Use this setting to instruct Dynatrace to treat such exceptions as non-failed requests.. If an exception matching any of the defined patterns occurs in a request, it will not be considered as a failure. Other exceptions occurring at the same request might still mark the request as failed.
     * 
     */
    public Optional<FailureDetectionParametersExceptionRulesIgnoredExceptions> ignoredExceptions() {
        return Optional.ofNullable(this.ignoredExceptions);
    }
    /**
     * @return Define exceptions which indicate that a service call should not be considered as failed. E.g. an exception indicating that the client aborted the operation.. If an exception matching any of the defined patterns occurs on the entry node of the service, it will be considered successful. Compared to ignored exceptions, the request will be considered successful even if other exceptions occur in the same request.
     * 
     */
    public Optional<FailureDetectionParametersExceptionRulesSuccessForcingExceptions> successForcingExceptions() {
        return Optional.ofNullable(this.successForcingExceptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailureDetectionParametersExceptionRules defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FailureDetectionParametersExceptionRulesCustomErrorRules customErrorRules;
        private @Nullable FailureDetectionParametersExceptionRulesCustomHandledExceptions customHandledExceptions;
        private Boolean ignoreAllExceptions;
        private Boolean ignoreSpanFailureDetection;
        private @Nullable FailureDetectionParametersExceptionRulesIgnoredExceptions ignoredExceptions;
        private @Nullable FailureDetectionParametersExceptionRulesSuccessForcingExceptions successForcingExceptions;
        public Builder() {}
        public Builder(FailureDetectionParametersExceptionRules defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customErrorRules = defaults.customErrorRules;
    	      this.customHandledExceptions = defaults.customHandledExceptions;
    	      this.ignoreAllExceptions = defaults.ignoreAllExceptions;
    	      this.ignoreSpanFailureDetection = defaults.ignoreSpanFailureDetection;
    	      this.ignoredExceptions = defaults.ignoredExceptions;
    	      this.successForcingExceptions = defaults.successForcingExceptions;
        }

        @CustomType.Setter
        public Builder customErrorRules(@Nullable FailureDetectionParametersExceptionRulesCustomErrorRules customErrorRules) {
            this.customErrorRules = customErrorRules;
            return this;
        }
        @CustomType.Setter
        public Builder customHandledExceptions(@Nullable FailureDetectionParametersExceptionRulesCustomHandledExceptions customHandledExceptions) {
            this.customHandledExceptions = customHandledExceptions;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreAllExceptions(Boolean ignoreAllExceptions) {
            this.ignoreAllExceptions = Objects.requireNonNull(ignoreAllExceptions);
            return this;
        }
        @CustomType.Setter
        public Builder ignoreSpanFailureDetection(Boolean ignoreSpanFailureDetection) {
            this.ignoreSpanFailureDetection = Objects.requireNonNull(ignoreSpanFailureDetection);
            return this;
        }
        @CustomType.Setter
        public Builder ignoredExceptions(@Nullable FailureDetectionParametersExceptionRulesIgnoredExceptions ignoredExceptions) {
            this.ignoredExceptions = ignoredExceptions;
            return this;
        }
        @CustomType.Setter
        public Builder successForcingExceptions(@Nullable FailureDetectionParametersExceptionRulesSuccessForcingExceptions successForcingExceptions) {
            this.successForcingExceptions = successForcingExceptions;
            return this;
        }
        public FailureDetectionParametersExceptionRules build() {
            final var o = new FailureDetectionParametersExceptionRules();
            o.customErrorRules = customErrorRules;
            o.customHandledExceptions = customHandledExceptions;
            o.ignoreAllExceptions = ignoreAllExceptions;
            o.ignoreSpanFailureDetection = ignoreSpanFailureDetection;
            o.ignoredExceptions = ignoredExceptions;
            o.successForcingExceptions = successForcingExceptions;
            return o;
        }
    }
}
