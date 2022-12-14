// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptEventsEventNavigateValidateValidationTargetLocatorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrowserMonitorScriptEventsEventNavigateValidateValidationTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorScriptEventsEventNavigateValidateValidationTargetArgs Empty = new BrowserMonitorScriptEventsEventNavigateValidateValidationTargetArgs();

    @Import(name="locators")
    private @Nullable Output<List<BrowserMonitorScriptEventsEventNavigateValidateValidationTargetLocatorArgs>> locators;

    public Optional<Output<List<BrowserMonitorScriptEventsEventNavigateValidateValidationTargetLocatorArgs>>> locators() {
        return Optional.ofNullable(this.locators);
    }

    @Import(name="window")
    private @Nullable Output<String> window;

    public Optional<Output<String>> window() {
        return Optional.ofNullable(this.window);
    }

    private BrowserMonitorScriptEventsEventNavigateValidateValidationTargetArgs() {}

    private BrowserMonitorScriptEventsEventNavigateValidateValidationTargetArgs(BrowserMonitorScriptEventsEventNavigateValidateValidationTargetArgs $) {
        this.locators = $.locators;
        this.window = $.window;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorScriptEventsEventNavigateValidateValidationTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorScriptEventsEventNavigateValidateValidationTargetArgs $;

        public Builder() {
            $ = new BrowserMonitorScriptEventsEventNavigateValidateValidationTargetArgs();
        }

        public Builder(BrowserMonitorScriptEventsEventNavigateValidateValidationTargetArgs defaults) {
            $ = new BrowserMonitorScriptEventsEventNavigateValidateValidationTargetArgs(Objects.requireNonNull(defaults));
        }

        public Builder locators(@Nullable Output<List<BrowserMonitorScriptEventsEventNavigateValidateValidationTargetLocatorArgs>> locators) {
            $.locators = locators;
            return this;
        }

        public Builder locators(List<BrowserMonitorScriptEventsEventNavigateValidateValidationTargetLocatorArgs> locators) {
            return locators(Output.of(locators));
        }

        public Builder locators(BrowserMonitorScriptEventsEventNavigateValidateValidationTargetLocatorArgs... locators) {
            return locators(List.of(locators));
        }

        public Builder window(@Nullable Output<String> window) {
            $.window = window;
            return this;
        }

        public Builder window(String window) {
            return window(Output.of(window));
        }

        public BrowserMonitorScriptEventsEventNavigateValidateValidationTargetArgs build() {
            return $;
        }
    }

}
