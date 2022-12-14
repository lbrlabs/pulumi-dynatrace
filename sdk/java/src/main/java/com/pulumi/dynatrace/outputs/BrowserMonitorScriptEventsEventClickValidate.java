// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.BrowserMonitorScriptEventsEventClickValidateValidation;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BrowserMonitorScriptEventsEventClickValidate {
    private List<BrowserMonitorScriptEventsEventClickValidateValidation> validations;

    private BrowserMonitorScriptEventsEventClickValidate() {}
    public List<BrowserMonitorScriptEventsEventClickValidateValidation> validations() {
        return this.validations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrowserMonitorScriptEventsEventClickValidate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<BrowserMonitorScriptEventsEventClickValidateValidation> validations;
        public Builder() {}
        public Builder(BrowserMonitorScriptEventsEventClickValidate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.validations = defaults.validations;
        }

        @CustomType.Setter
        public Builder validations(List<BrowserMonitorScriptEventsEventClickValidateValidation> validations) {
            this.validations = Objects.requireNonNull(validations);
            return this;
        }
        public Builder validations(BrowserMonitorScriptEventsEventClickValidateValidation... validations) {
            return validations(List.of(validations));
        }
        public BrowserMonitorScriptEventsEventClickValidate build() {
            final var o = new BrowserMonitorScriptEventsEventClickValidate();
            o.validations = validations;
            return o;
        }
    }
}
