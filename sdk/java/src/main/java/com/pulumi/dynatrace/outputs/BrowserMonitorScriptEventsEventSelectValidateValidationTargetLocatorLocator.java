// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BrowserMonitorScriptEventsEventSelectValidateValidationTargetLocatorLocator {
    private String type;
    private String value;

    private BrowserMonitorScriptEventsEventSelectValidateValidationTargetLocatorLocator() {}
    public String type() {
        return this.type;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrowserMonitorScriptEventsEventSelectValidateValidationTargetLocatorLocator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private String value;
        public Builder() {}
        public Builder(BrowserMonitorScriptEventsEventSelectValidateValidationTargetLocatorLocator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public BrowserMonitorScriptEventsEventSelectValidateValidationTargetLocatorLocator build() {
            final var o = new BrowserMonitorScriptEventsEventSelectValidateValidationTargetLocatorLocator();
            o.type = type;
            o.value = value;
            return o;
        }
    }
}
