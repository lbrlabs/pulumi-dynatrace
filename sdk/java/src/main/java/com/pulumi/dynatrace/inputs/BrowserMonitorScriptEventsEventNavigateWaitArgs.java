// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptEventsEventNavigateWaitValidationArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrowserMonitorScriptEventsEventNavigateWaitArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorScriptEventsEventNavigateWaitArgs Empty = new BrowserMonitorScriptEventsEventNavigateWaitArgs();

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
    private @Nullable Output<BrowserMonitorScriptEventsEventNavigateWaitValidationArgs> validation;

    public Optional<Output<BrowserMonitorScriptEventsEventNavigateWaitValidationArgs>> validation() {
        return Optional.ofNullable(this.validation);
    }

    @Import(name="waitFor", required=true)
    private Output<String> waitFor;

    public Output<String> waitFor() {
        return this.waitFor;
    }

    private BrowserMonitorScriptEventsEventNavigateWaitArgs() {}

    private BrowserMonitorScriptEventsEventNavigateWaitArgs(BrowserMonitorScriptEventsEventNavigateWaitArgs $) {
        this.milliseconds = $.milliseconds;
        this.timeout = $.timeout;
        this.validation = $.validation;
        this.waitFor = $.waitFor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorScriptEventsEventNavigateWaitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorScriptEventsEventNavigateWaitArgs $;

        public Builder() {
            $ = new BrowserMonitorScriptEventsEventNavigateWaitArgs();
        }

        public Builder(BrowserMonitorScriptEventsEventNavigateWaitArgs defaults) {
            $ = new BrowserMonitorScriptEventsEventNavigateWaitArgs(Objects.requireNonNull(defaults));
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

        public Builder validation(@Nullable Output<BrowserMonitorScriptEventsEventNavigateWaitValidationArgs> validation) {
            $.validation = validation;
            return this;
        }

        public Builder validation(BrowserMonitorScriptEventsEventNavigateWaitValidationArgs validation) {
            return validation(Output.of(validation));
        }

        public Builder waitFor(Output<String> waitFor) {
            $.waitFor = waitFor;
            return this;
        }

        public Builder waitFor(String waitFor) {
            return waitFor(Output.of(waitFor));
        }

        public BrowserMonitorScriptEventsEventNavigateWaitArgs build() {
            $.waitFor = Objects.requireNonNull($.waitFor, "expected parameter 'waitFor' to be non-null");
            return $;
        }
    }

}
