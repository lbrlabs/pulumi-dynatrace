// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptEventsEventTapWaitValidationTargetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrowserMonitorScriptEventsEventTapWaitValidationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorScriptEventsEventTapWaitValidationArgs Empty = new BrowserMonitorScriptEventsEventTapWaitValidationArgs();

    @Import(name="failIfFound")
    private @Nullable Output<Boolean> failIfFound;

    public Optional<Output<Boolean>> failIfFound() {
        return Optional.ofNullable(this.failIfFound);
    }

    @Import(name="match")
    private @Nullable Output<String> match;

    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    @Import(name="regex")
    private @Nullable Output<Boolean> regex;

    public Optional<Output<Boolean>> regex() {
        return Optional.ofNullable(this.regex);
    }

    @Import(name="target")
    private @Nullable Output<BrowserMonitorScriptEventsEventTapWaitValidationTargetArgs> target;

    public Optional<Output<BrowserMonitorScriptEventsEventTapWaitValidationTargetArgs>> target() {
        return Optional.ofNullable(this.target);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private BrowserMonitorScriptEventsEventTapWaitValidationArgs() {}

    private BrowserMonitorScriptEventsEventTapWaitValidationArgs(BrowserMonitorScriptEventsEventTapWaitValidationArgs $) {
        this.failIfFound = $.failIfFound;
        this.match = $.match;
        this.regex = $.regex;
        this.target = $.target;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorScriptEventsEventTapWaitValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorScriptEventsEventTapWaitValidationArgs $;

        public Builder() {
            $ = new BrowserMonitorScriptEventsEventTapWaitValidationArgs();
        }

        public Builder(BrowserMonitorScriptEventsEventTapWaitValidationArgs defaults) {
            $ = new BrowserMonitorScriptEventsEventTapWaitValidationArgs(Objects.requireNonNull(defaults));
        }

        public Builder failIfFound(@Nullable Output<Boolean> failIfFound) {
            $.failIfFound = failIfFound;
            return this;
        }

        public Builder failIfFound(Boolean failIfFound) {
            return failIfFound(Output.of(failIfFound));
        }

        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        public Builder match(String match) {
            return match(Output.of(match));
        }

        public Builder regex(@Nullable Output<Boolean> regex) {
            $.regex = regex;
            return this;
        }

        public Builder regex(Boolean regex) {
            return regex(Output.of(regex));
        }

        public Builder target(@Nullable Output<BrowserMonitorScriptEventsEventTapWaitValidationTargetArgs> target) {
            $.target = target;
            return this;
        }

        public Builder target(BrowserMonitorScriptEventsEventTapWaitValidationTargetArgs target) {
            return target(Output.of(target));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public BrowserMonitorScriptEventsEventTapWaitValidationArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
