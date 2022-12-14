// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptEventsEventTapTargetArgs;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptEventsEventTapValidateArgs;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptEventsEventTapWaitArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrowserMonitorScriptEventsEventTapArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorScriptEventsEventTapArgs Empty = new BrowserMonitorScriptEventsEventTapArgs();

    @Import(name="button", required=true)
    private Output<Integer> button;

    public Output<Integer> button() {
        return this.button;
    }

    @Import(name="target")
    private @Nullable Output<BrowserMonitorScriptEventsEventTapTargetArgs> target;

    public Optional<Output<BrowserMonitorScriptEventsEventTapTargetArgs>> target() {
        return Optional.ofNullable(this.target);
    }

    @Import(name="validate")
    private @Nullable Output<BrowserMonitorScriptEventsEventTapValidateArgs> validate;

    public Optional<Output<BrowserMonitorScriptEventsEventTapValidateArgs>> validate() {
        return Optional.ofNullable(this.validate);
    }

    @Import(name="wait")
    private @Nullable Output<BrowserMonitorScriptEventsEventTapWaitArgs> wait;

    public Optional<Output<BrowserMonitorScriptEventsEventTapWaitArgs>> wait_() {
        return Optional.ofNullable(this.wait);
    }

    private BrowserMonitorScriptEventsEventTapArgs() {}

    private BrowserMonitorScriptEventsEventTapArgs(BrowserMonitorScriptEventsEventTapArgs $) {
        this.button = $.button;
        this.target = $.target;
        this.validate = $.validate;
        this.wait = $.wait;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorScriptEventsEventTapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorScriptEventsEventTapArgs $;

        public Builder() {
            $ = new BrowserMonitorScriptEventsEventTapArgs();
        }

        public Builder(BrowserMonitorScriptEventsEventTapArgs defaults) {
            $ = new BrowserMonitorScriptEventsEventTapArgs(Objects.requireNonNull(defaults));
        }

        public Builder button(Output<Integer> button) {
            $.button = button;
            return this;
        }

        public Builder button(Integer button) {
            return button(Output.of(button));
        }

        public Builder target(@Nullable Output<BrowserMonitorScriptEventsEventTapTargetArgs> target) {
            $.target = target;
            return this;
        }

        public Builder target(BrowserMonitorScriptEventsEventTapTargetArgs target) {
            return target(Output.of(target));
        }

        public Builder validate(@Nullable Output<BrowserMonitorScriptEventsEventTapValidateArgs> validate) {
            $.validate = validate;
            return this;
        }

        public Builder validate(BrowserMonitorScriptEventsEventTapValidateArgs validate) {
            return validate(Output.of(validate));
        }

        public Builder wait_(@Nullable Output<BrowserMonitorScriptEventsEventTapWaitArgs> wait) {
            $.wait = wait;
            return this;
        }

        public Builder wait_(BrowserMonitorScriptEventsEventTapWaitArgs wait) {
            return wait_(Output.of(wait));
        }

        public BrowserMonitorScriptEventsEventTapArgs build() {
            $.button = Objects.requireNonNull($.button, "expected parameter 'button' to be non-null");
            return $;
        }
    }

}
