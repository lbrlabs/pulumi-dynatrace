// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.BrowserMonitorScriptEventsEventJavascriptWaitValidation;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BrowserMonitorScriptEventsEventJavascriptWait {
    private @Nullable Integer milliseconds;
    private @Nullable Integer timeout;
    private @Nullable BrowserMonitorScriptEventsEventJavascriptWaitValidation validation;
    private String waitFor;

    private BrowserMonitorScriptEventsEventJavascriptWait() {}
    public Optional<Integer> milliseconds() {
        return Optional.ofNullable(this.milliseconds);
    }
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    public Optional<BrowserMonitorScriptEventsEventJavascriptWaitValidation> validation() {
        return Optional.ofNullable(this.validation);
    }
    public String waitFor() {
        return this.waitFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrowserMonitorScriptEventsEventJavascriptWait defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer milliseconds;
        private @Nullable Integer timeout;
        private @Nullable BrowserMonitorScriptEventsEventJavascriptWaitValidation validation;
        private String waitFor;
        public Builder() {}
        public Builder(BrowserMonitorScriptEventsEventJavascriptWait defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.milliseconds = defaults.milliseconds;
    	      this.timeout = defaults.timeout;
    	      this.validation = defaults.validation;
    	      this.waitFor = defaults.waitFor;
        }

        @CustomType.Setter
        public Builder milliseconds(@Nullable Integer milliseconds) {
            this.milliseconds = milliseconds;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder validation(@Nullable BrowserMonitorScriptEventsEventJavascriptWaitValidation validation) {
            this.validation = validation;
            return this;
        }
        @CustomType.Setter
        public Builder waitFor(String waitFor) {
            this.waitFor = Objects.requireNonNull(waitFor);
            return this;
        }
        public BrowserMonitorScriptEventsEventJavascriptWait build() {
            final var o = new BrowserMonitorScriptEventsEventJavascriptWait();
            o.milliseconds = milliseconds;
            o.timeout = timeout;
            o.validation = validation;
            o.waitFor = waitFor;
            return o;
        }
    }
}
