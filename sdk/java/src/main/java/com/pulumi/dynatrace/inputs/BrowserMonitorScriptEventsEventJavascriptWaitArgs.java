// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptEventsEventJavascriptWaitValidationArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrowserMonitorScriptEventsEventJavascriptWaitArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorScriptEventsEventJavascriptWaitArgs Empty = new BrowserMonitorScriptEventsEventJavascriptWaitArgs();

    @Import(name="milliseconds")
    private @Nullable Output<Integer> milliseconds;

    public Optional<Output<Integer>> milliseconds() {
        return Optional.ofNullable(this.milliseconds);
    }

    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    @Import(name="validation")
    private @Nullable Output<BrowserMonitorScriptEventsEventJavascriptWaitValidationArgs> validation;

    public Optional<Output<BrowserMonitorScriptEventsEventJavascriptWaitValidationArgs>> validation() {
        return Optional.ofNullable(this.validation);
    }

    @Import(name="waitFor", required=true)
    private Output<String> waitFor;

    public Output<String> waitFor() {
        return this.waitFor;
    }

    private BrowserMonitorScriptEventsEventJavascriptWaitArgs() {}

    private BrowserMonitorScriptEventsEventJavascriptWaitArgs(BrowserMonitorScriptEventsEventJavascriptWaitArgs $) {
        this.milliseconds = $.milliseconds;
        this.timeout = $.timeout;
        this.validation = $.validation;
        this.waitFor = $.waitFor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorScriptEventsEventJavascriptWaitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorScriptEventsEventJavascriptWaitArgs $;

        public Builder() {
            $ = new BrowserMonitorScriptEventsEventJavascriptWaitArgs();
        }

        public Builder(BrowserMonitorScriptEventsEventJavascriptWaitArgs defaults) {
            $ = new BrowserMonitorScriptEventsEventJavascriptWaitArgs(Objects.requireNonNull(defaults));
        }

        public Builder milliseconds(@Nullable Output<Integer> milliseconds) {
            $.milliseconds = milliseconds;
            return this;
        }

        public Builder milliseconds(Integer milliseconds) {
            return milliseconds(Output.of(milliseconds));
        }

        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        public Builder validation(@Nullable Output<BrowserMonitorScriptEventsEventJavascriptWaitValidationArgs> validation) {
            $.validation = validation;
            return this;
        }

        public Builder validation(BrowserMonitorScriptEventsEventJavascriptWaitValidationArgs validation) {
            return validation(Output.of(validation));
        }

        public Builder waitFor(Output<String> waitFor) {
            $.waitFor = waitFor;
            return this;
        }

        public Builder waitFor(String waitFor) {
            return waitFor(Output.of(waitFor));
        }

        public BrowserMonitorScriptEventsEventJavascriptWaitArgs build() {
            $.waitFor = Objects.requireNonNull($.waitFor, "expected parameter 'waitFor' to be non-null");
            return $;
        }
    }

}
